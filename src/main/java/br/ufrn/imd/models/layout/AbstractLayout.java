package br.ufrn.imd.models.layout;

import jakarta.persistence.Embeddable;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Embeddable
public abstract class AbstractLayout {

	protected Integer size;

}
