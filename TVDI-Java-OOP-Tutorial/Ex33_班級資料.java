/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java_OOP_物件導向;

import java.util.List;
import java.util.Stack;

/**
 *
 * @author ckorsock1
 */
public class Ex33_班級資料 {
    // 欄位
    private String name; // 預設值 null
    private List array; // 用介面宣告，讓物件更容易進行更換

    // constructor建構子 初值設定 不需要交代返回值類型(例如 void 代表沒有返回值)
    public Ex33_班級資料(String name) {
        this.name = name;
    //更換    this.array = new ArrayList(); // 建立物件空間 設定初值
    //更換  this.array = new LinkedList(); // 建立物件空間 設定初值
        this.array = new Stack(); // 建立物件空間 設定初值
    }

    public void add(Ex29_Student st) {
        this.array.add(st);
    }
    public void show(){
        System.out.println(this.name);
        System.out.println(this.array);
}
}