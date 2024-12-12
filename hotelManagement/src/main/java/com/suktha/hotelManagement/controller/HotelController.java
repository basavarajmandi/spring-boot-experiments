package com.suktha.hotelManagement.controller;
import com.suktha.hotelManagement.model.UdapiHotel;
import com.suktha.hotelManagement.repository.HotelRepository;
import com.suktha.hotelManagement.service.HotelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;
@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class HotelController {

    @Autowired
    private HotelService service;

    //RequestBody is canavart jeson into java Object
    @PostMapping("/Hotel")
    public UdapiHotel CreateHotel(@RequestBody UdapiHotel hotel) {
        UdapiHotel udapi = this.service.validSave(hotel);
        return udapi;
    }

    @GetMapping("/apiHotel")
    public List<UdapiHotel> getAllHotel() {
        List<UdapiHotel> ref = this.service.GetAllHOTel();
        return ref;
    }

    @GetMapping("/api/findByid/{id}")
    public UdapiHotel getHotel(@PathVariable long id) {
        UdapiHotel udap = this.service.getHotel(id);
        return udap;
    }

//it is from direct code from repository
//    @PutMapping("api/updated/{id}")
//    public UdapiHotel HotelUpdated(@PathVariable long id) {
//        UdapiHotel hotel = this.repo.findById(id).get();
//         hotel.setFirstname("shriRam");
//        hotel.setLastname("cofe");
//        hotel.setLocation("banagaluru");
//        this.repo.save(hotel);
//        return hotel;
//    }

    @PutMapping("/api/update/{id}")
    public UdapiHotel updatedHotel(@PathVariable long id, @RequestBody UdapiHotel hotel) {
        return this.service.updated(id, hotel);
    }

    @DeleteMapping("/api/deleted/{id}")
    public void deletedHotel( @PathVariable long id) {
    this.service.delete(id);
    }
}
