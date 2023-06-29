package com.mealkit.bff.api.service.business;

import com.mealkit.bff.api.client.product.ProductClient;
import com.mealkit.bff.api.client.stock.StockClient;
import com.mealkit.bff.api.model.product.response.FullProductApiOutput;
import com.mealkit.bff.api.model.product.response.ProductApiOutput;
import com.mealkit.bff.api.model.product.response.ProductStockResponseDto;
import com.mealkit.bff.api.model.stock.response.ResponseStock;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class BusinessServiceImpl implements BusinessService{

    private final ProductClient productClient;
    private final StockClient stockClient;

    public ResponseEntity<FullProductApiOutput> getProductById(Long productId){
        ProductApiOutput productApiOutput = productClient.getProductById(productId).getBody();

        List<ProductStockResponseDto> productStockResponseDtoList = productApiOutput.getIngredients();

        List<Long> ingredientIds = new ArrayList<>();
        for(ProductStockResponseDto productStockResponseDto : productStockResponseDtoList){
            ingredientIds.add(productStockResponseDto.getId());
        }

        List<ResponseStock> ingredientApiOutputList = stockClient.getAllStocks(ingredientIds).getBody();

        FullProductApiOutput fullProductApiOutput = new FullProductApiOutput();

        for(int i = 0; i < ingredientApiOutputList.size(); i++){
            ingredientApiOutputList.get(i).setCount(productStockResponseDtoList.get(i).getCount());
        }


        fullProductApiOutput.setId(productApiOutput.getId());
        fullProductApiOutput.setCalories(productApiOutput.getCalories());
        fullProductApiOutput.setDescription(productApiOutput.getDescription());
        fullProductApiOutput.setProductName(productApiOutput.getProductName());
        fullProductApiOutput.setDifficulty(productApiOutput.getDifficulty());
        fullProductApiOutput.setIngredients(ingredientApiOutputList);
        fullProductApiOutput.setPrice(productApiOutput.getPrice());
        fullProductApiOutput.setRecipe(productApiOutput.getRecipe());
        fullProductApiOutput.setTagIds(productApiOutput.getTagIds());
        fullProductApiOutput.setCookingTime(productApiOutput.getCookingTime());
        fullProductApiOutput.setImageUrl(productApiOutput.getImageUrl());

        return new ResponseEntity<>(fullProductApiOutput, HttpStatus.OK);
    }
}
