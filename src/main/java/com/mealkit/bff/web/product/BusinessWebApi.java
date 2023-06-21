package com.mealkit.bff.web.product;

import com.mealkit.bff.api.model.product.response.FullProductApiOutput;
import com.mealkit.bff.api.service.business.BusinessService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/business")
public class BusinessWebApi {

    private final BusinessService businessService;

    @GetMapping("/getProductById/{productId}")
    public ResponseEntity<FullProductApiOutput> getProductById(@PathVariable Long productId) throws Exception {
        return businessService.getProductById(productId);
    }
}
