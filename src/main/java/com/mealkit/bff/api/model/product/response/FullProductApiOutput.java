package com.mealkit.bff.api.model.product.response;

import com.mealkit.bff.api.model.stock.response.ResponseStock;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
@Data
@AllArgsConstructor
@NoArgsConstructor
public class FullProductApiOutput {

    private Long id;
    private String productName;
    private String description;
    private String imageUrl;
    private String recipe;
    private Double price;
    private Integer cookingTime;
    private Long calories;
    private String difficulty;

    private List<ResponseStock> ingredients;

    private List<Long> tagIds;
}
