package com.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.entities.Hotel;
import com.app.service.HotelService;

@RestController
@RequestMapping("/hotels")
public class HotelController {

	
	@Autowired
	private HotelService service ;
	
	@GetMapping
	public List<Hotel> getAllHotels()
	{
		return service.list();
	}
	
	@PostMapping
	public ResponseEntity<?> addHotelToDb(@RequestBody Hotel hotel)
	{
		//System.out.println("inside controller of hotel");
		return  new ResponseEntity<>(service.addHotel(hotel), HttpStatus.OK);
	}
	
	
}
