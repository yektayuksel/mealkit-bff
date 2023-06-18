package com.mealkit.bff.api.model.product.request;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ProductApiInput {

    private String productName;
    private String description;
    private byte[] image;
    private String recipe;
    private Double price;

    private List<ProductIngredientDto> ingredients;

    private List<Long> tagIds;
}
