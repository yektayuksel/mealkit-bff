package com.mealkit.bff.api.model.stock.request;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class RequestUpdateStock {
    private Long id;
    private Integer count;
}
