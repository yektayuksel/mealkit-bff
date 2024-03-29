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
    private String imageUrl;
    private String recipe;
    private Double price;
    private Integer cookingTime;
    private Long calories;
    private String difficulty;
    private List<ProductIngredientInputDto> ingredients;

    private List<Long> tagIds;
}
