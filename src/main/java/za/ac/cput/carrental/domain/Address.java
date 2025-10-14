/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package za.ac.cput.carrental.domain;

/**
 *
 * @author mogamatyaseenkannemeyer
 */
public class Address {
    private String streetName;
    private String streetNumber;
    private String Suburb;
    private String City;
    private String Country;

    public Address() {
    }

    public Address(String streetName, String streetNumber, String Suburb, String City, String Country) {
        this.streetName = streetName;
        this.streetNumber = streetNumber;
        this.Suburb = Suburb;
        this.City = City;
        this.Country = Country;
    }

    public String getStreetName() {
        return streetName;
    }

    public void setStreetName(String streetName) {
        this.streetName = streetName;
    }

    public String getStreetNumber() {
        return streetNumber;
    }

    public void setStreetNumber(String streetNumber) {
        this.streetNumber = streetNumber;
    }

    public String getSuburb() {
        return Suburb;
    }

    public void setSuburb(String Suburb) {
        this.Suburb = Suburb;
    }

    public String getCity() {
        return City;
    }

    public void setCity(String City) {
        this.City = City;
    }

    public String getCountry() {
        return Country;
    }

    public void setCountry(String Country) {
        this.Country = Country;
    }

    @Override
    public String toString() {
        return "Address{" + "streetName=" + streetName + ", streetNumber=" + streetNumber + ", Suburb=" + Suburb + ", City=" + City + ", Country=" + Country + '}';
    }
    
   

}
