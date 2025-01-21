package br.ufrn.imd.cineframework.models.combo;

import br.ufrn.imd.cineframework.models.AbstractEntity;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "combo_item")
public class ComboItem extends AbstractEntity {

	@NotBlank(message = "O nome do item não pode estar em branco.")
	@Column(name = "name", nullable = false)
	private String name;

	@Column(name = "description")
	private String description;

	@NotBlank(message = "O valor do item deve ser informado.")
	@Column(name = "price", nullable = false)
	private Double price;

}
