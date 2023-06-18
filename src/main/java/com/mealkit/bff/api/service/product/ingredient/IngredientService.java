package com.mealkit.bff.api.service.product.ingredient;

import com.mealkit.bff.api.model.product.request.IngredientApiInput;

public interface IngredientService {
    void createIngredient(IngredientApiInput ingredientApiInput);
    void deleteIngredient(Long ingredientId);
    void updateIngredient(IngredientApiInput ingredientApiInput, Long ingredientId) throws Exception;
}
