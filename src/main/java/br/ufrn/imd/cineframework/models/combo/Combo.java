package br.ufrn.imd.cineframework.models.combo;

import java.util.List;

import br.ufrn.imd.cineframework.models.AbstractEntity;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
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
