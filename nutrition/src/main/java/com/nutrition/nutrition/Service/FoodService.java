package com.nutrition.nutrition.Service;

import com.nutrition.nutrition.Model.Entity.Food;
import com.nutrition.nutrition.Repository.FoodRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class FoodService {
    private FoodRepository foodRepository;

    public <S extends Food> S saveAndFlush(S entity) {
        return foodRepository.saveAndFlush(entity);
    }

    public List<Food> findAll() {
        return foodRepository.findAll();
    }

    public <S extends Food> S save(S entity) {
        return foodRepository.save(entity);
    }

    public Optional<Food> findById(Integer integer) {
        return foodRepository.findById(integer);
    }

    public void deleteById(Integer integer) {
        foodRepository.deleteById(integer);
    }
}
