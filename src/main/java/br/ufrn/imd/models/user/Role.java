package br.ufrn.imd.models.user;

public enum Role {
	ROLE_USER(1, "USER"), ROLE_ADMIN(2, "ADMIN");

	private Integer id;
	private String name;

	Role(int id, String name) {
		this.id = id;
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public Integer getId() {
		return id;
	}
}
