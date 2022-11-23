package domain;
import java.io.Serializable;  // (Java Beans)
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author User
 */
// Model (Java Beans)
public class Address implements Serializable{ // 實作 Serializable  (Java Beans)
    
    // 設計 Model ( Address / Customer )    
    private String address1;
    private String address2;
    private String city;
    private String region;
    private String postcode;
    // 無參數建構子 (Java Beans)
    public Address() {
    }
    
    // 建構子
    public Address(String address1, String address2, String city, String region, String postcode) {
        this.address1 = address1;
        this.address2 = address2;
        this.city = city;
        this.region = region;
        this.postcode = postcode;
    }
    // Getter & Setter
    public String getAddress1() {
        return address1;
    }

    public void setAddress1(String address1) {
        this.address1 = address1;
    }

    public String getAddress2() {
        return address2;
    }

    public void setAddress2(String address2) {
        this.address2 = address2;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String getPostcode() {
        return postcode;
    }

    public void setPostcode(String postcode) {
        this.postcode = postcode;
    }
    
}
