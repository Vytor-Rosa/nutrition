package com.nutrition.nutrition.Service;

import com.nutrition.nutrition.Model.Entity.User;
import com.nutrition.nutrition.Repository.UserRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class UserService {
    private UserRepository userRepository;

    public <S extends User> S saveAndFlush(S entity) {
        return userRepository.saveAndFlush(entity);
    }

    public List<User> findAll() {
        return userRepository.findAll();
    }

    public <S extends User> S save(S entity) {
        return userRepository.save(entity);
    }

    public Optional<User> findById(Integer integer) {
        return userRepository.findById(integer);
    }

    public void deleteById(Integer integer) {
        userRepository.deleteById(integer);
    }
}
