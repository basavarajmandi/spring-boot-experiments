package com.suktha.hotelManagement.service;

import com.suktha.hotelManagement.model.UdapiHotel;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface HotelService {

 UdapiHotel validSave(UdapiHotel hotel); //creat

 List<UdapiHotel> GetAllHOTel(); //findAll

 UdapiHotel getHotel(long id); //findById

UdapiHotel updated(long id, UdapiHotel hotel)  ; //update

 void delete(long id);

 //delete

}
