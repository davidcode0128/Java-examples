/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java_OOP_物件導向;

// Java Class(類別，像是程式範本)
public class Ex02_Student {
    // 欄位
    // 沒有宣告 public 或 private
    // 僅開放相同資料夾(套件)
    String name;
    int eng;
    int math;
    
    // method 方法 內部自動隱含 this 參考變數
    public void 顯示() {
        // this 自動被指定為調用(呼叫)者
        // 即 this = st1
        // 也可能 this = st2
        System.out.println("name: " + this.name);
        System.out.println("eng: " + this.eng);
        System.out.println("math: " + this.math);
        System.out.println("");
    }
}
