package br.ufrn.imd.cineframework.config;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationCredentialsNotFoundException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.auth0.jwt.exceptions.JWTVerificationException;

import br.ufrn.imd.cineframework.models.records.ApiErrorResponseRecord;
import jakarta.servlet.http.HttpServletRequest;

@ControllerAdvice
public class GlobalExceptionHandler {

	@ExceptionHandler(Exception.class)
	public ResponseEntity<?> handleException(Exception exception, HttpServletRequest request) {
		String requestUrl = request.getRequestURL().toString();
		String errorMessage = "An error occurred while accessing " + requestUrl + ": " + exception.getMessage();

		return ResponseEntity.status(500).body(new ApiErrorResponseRecord(500, requestUrl, errorMessage));
	}

	@ExceptionHandler(AuthenticationCredentialsNotFoundException.class)
	public ResponseEntity<?> handleAuthenticationCredentialsNotFoundException(Exception exception,
			HttpServletRequest request) {
		String requestUrl = request.getRequestURL().toString();
		String errorMessage = "An error occurred while accessing " + requestUrl + ": " + exception.getMessage();

		return ResponseEntity.status(HttpStatus.UNAUTHORIZED)
				.body(new ApiErrorResponseRecord(HttpStatus.UNAUTHORIZED.value(), requestUrl, errorMessage));
	}

	@ExceptionHandler(JWTVerificationException.class)
	public ResponseEntity<?> handleJWTVerificationException(Exception exception, HttpServletRequest request) {
		String requestUrl = request.getRequestURL().toString();
		String errorMessage = "An error occurred while accessing " + requestUrl + ": " + exception.getMessage();

		return ResponseEntity.status(HttpStatus.UNAUTHORIZED)
				.body(new ApiErrorResponseRecord(HttpStatus.UNAUTHORIZED.value(), requestUrl, errorMessage));
	}
}
