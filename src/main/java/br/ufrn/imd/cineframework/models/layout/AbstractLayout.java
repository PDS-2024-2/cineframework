package br.ufrn.imd.cineframework.models.layout;

import br.ufrn.imd.cineframework.models.AbstractEntity;
import jakarta.persistence.Entity;
import jakarta.persistence.Inheritance;
import jakarta.persistence.InheritanceType;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "abstract_layout")
@Inheritance(strategy = InheritanceType.JOINED)
public abstract class AbstractLayout extends AbstractEntity {

	private Double size;

}
