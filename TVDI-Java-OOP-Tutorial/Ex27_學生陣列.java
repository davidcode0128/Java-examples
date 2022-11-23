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
public class Ex27_學生陣列 {

    // 宣告變數 建立陣列
    private Ex04_Student資料[] a1; // 初值 null
    private int i; // 預設值 0

    // constructor建構子 初值設定 不需要交代返回值類型(例如 void 代表沒有返回值)
    public Ex27_學生陣列() { // 方法名稱與類別名稱相同
        this.a1 = new Ex04_Student資料[3];
        this.i = 0;
    }

    public void add(Ex04_Student資料 st) {
        // this 方法內部隱含的參考變數
        // this = array , st = st1
        this.a1[i] = st; // a1[i] 關聯到st
        i += 1; // i++ 也可以
    }

    public void show() {
        // this 方法內部隱含的參考變數
        // this = array
        // 用 for 逐項讀取陣列
        for (int j = 0; j < this.a1.length; j++) {
            System.out.println("j = " + j);
            if (this.a1[j] == null) {
                System.out.println("學生物件不存在");
            } else {
                System.out.println(this.a1[j].name + " " + this.a1[j].eng + " " + this.a1[j].math);
            }
        }
    }
}
