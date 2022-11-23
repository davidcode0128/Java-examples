/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java_OOP_物件導向;

import java.util.HashMap;
import java.util.Map;

/**
 * 設計BMI 類別，將 MAP 封裝起來
 * 封裝: 將資訊盡可能的隱藏，外面程式透過 public 方法進行操作
 * @author ckorsock1
 */
public class Ex34_BMI {
    // 欄位
    private Map map;
    
    // 建構子
  /*  public Ex34_BMI(String name, double 身高cm,double 體重kg) {
        this.map = new HashMap();
    }*/
    private String name;
    private double 身高cm;
    private double 體重kg;
    
    public Ex34_BMI(String name, double 身高cm, double 體重kg) {
        this.map = new HashMap();
        this.name = name;
        this.身高cm = 身高cm;
        this.體重kg = 體重kg;
}
    
    // getter & setter
    public void setName(String name){
        this.map.put("name", name);
}
    public void set身高cm(double 身高cm){
        this.map.put("身高cm", 身高cm);
    }
    public void set體重kg(double 體重kg){
        this.map.put("體重kg", 體重kg);
    }
    public String getName(){
        return (String)this.map.get("name");
    }
    public double get身高cm(){
        return (double)this.map.get("身高cm");
    }
    public double get體重kg(){
        return (double)this.map.get("體重kg");
    }

    @Override
    public String toString() {
        return "Ex34_BMI{" + "name=" + name + "身高" + 身高cm + "體重" + 體重kg + '}';
    }
    
    }

