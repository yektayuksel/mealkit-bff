package com.mealkit.bff.api.model.product.response;

import com.mealkit.bff.api.model.product.request.ProductIngredientInputDto;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;


@Data
@AllArgsConstructor
@NoArgsConstructor
public class ProductApiOutput {

    private Long id;
    private String productName;
    private String description;
    private String imageUrl;
    private String recipe;
    private Double price;
    private Integer cookingTime;
    private Long calories;
    private String difficulty;

    private List<ProductStockResponseDto> ingredients;

    private List<Long> tagIds;

}
