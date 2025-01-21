package br.ufrn.imd.cineframework.models.records;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public record SigninRecord(@NotNull @NotBlank(message = "O username não pode estar em branco") String username,
		@NotNull String password) {
}