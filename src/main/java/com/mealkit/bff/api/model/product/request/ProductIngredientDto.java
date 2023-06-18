package com.mealkit.bff.api.model.product.request;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ProductIngredientDto {
    private Long id;
    private Integer amount;
}
