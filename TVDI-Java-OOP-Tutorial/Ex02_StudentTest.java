/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java_OOP_物件導向;

// Java Main Class 主類別
public class Ex02_StudentTest {
    // Main method 主方法
    public static void main(String[] args) {
        
        // 方式1 建立物件，但沒有參考變數，無法操作此物件
        // new 建立 學生 物件(資料空間)
        new Ex02_Student(); 
        
        // 方式2 宣告變數，參考物件資料空間，可以操作物件
        // 需要有物件的參考變數，用來參考物件資料
        Ex02_Student st1;
        st1 = new Ex02_Student();  // new 建立 學生 物件(資料空間)
        
        // 設定資料
        st1.name = "Tom";
        st1.eng = 100;
        st1.math = 99;
        
        // 調用(呼叫) 顯示 方法
        st1.顯示(); // st1 自動傳送到方法的this變數
        
        Ex02_Student st2;
        st2 = new Ex02_Student();
        st2.name = "Amy";
        st2.eng = 80;
        st2.math = 84;
        st2.顯示();
    }
    }

