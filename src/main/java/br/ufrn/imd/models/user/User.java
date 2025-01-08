package br.ufrn.imd.models.user;

import java.time.LocalDateTime;

import com.fasterxml.jackson.annotation.JsonIgnore;

import br.ufrn.imd.models.AbstractEntity;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

@Entity
@Table(name = "users")
public class User extends AbstractEntity {
	private static final long serialVersionUID = 1L;

	@Column(name = "name", nullable = false)
	@NotNull
	@NotBlank(message = "O nome não pode estar em branco")
	@Size(min = 2, max = 100, message = "O nome deve ter entre 2 e 100 caracteres")
	private String name;

	@Column(name = "email", nullable = false, unique = true)
	@NotNull
	@Email(message = "Email deve ser válido")
	@NotBlank(message = "Email não pode estar em branco")
	private String email;

	@Column(name = "username", nullable = false, unique = true)
	@NotNull
	@NotBlank(message = "O username não pode estar em branco")
	@Size(min = 5, max = 50, message = "O username deve ter entre 5 e 50 caracteres")
	private String username;

	@Column(name = "password", nullable = false)
	@NotNull
	@JsonIgnore
	private String password;

	@Column(name = "bio")
	private String bio;

	@Column(name = "role")
	@Enumerated(EnumType.STRING)
	private Role role;

	@Column(name = "created_at", updatable = false)
	private LocalDateTime createdAt;

	@Column(name = "update_at")
	private LocalDateTime updateAt;

	public User() {

	}

	public User(Long id,
			@NotNull @NotBlank(message = "O nome não pode estar em branco") @Size(min = 2, max = 100, message = "O nome deve ter entre 2 e 100 caracteres") String name,
			@NotNull @Email(message = "Email deve ser válido") @NotBlank(message = "Email não pode estar em branco") String email,
			@NotNull @NotBlank(message = "O username não pode estar em branco") @Size(min = 5, max = 50, message = "O username deve ter entre 5 e 50 caracteres") String username,
			@NotNull String password, String bio, Role role) {
		super(id);
		this.name = name;
		this.email = email;
		this.username = username;
		this.password = password;
		this.bio = bio;
		this.role = role;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getBio() {
		return bio;
	}

	public void setBio(String bio) {
		this.bio = bio;
	}

	public LocalDateTime getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(LocalDateTime createdAt) {
		this.createdAt = createdAt;
	}

	public LocalDateTime getUpdateAt() {
		return updateAt;
	}

	public void setUpdateAt(LocalDateTime updateAt) {
		this.updateAt = updateAt;
	}
	
	public Role getRole() {
		return role;
	}
	
	public void setRole(Role role) {
		this.role = role;
	}
}
