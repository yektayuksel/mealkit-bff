package com.mealkit.bff.api.model.product.response;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ProductIngredientOutputDto {
    private Long id;
    private Integer count;
}
