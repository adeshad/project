package com.app.entities;

import java.io.Serializable;

import javax.persistence.Embeddable;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;

import lombok.NoArgsConstructor;

@NoArgsConstructor

@Embeddable
public class Room implements Serializable{

	private Long RoomId;
	@Enumerated(EnumType.STRING)
	private RoomType roomType;
	private String roomDesc;
	
	public Room(Long roomId, RoomType roomType, String roomDesc) {
		super();
		RoomId = roomId;
		this.roomType = roomType;
		this.roomDesc = roomDesc;
	}
	
	
	
	public long getRoomId() {
		return RoomId;
	}
	public void setRoomId(long roomId) {
		RoomId = roomId;
	}
	public RoomType getRoomType() {
		return roomType;
	}
	public void setRoomType(RoomType roomType) {
		this.roomType = roomType;
	}
	public String getRoomDesc() {
		return roomDesc;
	}
	public void setRoomDesc(String roomDesc) {
		this.roomDesc = roomDesc;
	}
	@Override
	public String toString() {
		return "Room [RoomId=" + RoomId + ", roomType=" + roomType + ", roomDesc=" + roomDesc + "]";
	} 

	
}