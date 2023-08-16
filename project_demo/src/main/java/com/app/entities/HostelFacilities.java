package com.app.entities;

public enum HostelFacilities {

	WIFI(true),POOL(false),PARKING(false);
	public final   boolean status;
	private HostelFacilities(boolean status)
	{
		this.status=status;
	}
	
}
