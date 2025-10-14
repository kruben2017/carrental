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
    private String suburb;
    private String city;
    private String country;
    private String province;

    public Address() {
    }

    public Address(String streetName, String streetNumber, String suburb, String city, String country, String province) {
        this.streetName = streetName;
        this.streetNumber = streetNumber;
        this.suburb = suburb;
        this.city = city;
        this.country = country;
        this.province = province;
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
        return suburb;
    }

    public void setSuburb(String suburb) {
        this.suburb = suburb;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    @Override
    public String toString() {
        return "Address{" + "streetName=" + streetName + ", streetNumber=" + streetNumber + ", suburb=" + suburb + ", city=" + city + ", country=" + country + ", province=" + province + '}';
    }
}
