package com.nutrition.nutrition.Controller;

import com.nutrition.nutrition.Model.DTO.NutritionalTableDTO;
import com.nutrition.nutrition.Model.Entity.NutritionalTable;
import com.nutrition.nutrition.Service.NutritionalTableService;
import jakarta.validation.Valid;
import lombok.AllArgsConstructor;
import org.springframework.beans.BeanUtils;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@Controller
@AllArgsConstructor
@RequestMapping("/api/table")
public class NutritionalTableController {
    private NutritionalTableService nutritionalTableService;

    @GetMapping
    public ResponseEntity<List<NutritionalTable>> findAll() {
        return ResponseEntity.status(HttpStatus.FOUND).body(nutritionalTableService.findAll());
    }

    @PostMapping
    public ResponseEntity<Object> save(@RequestBody @Valid NutritionalTableDTO nutritionalTableDTO) {
        NutritionalTable nutritionalTable = new NutritionalTable();
        BeanUtils.copyProperties(nutritionalTableDTO, nutritionalTable);
        return ResponseEntity.status(HttpStatus.CREATED).body(nutritionalTableService.save(nutritionalTable));
    }

    @GetMapping("/{code}")
    public ResponseEntity<Object> findById(@PathVariable(value = "code") Integer code) {
        Optional<NutritionalTable> nutritionalTable = nutritionalTableService.findById(code);
        if(nutritionalTable.isPresent()) {
            return ResponseEntity.status(HttpStatus.FOUND).body(nutritionalTable);
        } else {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Nutritional Table not found");
        }
    }

    @DeleteMapping("/{code}")
    public ResponseEntity<Object> deleteById(@PathVariable(value = "code") Integer code) {
        Optional<NutritionalTable> nutritionalTable = nutritionalTableService.findById(code);
        if(nutritionalTable.isEmpty()) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Nutritional Table not found");
        } else {
            nutritionalTableService.deleteById(code);
            return ResponseEntity.status(HttpStatus.OK).body("Nutritional Table deleted");
        }
    }
}
