package com.mealkit.bff.api.client.product;


import com.mealkit.bff.api.model.product.request.IngredientApiInput;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@FeignClient(value =  "ingredientService", url = "http://localhost:8081/api/ingredient")
public interface IngredientClient {

    @PostMapping("/createIngredient")
    ResponseEntity<Void> createIngredient(@RequestBody IngredientApiInput ingredientApiInput);
    @DeleteMapping("/deleteIngredient/{ingredientId}")
    ResponseEntity<Void> deleteIngredient(@PathVariable Long ingredientId);
    @PutMapping("/updateIngredient/{ingredientId}")
    ResponseEntity<Void> updateIngredient(@RequestBody IngredientApiInput ingredientApiInput, @PathVariable Long ingredientId);
}
