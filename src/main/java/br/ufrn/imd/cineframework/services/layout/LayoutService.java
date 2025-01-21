package br.ufrn.imd.cineframework.services.layout;

import br.ufrn.imd.cineframework.models.layout.AbstractLayout;

public class LayoutService {
	private LayoutCreator layoutCreator;

	public LayoutService(LayoutCreator layoutCreator) {
		this.layoutCreator = layoutCreator;
	}

	public AbstractLayout createLayout(Object data) {
		return this.layoutCreator.createLayout(data);
	}
}
