package com.mealkit.bff.api.client.product;


import com.mealkit.bff.api.model.product.request.ProductApiInput;
import com.mealkit.bff.api.model.product.response.ProductApiOutput;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@FeignClient(value="productService", url = "http://localhost:8081/api/product")
public interface ProductClient {

    @GetMapping("/getProductById/{productId}")
    ResponseEntity<ProductApiOutput> getProductById(@PathVariable Long productId);
    @PostMapping("/getByIds")
    ResponseEntity<List<ProductApiOutput>> getProductsById(@RequestBody List<Long> productIdList);
    @PostMapping("/getByTags")
    ResponseEntity<List<ProductApiOutput>> getProductByTag(@RequestBody List<Long> tagIdList);
    @DeleteMapping("/deleteProduct/{productId}")
    ResponseEntity<Void> deleteProduct(@PathVariable Long productId);

    @PutMapping("/updateProduct")
    ResponseEntity<Void> updateProduct(@RequestBody ProductApiInput productApiInput);
    @PostMapping("/createProduct")
    ResponseEntity<Void> createProduct(@RequestBody ProductApiInput productApiInput);

}
