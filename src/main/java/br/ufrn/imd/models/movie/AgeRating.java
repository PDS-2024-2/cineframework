package br.ufrn.imd.models.movie;

import br.ufrn.imd.models.AbstractEntity;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "age_rating")
public class AgeRating extends AbstractEntity {

	private static final long serialVersionUID = 1L;

	@NotBlank(message = "O código de classificação etária não pode estar vazio.")
	@Column(name = "code", nullable = false, length = 10, unique = true)
	private String code;

	@NotBlank(message = "O nome de classificação etária não pode estar vazio.")
	@Column(name = "name", nullable = false, length = 100)
	private String name;

	@Column(name = "description")
	private String description;
}
