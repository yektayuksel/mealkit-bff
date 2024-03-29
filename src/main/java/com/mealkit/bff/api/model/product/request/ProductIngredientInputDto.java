package com.mealkit.bff.api.model.product.request;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ProductIngredientInputDto {
    private Long id;
    private Integer count;
}
