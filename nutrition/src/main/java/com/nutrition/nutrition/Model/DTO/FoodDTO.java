package com.nutrition.nutrition.Model.DTO;

import jakarta.validation.constraints.NotBlank;
import lombok.Data;

@Data
public class FoodDTO {
    @NotBlank
    private String name;
    @NotBlank
    private String unit;
    @NotBlank
    private String benefit;
}
