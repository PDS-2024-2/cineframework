package br.ufrn.imd.cineframework.annotations;

import java.util.regex.Pattern;

import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

public class PasswordValidator implements ConstraintValidator<ValidPassword, String> {

	private Pattern uppercase = Pattern.compile("[A-Z]");
	private Pattern lowercase = Pattern.compile("[a-z]");

	@Override
	public void initialize(ValidPassword constraintAnnotation) {
	}

	@Override
	public boolean isValid(String password, ConstraintValidatorContext context) {
		if (password == null)
			return false;

		if (password.length() < 5)
			return false;

		if (uppercase.matcher(password).results().toArray().length == 0)
			return false;

		if (lowercase.matcher(password).results().toArray().length == 0)
			return false;

		return true;
	}
}
