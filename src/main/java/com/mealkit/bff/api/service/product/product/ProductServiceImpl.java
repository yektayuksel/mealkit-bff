package com.mealkit.bff.api.service.product.product;

import com.mealkit.bff.api.client.product.ProductClient;
import com.mealkit.bff.api.model.product.request.ProductApiInput;
import com.mealkit.bff.api.model.product.response.ProductApiOutput;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ProductServiceImpl implements ProductService{

    private final ProductClient productClient;

    @Override
    public ResponseEntity<ProductApiOutput> getProductById(Long productId) throws Exception {
        return productClient.getProductById(productId);
    }

    @Override
    public ResponseEntity<List<ProductApiOutput>> getProductsById(List<Long> productIdList) {
        return productClient.getProductsById(productIdList);
    }

    @Override
    public ResponseEntity<List<ProductApiOutput>> getProductByTag(List<Long> tagIdList) {
        return productClient.getProductByTag(tagIdList);
    }

    @Override
    public void deleteProduct(Long productId) {
        productClient.deleteProduct(productId);
    }

    @Override
    public void updateProduct(ProductApiInput productApiInput) {
        productClient.updateProduct(productApiInput);
    }

    @Override
    public void createProduct(ProductApiInput productApiInput) {
        productClient.createProduct(productApiInput);
    }
}
