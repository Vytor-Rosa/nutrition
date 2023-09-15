package com.nutrition.nutrition.Model.DTO;

import jakarta.persistence.Column;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
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
    @NotNull
    private Double height;
    @NotNull
    private Double weight;
    @NotNull
    private String biotype;
    @NotBlank
    private String objective;
}
