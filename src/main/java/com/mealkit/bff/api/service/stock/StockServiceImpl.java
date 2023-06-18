package com.mealkit.bff.api.service.stock;

import com.mealkit.bff.api.client.stock.StockClient;
import com.mealkit.bff.api.model.stock.request.RequestStock;
import com.mealkit.bff.api.model.stock.request.RequestUpdateStock;
import com.mealkit.bff.api.model.stock.response.ResponseStock;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;

@Service
@RequiredArgsConstructor
public class StockServiceImpl implements StockService {

    private final StockClient stockClient;

    @Override
    public ResponseEntity<List<ResponseStock>> getAllStock() {
        return stockClient.getAllStock();
    }

    @Override
    public ResponseEntity<ResponseStock> getStockById(Long id) {
        return stockClient.getStockById(id);
    }

    @Override
    public void createStock(RequestStock requestStock) {
        stockClient.createStock(requestStock);
    }

    @Override
    public void updateStock(RequestUpdateStock requestUpdateStock) {
        stockClient.updateStock(requestUpdateStock);
    }

    @Override
    public void deleteStock(Long id) {
        stockClient.deleteStock(id);
    }
}
