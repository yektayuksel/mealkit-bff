package com.mealkit.bff.api.service.product.ingredient;

import com.mealkit.bff.api.client.product.IngredientClient;
import com.mealkit.bff.api.model.product.request.IngredientApiInput;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class IngredientServiceImpl implements IngredientService {

    private final IngredientClient ingredientClient;

    @Override
    public void createIngredient(IngredientApiInput ingredientApiInput) {
        ingredientClient.createIngredient(ingredientApiInput);

    }

    @Override
    public void deleteIngredient(Long ingredientId) {
        ingredientClient.deleteIngredient(ingredientId);
    }

    @Override
    public void updateIngredient(IngredientApiInput ingredientApiInput, Long ingredientId) throws Exception {
        ingredientClient.updateIngredient(ingredientApiInput, ingredientId);
    }
}
