package com.nutrition.nutrition.Model.Entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class NutritionalTable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false)
    private Integer id;
    private Double kcal;
    private Double protein;
    private Double carbohydrate;
    private Double fiber;
    private Double totalFat;
    private Double saturatedFat;
    private Double transFat;
    private Double sodium;
    private Double calcium;
    private Double iron;
    private Double potassium;
    private Double phosphorus;
    private Double zinc;
    private Double vitaminB1;
    private Double vitaminB2;
    private Double vitaminB3;
    private Double vitaminB6;
    private Double vitaminB12;
    private Double vitaminC;
    private Double vitaminD;
    private Double vitaminE;
    private Double vitaminK;
    private Double cholesterol;
    private Double caffeine;
    private Double selenium;
    private Double copper;
    private Double manganese;
    private Double fluoride;
    private Double chromium;
    private Double molybdenum;
    private Double iodine;
    private Double retinol;
    private Double carotene;
    private Double vitaminD2;
    private Double vitaminD3;
    private Double vitaminD2D3;
    private Double vitaminB7;
    private Double vitaminB9;
    private Double vitaminB5;
    private Double vitaminB12D3;
    private Double vitaminB12D2;
    private Double vitaminB12D2D3;
    private Double vitaminB12D2D3B7;
    private Double vitaminB12D2D3B7B9;
    private Double vitaminB12D2D3B7B9B5;
    private Double vitaminB12D2D3B7B9B5B3;
    private Double vitaminB12D2D3B7B9B5B3B2;
    private Double vitaminB12D2D3B7B9B5B3B2B1;
    private Double vitaminB12D2D3B7B9B5B3B2B1C;
    private Double vitaminB12D2D3B7B9B5B3B2B1CA;
    private Double vitaminB12D2D3B7B9B5B3B2B1CAE;
    private Double vitaminB12D2D3B7B9B5B3B2B1CAEK;
    private Double vitaminB12D2D3B7B9B5B3B2B1CAEKK;
    private Double vitaminB12D2D3B7B9B5B3B2B1CAEKKSE;
}
