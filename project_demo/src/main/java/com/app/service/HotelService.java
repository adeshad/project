package com.app.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import com.app.entities.Hotel;

@Service
@Transactional
public interface HotelService {

	public Hotel addHotel(Hotel hotel);
	public List<Hotel> list();
}
