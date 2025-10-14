/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package za.ac.cput.carrental.domain;

/**
 *
 * @author Siphokuhle Nyana
 */
public class Contact {
    private String email;
    private String mobile ;
    private String homeTelephone ;
    private String workTelephone ;

    public Contact(String email, String mobile, String homeTelephone, String workTelephone) {
        this.email = email;
        this.mobile = mobile;
        this.homeTelephone = homeTelephone;
        this.workTelephone = workTelephone;
    }
    

    public String getEmail() {
        return email;
    }

    public String getMobile() {
        return mobile;
    }

    public String getHomeTelephone() {
        return homeTelephone;
    }

    public String getWorkTelephone() {
        return workTelephone;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public void setHomeTelephone(String homeTelephone) {
        this.homeTelephone = homeTelephone;
    }

    public void setWorkTelephone(String workTelephone) {
        this.workTelephone = workTelephone;
    }

    @Override
    public String toString() {
        return "Contact{" + "email=" + email + ", mobile=" + mobile + ", homeTelephone=" + homeTelephone + ", workTelephone=" + workTelephone + '}';
    }
    
    
}
