package com.mealkit.bff.api.client.stock;


import com.mealkit.bff.api.model.stock.request.RequestStock;
import com.mealkit.bff.api.model.stock.request.RequestUpdateStock;
import com.mealkit.bff.api.model.stock.response.ResponseStock;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@FeignClient(value =  "stockService", url = "http://localhost:8083/api/v1/stocks")
public interface StockClient {

    @GetMapping
    ResponseEntity<List<ResponseStock>> getAllStock();

    @GetMapping("/{id}")
    ResponseEntity<ResponseStock> getStockById(@PathVariable Long id);

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    void createStock(@RequestBody RequestStock requestStock);

    @PutMapping
    @ResponseStatus(HttpStatus.OK)
    void updateStock(@RequestBody RequestUpdateStock requestUpdateStock);


    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.GONE)
    void deleteStock(@PathVariable Long id);

}
