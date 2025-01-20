package br.ufrn.imd.models.combo;

import br.ufrn.imd.models.AbstractEntity;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "combo")
public class Combo extends AbstractEntity {
	@NotBlank(message = "O título não pode estar em branco.")
	@Size(max = 100, message = "O título pode ter no máximo 100 caracteres.")
	@Column(name = "title", length = 100, nullable = false)
	private String title;

	@NotBlank(message = "A descrição não pode estar em branco.")
	@Column(name = "description", nullable = false)
	private String description;

	@OneToMany
	@JoinColumn(name = "combo_id")
	private List<ComboItem> items;

	public Double getTotalPrice() {
		return items.stream().map(i -> i.getPrice() == null ? 0.0 : i.getPrice()).mapToDouble(Double::doubleValue)
				.sum();
	}
}
