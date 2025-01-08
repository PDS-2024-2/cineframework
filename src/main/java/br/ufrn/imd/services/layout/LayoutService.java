package br.ufrn.imd.services.layout;

import br.ufrn.imd.models.layout.AbstractLayout;

public class LayoutService {
	private LayoutCreator layoutCreator;

	public LayoutService(LayoutCreator layoutCreator) {
		this.layoutCreator = layoutCreator;
	}

	public AbstractLayout createLayout(String data) {
		String dataProcessed = this.layoutCreator.processLayoutDate(data);
		return this.layoutCreator.createLayout(dataProcessed);
	}
}
