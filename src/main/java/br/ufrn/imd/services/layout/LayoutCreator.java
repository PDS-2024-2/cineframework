package br.ufrn.imd.services.layout;

import br.ufrn.imd.models.layout.AbstractLayout;

public abstract class LayoutCreator {
	public abstract String processLayoutDate(String data);

	public abstract AbstractLayout createLayout(String data);
}
