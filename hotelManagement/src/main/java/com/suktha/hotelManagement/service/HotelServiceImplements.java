package com.suktha.hotelManagement.service;

import com.suktha.hotelManagement.model.UdapiHotel;
import com.suktha.hotelManagement.repository.HotelRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class HotelServiceImplements implements HotelService {

    @Autowired
    private HotelRepository repo;

    @Override
    public UdapiHotel validSave(UdapiHotel hotel) {
        System.out.println("running validSave methods in HotelServiceImple");
        UdapiHotel hudapHotel = this.repo.save(hotel);
        return hudapHotel;
    }

    @Override
    public List<UdapiHotel> GetAllHOTel() {

        return this.repo.findAll();
    }

    @Override
    public UdapiHotel getHotel(long id) {
        UdapiHotel ref = this.repo.findById(id).get();
        return ref;
    }

    @Override
    public UdapiHotel updated(long id, UdapiHotel hotel) {
        UdapiHotel existingHotel = this.repo.findById(id).get();


        existingHotel.setFirstname(hotel.getFirstname());
        existingHotel.setLastname(hotel.getLastname());
        existingHotel.setLocation((hotel.getLocation()));
        UdapiHotel result = this.repo.save(existingHotel);

        return existingHotel;
    }

    @Override
    public void delete(long id) {
        UdapiHotel udapiHotel = this.repo.findById(id).get();
        this.repo.delete(udapiHotel);
    }


}
