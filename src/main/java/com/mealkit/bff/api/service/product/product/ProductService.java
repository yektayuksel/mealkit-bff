package com.mealkit.bff.api.service.product.product;

import com.mealkit.bff.api.model.product.request.ProductApiInput;
import com.mealkit.bff.api.model.product.response.ProductApiOutput;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface ProductService {

    ResponseEntity<ProductApiOutput> getProductById (Long productId) throws Exception;

    ResponseEntity<List<ProductApiOutput>> getProductsById(List<Long> productIdList);

    ResponseEntity<List<ProductApiOutput>> getProductByTag(List<Long> tagIdList);

    void deleteProduct(Long productId);

    void updateProduct(ProductApiInput productApiInput);

    void createProduct(ProductApiInput productApiInput);
}
