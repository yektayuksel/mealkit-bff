package com.mealkit.bff.web.product;

import com.mealkit.bff.api.model.product.request.IngredientApiInput;
import com.mealkit.bff.api.service.product.ingredient.IngredientService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/ingredient")
public class IngredientWebApi {

    private final IngredientService ingredientService;


    @PostMapping("/createIngredient")
    ResponseEntity<Void> createIngredient(@RequestBody IngredientApiInput ingredientApiInput){
        ingredientService.createIngredient(ingredientApiInput);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @DeleteMapping("/deleteIngredient/{ingredientId}")
    ResponseEntity<Void> deleteIngredient(@PathVariable Long ingredientId){
        ingredientService.deleteIngredient(ingredientId);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @PutMapping("/updateIngredient/{ingredientId}")
    ResponseEntity<Void> updateIngredient(@RequestBody IngredientApiInput ingredientApiInput, @PathVariable Long ingredientId) throws Exception{
        ingredientService.updateIngredient(ingredientApiInput, ingredientId);
        return new ResponseEntity<>(HttpStatus.OK);
    }


}
