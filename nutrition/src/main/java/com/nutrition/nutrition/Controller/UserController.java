package com.nutrition.nutrition.Controller;

import com.nutrition.nutrition.Model.DTO.UserDTO;
import com.nutrition.nutrition.Model.Entity.User;
import com.nutrition.nutrition.Service.UserService;
import jakarta.validation.Valid;
import lombok.AllArgsConstructor;
import org.springframework.beans.BeanUtils;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@AllArgsConstructor
@RequestMapping("/api/users")
public class UserController {
    private UserService userService;

    @GetMapping
    public ResponseEntity<List<User>> findAll() {
        return ResponseEntity.status(HttpStatus.FOUND).body(userService.findAll());
    }

    @PostMapping
    public ResponseEntity<Object> save(@RequestBody @Valid UserDTO userDTO) {
        User user = new User();
        BeanUtils.copyProperties(userDTO, user);
        return ResponseEntity.status(HttpStatus.CREATED).body(userService.save(user));
    }

    @GetMapping("/{code}")
    public ResponseEntity<Object> findById(@PathVariable(value = "code") Integer code) {
        Optional optional = userService.findById(code);
        if(optional.isEmpty()) {
            return ResponseEntity.status(HttpStatus.FOUND).body("Erro! Usuário não existe!");
        } else {
            return ResponseEntity.status(HttpStatus.FOUND).body(userService.findById(code));
        }
    }

    @DeleteMapping("/{code}")
    public ResponseEntity<Object> deleteById(@PathVariable(value = "code") Integer code) {
        Optional optional = userService.findById(code);
        if(optional.isEmpty()) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Erro! Usuário não encontrado!");
        } else {
            userService.deleteById(code);
            return ResponseEntity.status(HttpStatus.OK).body("Sucesso! Usuário deletado com sucesso!");
        }
    }
}
