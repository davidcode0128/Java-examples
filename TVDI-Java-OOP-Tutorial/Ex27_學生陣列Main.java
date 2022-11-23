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
public class Ex27_學生陣列Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Ex27_學生陣列 array;
        array = new Ex27_學生陣列(); // 建立物件空間 設定初值
        
        Ex04_Student資料 st1;
        st1 = new Ex04_Student資料(); // 自動採預設值
        st1.name = "Tom";
        st1.eng = 100;
        st1.math = 99;
        
        Ex04_Student資料 st2;
        st2 = new Ex04_Student資料(); // 自動採預設值
        st2.name = "Amy";
        st2.eng = 85;
        st2.math = 80;
        
        Ex04_Student資料 st3;
        st3 = new Ex04_Student資料(); // 自動採預設值
        st3.name = "Jo";
        st3.eng = 95;
        st3.math = 75;
        
        array.add(st1);
        array.add(st2);
        array.add(st3);
        array.show();
        
    }
    
}
