/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java_OOP_物件導向;

/**
 *
 * @author User
 */
public class Ex34_BMI泛型 {
    private String name;
    private double 身高cm;
    private double 體重kg;

    public Ex34_BMI泛型() {
    }

    public Ex34_BMI泛型(String name, double 身高cm, double 體重kg) {
        this.name = name;
        this.身高cm = 身高cm;
        this.體重kg = 體重kg;
    }

    public String getName() {
        return name;
    }

    public double get身高cm() {
        return 身高cm;
    }

    public double get體重kg() {
        return 體重kg;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void set身高cm(double 身高cm) {
        this.身高cm = 身高cm;
    }

    public void set體重kg(double 體重kg) {
        this.體重kg = 體重kg;
    }

    @Override
    public String toString() {
        return "BMI資料{" + "name=" + name + "身高" + 身高cm + "體重" + 體重kg + '}';
    }
    
}
