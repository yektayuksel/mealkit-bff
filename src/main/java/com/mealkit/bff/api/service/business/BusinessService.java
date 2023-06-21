package com.mealkit.bff.api.service.business;

import com.mealkit.bff.api.model.product.response.FullProductApiOutput;
import com.mealkit.bff.api.model.product.response.ProductApiOutput;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface BusinessService {

    public ResponseEntity<FullProductApiOutput> getProductById(Long productId);
}
