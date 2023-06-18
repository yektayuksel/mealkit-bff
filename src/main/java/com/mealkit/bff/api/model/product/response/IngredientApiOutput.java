package com.mealkit.bff.api.model.product.response;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class IngredientApiOutput {

    private Long id;
    private String name;
    private String unitOfMeasure;
}
