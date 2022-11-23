/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domain;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author User
 */
public class Customer {
    
    // 設計 Model ( Address / Customer )
    private String name;
    public static final int HEAD_OFFICE = 0; // 公司地址
    public static final int BILLING = 1; // 帳單地址
    public static final int DELIVERY = 2; // 郵寄地址
    private final Address[] addresses = new Address[3];
    
    // 建構子
    public Customer(String name, Address office, Address billing, Address delivery) {
        this.name = name;
        addresses[HEAD_OFFICE] = office;
        addresses[BILLING] = billing;
        addresses[DELIVERY] = delivery;
    }
    
    // Getter
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Address getOfficeAddress() {
        return addresses[HEAD_OFFICE];
    }

    public Address getBillingAddress() {
        return addresses[BILLING];
    }

    public Address getDeliveryAddress() {
        return addresses[DELIVERY];
    }

    public Address[] getAddresses() {
        return addresses;
    }
    // 利用 MAP 管理客戶資料
    private static final Map<Long, Customer> customers = new HashMap<>();

    // 靜態初始化區塊 (自動執行) 用來初始化靜態欄位資料 ( L 是 Long 長整數 ， JSP 讀取 MAP 採用長整數 Long )
    static {
        customers.put(1L, new Customer("Fred Bloggs", 
                new Address("1750 Crumlin Road", "", "London", "Ontario", "N5B 3V6"),
                new Address("6780 Collier Drive", "", "Paris", "Texas", "75462"),
                new Address("1 Airport Road", "", "Manchester", "New Hampshire", "03103"))
        );
    }
    // getter
    public static Customer getCustomer(long id){
        return customers.get(id); // 從 HashMap 取得 key  為 1L 的 Customer 物件
    }
    public static Map<Long, Customer> getCustomers() {
        return customers;
    }
}
