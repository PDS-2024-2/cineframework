package br.ufrn.imd.models.room;

import br.ufrn.imd.models.AbstractEntity;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "room_type")
public class RoomType extends AbstractEntity {

	@NotBlank(message = "O código não pode estar em branco.")
	@Size(max = 20, message = "O código pode ter no máximo 20 caracteres.")
	@Column(name = "code", nullable = false, unique = true, length = 20)
	private String code;

	@NotBlank(message = "O nome não pode estar em branco.")
	@Size(max = 100, message = "O nome pode ter no máximo 100 caracteres.")
	@Column(name = "name", nullable = false, length = 100)
	private String name;

	@Size(max = 500, message = "A descrição pode ter no máximo 500 caracteres.")
	@Column(name = "description", length = 500)
	private String description;
}
