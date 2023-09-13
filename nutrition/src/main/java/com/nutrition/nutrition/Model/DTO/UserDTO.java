package com.nutrition.nutrition.Model.DTO;

import jakarta.persistence.Column;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import lombok.Data;
import lombok.NonNull;

@Data
public class UserDTO {
    @NotBlank
    private String name;
    @NotBlank
    private String userName;
    @NotBlank
    private String password;
    @Email
    private String email;
}
