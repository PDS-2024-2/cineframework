package br.ufrn.imd.cineframework.services.layout;

import br.ufrn.imd.cineframework.models.layout.AbstractLayout;

public abstract class LayoutCreator {
	public abstract AbstractLayout createLayout(Object data);
}
