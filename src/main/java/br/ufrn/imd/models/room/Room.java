package br.ufrn.imd.models.room;

import br.ufrn.imd.models.AbstractEntity;
import br.ufrn.imd.models.layout.AbstractLayout;

public class Room extends AbstractEntity {
	private static final long serialVersionUID = 1L;

	private String code;

	private RoomType roomType;

	private Integer capacity;

	private AbstractLayout layout;

	public Room() {
	}

	public Room(String code, RoomType roomType, Integer capacity) {
		this.code = code;
		this.roomType = roomType;
		this.capacity = capacity;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public RoomType getRoomType() {
		return roomType;
	}

	public void setRoomType(RoomType roomType) {
		this.roomType = roomType;
	}

	public Integer getCapacity() {
		return capacity;
	}

	public void setCapacity(Integer capacity) {
		this.capacity = capacity;
	}

	public AbstractLayout getLayout() {
		return layout;
	}

	public void setLayout(AbstractLayout layout) {
		this.layout = layout;
	}

}
