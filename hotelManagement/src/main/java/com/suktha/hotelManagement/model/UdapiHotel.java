package com.suktha.hotelManagement.model;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Objects;

@Entity

@Table(name = "HotelEmploye")
public class UdapiHotel {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(name = "firstname")
    private String firstname;
    @Column(name = "lastname")
    private String lastname;
    @Column(name = "location")
    private String location;
    @Column(name="fees")
    private int fees;


    public UdapiHotel(){
        System.out.println("no argument Constructer");
    }

    public UdapiHotel(long id, String firstname, String lastname, String location,int fees) {
        this.id = id;
        this.firstname = firstname;
        this.lastname = lastname;
        this.fees=fees;
     this.location=location;
    }

    public void setFees(int fees){
        this.fees=fees;
    }
    public int getFees(){
        return fees;
    }

    public void setId(long id){
        this.id=id;
    }

    public long getId(){
        return id;
    }
    public void setFirstname(String firstname){
        this.firstname=firstname;
    }
    public String getFirstname(){
        return firstname;
    }
    public void setLastname(String lastname){
        this.lastname=lastname;
    }
    public String getLastname(){
        return lastname;
    }
    public void setLocation(String location){
        this.location=location;
    }
    public String getLocation(){
        return location;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        UdapiHotel that = (UdapiHotel) o;
        return id == that.id && fees == that.fees && Objects.equals(firstname, that.firstname) && Objects.equals(lastname, that.lastname) && Objects.equals(location, that.location);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, firstname, lastname, location, fees);
    }
}
