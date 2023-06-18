package com.mealkit.bff.api.service.stock;

import com.mealkit.bff.api.model.product.request.TagApiInput;
import com.mealkit.bff.api.model.product.response.TagApiOutput;
import com.mealkit.bff.api.model.stock.request.RequestStock;
import com.mealkit.bff.api.model.stock.request.RequestUpdateStock;
import com.mealkit.bff.api.model.stock.response.ResponseStock;
import org.springframework.http.ResponseEntity;

import java.util.HashMap;
import java.util.List;

public interface StockService {

    ResponseEntity<List<ResponseStock>> getAllStock();

    ResponseEntity<ResponseStock> getStockById(Long id);

    void createStock(RequestStock requestStock);
    void updateStock(RequestUpdateStock requestUpdateStock);
    void deleteStock(Long id);
}
