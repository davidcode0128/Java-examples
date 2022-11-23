/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java_OOP_物件導向;

import org.omg.CosNaming.NamingContextExtPackage.StringNameHelper;

/**
 *
 * @author ckorsock1
 */
public class Ex28_班級資料 {

    // 欄位
    private String name; // 預設值 null
    private Ex27_學生陣列 array;

    // constructor建構子 初值設定 不需要交代返回值類型(例如 void 代表沒有返回值)
    public Ex28_班級資料(String name) {
        this.name = name;
        this.array = new Ex27_學生陣列(); // 建立物件空間 設定初值
    }

    public void add(Ex04_Student資料 st) {
        this.array.add(st);
    }
    public void show(){
        this.array.show();
    }
}
