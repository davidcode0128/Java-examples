/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java_OOP_物件導向;

/**
 *
 * @author ckorsock1
 */
public class Ex29_Student {

    private String Name; // 預設 null
    private double Eng; // 預設 0
    private double Math; // 預設 0

    // 建構子 constructor 設定初值
    // 利用 右鍵 > 插入程式碼 > 建構子
    
    // 無參數 建構子
    public Ex29_Student() {
        // 採預設值
    }

    // 3參數 建構子
    public Ex29_Student(String Name, double Eng, double Math) {
        this.Name = Name;
        this.Eng = Eng;
        this.Math = Math;
    }

    // 利用 右鍵 > 插入程式碼 > Getter & Setter
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

    // 產生物件資料字串 方便輸出顯示
    // 利用 右鍵 > 插入程式碼 > toString()
    
    // System.out.println() 自動呼叫物件的toString()
    @Override
    public String toString() {
        return "學生資料{" + "name=" + Name + ", eng=" + Eng + ", math=" + Math + '}';
    }

}
