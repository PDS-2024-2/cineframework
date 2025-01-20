package br.ufrn.imd.models.session;

import br.ufrn.imd.models.AbstractEntity;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "session_type")
public class SessionType extends AbstractEntity {

	@NotBlank(message = "O código não pode estar em branco.")
	@Size(max = 50, message = "O código não pode ter mais de 50 caracteres.")
	@Column(name = "code", nullable = false, unique = true)
	private String code;

	@NotBlank(message = "O nome não pode estar em branco.")
	@Size(max = 100, message = "O nome não pode ter mais de 100 caracteres.")
	@Column(name = "name", nullable = false)
	private String name;

	@NotBlank(message = "A descrição não pode estar em branco.")
	@Size(max = 255, message = "A descrição não pode ter mais de 255 caracteres.")
	@Column(name = "description", nullable = false)
	private String description;

}
