package com.mealkit.bff.web.product;


import com.mealkit.bff.api.model.product.request.ProductApiInput;
import com.mealkit.bff.api.model.product.response.ProductApiOutput;
import com.mealkit.bff.api.service.product.product.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/product")
public class ProductWebApi {

    private final ProductService productService;
    @GetMapping("/getProductById/{productId}")
    public ResponseEntity<ProductApiOutput> getProductById(@PathVariable Long productId) throws Exception {
        return productService.getProductById(productId);
    }

    @PostMapping("/getProductsById")
    public ResponseEntity<List<ProductApiOutput>> getProductsById(@RequestBody List<Long> productIdList) {
        return productService.getProductsById(productIdList);
    }

    @PostMapping("/getProductsByTag")
    public ResponseEntity<List<ProductApiOutput>> getProductByTag(@RequestBody List<Long> tagIdList) {
        return productService.getProductByTag(tagIdList);
    }

    @DeleteMapping("/deleteProduct/{productId}")
    public ResponseEntity<Void> deleteProduct(@PathVariable Long productId) {
        productService.deleteProduct(productId);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @PutMapping("/updateProduct")
    public ResponseEntity<Void> updateProduct(@RequestBody ProductApiInput productApiInput) {
        productService.updateProduct(productApiInput);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @PostMapping("/createProduct")
    public ResponseEntity<Void> createProduct(@RequestBody ProductApiInput productApiInput) {
        productService.createProduct(productApiInput);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
