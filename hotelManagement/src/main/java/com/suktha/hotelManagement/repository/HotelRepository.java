package com.suktha.hotelManagement.repository;

import com.suktha.hotelManagement.model.UdapiHotel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HotelRepository extends JpaRepository<UdapiHotel , Long> {

}
