package br.ufrn.imd.models.combo;

import java.util.List;

public class Combo {
	private String title;
	private String description;

	private List<ComboItem> items;

	public Combo() {
	}

	public Combo(String title, String description, List<ComboItem> items) {
		this.title = title;
		this.description = description;
		this.items = items;
	}

	public Double getTotalPrice() {
		return items.stream().map(i -> i.getPrice() == null ? 0.0 : i.getPrice()).mapToDouble(Double::doubleValue)
				.sum();
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public List<ComboItem> getItems() {
		return items;
	}
}
