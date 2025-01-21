package br.ufrn.imd.cineframework.models.room;

import br.ufrn.imd.cineframework.models.AbstractEntity;
import br.ufrn.imd.cineframework.models.layout.AbstractLayout;
import jakarta.persistence.Column;
import jakarta.persistence.Embedded;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "room")
public class Room extends AbstractEntity {
	private static final long serialVersionUID = 1L;

	@NotBlank(message = "O código não pode estar em branco.")
	@Column(name = "code", nullable = false, unique = true)
	private String code;

	@NotNull(message = "O tipo de sala é obrigatório.")
	@ManyToOne
	@JoinColumn(name = "room_type_id", nullable = false)
	private RoomType roomType;

	@NotNull(message = "A capacidade é obrigatória.")
	@Column(name = "capacity", nullable = false)
	private Integer capacity;

	@ManyToOne
	@JoinColumn(name = "layout_id")
	private AbstractLayout layout;

}
