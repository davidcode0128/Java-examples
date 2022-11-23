/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package 作業01;

/**
 *
 * @author ckorsock1
 */
public class 作業01_學生資料 {
    //學生資料以及成績欄位

    private String Name;
    private double Eng;
    private double Math;

    public 作業01_學生資料() {
    }

    public 作業01_學生資料(String Name, double Eng, double Math) {
        this.Name = Name;
        this.Eng = Eng;
        this.Math = Math;
    }


    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public double getEng() {
        return Eng;
    }

    public void setEng(double Eng) {
        this.Eng = Eng;
    }

    public double getMath() {
        return Math;
    }

    public void setMath(double Math) {
        this.Math = Math;
    }

    @Override
    public String toString() {
        return "學生資料{" + "Name=" + Name + ", Eng=" + Eng + ", Math=" + Math + '}';
    }
}
