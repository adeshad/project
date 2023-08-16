package com.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.app.entities.Hotel;
@Repository
public interface HotelRepository extends JpaRepository<Hotel, Long>{

	
	
}
