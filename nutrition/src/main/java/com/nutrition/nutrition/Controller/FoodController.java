package com.nutrition.nutrition.Controller;

import com.fasterxml.jackson.databind.util.BeanUtil;
import com.nutrition.nutrition.Model.DTO.FoodDTO;
import com.nutrition.nutrition.Model.Entity.Food;
import com.nutrition.nutrition.Service.FoodService;
import jakarta.validation.Valid;
import lombok.AllArgsConstructor;
import org.springframework.beans.BeanUtils;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@Controller
@AllArgsConstructor
@RequestMapping("/api/food")
public class FoodController {
    private FoodService foodService;

    @GetMapping
    public ResponseEntity<List<Food>> findAll() {
        return ResponseEntity.status(HttpStatus.FOUND).body(foodService.findAll());
    }

    @PostMapping
    public ResponseEntity<Food> save(@RequestBody @Valid FoodDTO foodDTO) {
        Food food = new Food();
        BeanUtils.copyProperties(foodDTO, food);
        return ResponseEntity.status(HttpStatus.CREATED).body(foodService.save(food));
    }

    @GetMapping("/{code}")
    public ResponseEntity<Object> findById(@PathVariable(value = "code") Integer code) {
        Optional<Food> food = foodService.findById(code);
        if (food.isEmpty()) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Food not found");
        } else {
            return ResponseEntity.status(HttpStatus.FOUND).body(food);
        }
    }

    @DeleteMapping("/{code}")
    public ResponseEntity<Object> deleteById(@PathVariable(value = "code") Integer code) {
        Optional<Food> food = foodService.findById(code);
        if(food.isEmpty()) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Food not found");
        } else {
            foodService.deleteById(code);
            return ResponseEntity.status(HttpStatus.OK).body("Food deleted");
        }
    }
}
