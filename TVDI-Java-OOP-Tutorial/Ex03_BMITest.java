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
public class Ex03_BMITest {
    public static void main(String[] args) {
        
        // 宣告參考變數
        Ex03_BMI a;
        a = new Ex03_BMI(); // new 建立資料空間 會自動建立預設值
        a.顯示(); // a 調用(呼叫) 顯示()
        
        a.name = "Tom";
        a.身高cm = 170.0;
        a.體重kg = 70.0;
        a.計算bmi();
        a.顯示(); // a 調用(呼叫) 顯示()
        
        // 宣告參考變數
        Ex03_BMI b;
        b = new Ex03_BMI();
        b.name = "Amy";
        b.身高cm = 160.0;
        b.體重kg = 60.0;
        b.計算bmi();
        b.顯示();
    }
}
