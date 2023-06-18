package com.mealkit.bff.web.stock;


import com.mealkit.bff.api.model.stock.request.RequestStock;
import com.mealkit.bff.api.model.stock.request.RequestUpdateStock;
import com.mealkit.bff.api.model.stock.response.ResponseStock;
import com.mealkit.bff.api.service.stock.StockService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/stock")
public class StockWebApi {

    private final StockService stockService;
    @GetMapping("/getAllStock")
    public ResponseEntity<List<ResponseStock>> getAllStock() {
        return stockService.getAllStock();
    }

    @GetMapping("/getStockById/{id}")
    public ResponseEntity<ResponseStock> getStockById(@PathVariable Long id) {
        return stockService.getStockById(id);
    }

    @PostMapping("/createStock")
    public ResponseEntity<Void> createStock(@RequestBody RequestStock requestStock) {
        stockService.createStock(requestStock);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @PutMapping("/updateStock")
    public ResponseEntity<Void> updateStock(@RequestBody RequestUpdateStock requestUpdateStock) {
        stockService.updateStock(requestUpdateStock);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @DeleteMapping("/deleteStock/{id}")
    public ResponseEntity<Void> deleteStock(@PathVariable Long id) {
        stockService.deleteStock(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
