package com.nutrition.nutrition.Service;

import com.nutrition.nutrition.Model.Entity.NutritionalTable;
import com.nutrition.nutrition.Repository.NutritionalTableRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class NutritionalTableService {
    private NutritionalTableRepository nutritionalTableRepository;

    public <S extends NutritionalTable> S saveAndFlush(S entity) {
        return nutritionalTableRepository.saveAndFlush(entity);
    }

    public List<NutritionalTable> findAll() {
        return nutritionalTableRepository.findAll();
    }

    public <S extends NutritionalTable> S save(S entity) {
        return nutritionalTableRepository.save(entity);
    }

    public Optional<NutritionalTable> findById(Integer s) {
        return nutritionalTableRepository.findById(s);
    }

    public boolean existsById(Integer s) {
        return nutritionalTableRepository.existsById(s);
    }

    public void deleteById(Integer s) {
        nutritionalTableRepository.deleteById(s);
    }
}
