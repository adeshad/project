package com.app.entities;

public enum RoomType {

	DILUX(4570),DOUBLE_BED(2343);
	public final int  roomPrice;
	private RoomType(int price)
	{
		roomPrice=price;
	}
	public int getRoomPrice()
	{
		return this.roomPrice;
	}
}
