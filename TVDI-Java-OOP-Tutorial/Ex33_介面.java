/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java_OOP_物件導向;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author ckorsock1
 */
public class Ex33_介面 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // 利用關鍵字搜尋
        // java 8 api ArrayList
        // java 8 api List
        
        // 介面 只是一個規格，規定應有哪些功能(方法 method)，並未實現功能程式碼，由類別去實現功能
        // 這些未實現功能，稱為 抽象方法 abstract method
        // List 介面，有 add() 方法
        // https://docs.oracle.com/javase/8/docs/api/java/util/List.html
        // 一個有順序性的容器(集合)，提供 整數索引 來存取資料
        
        // ArrayList 實現 List 介面所有的抽象方法
        // LinkedList 實現 List 介面所有的抽象方法
        
        List a1 = new ArrayList();
        a1.add(100); // 第0項
        a1.add(3.14); // 第1項
        a1.add("hi"); // 第2項
        System.out.println(a1);
        System.out.println(a1.get(0));

        List a2 = new LinkedList();
        a2.add(100); // 第0項
        a2.add(3.14); // 第1項
        a2.add("hi"); // 第2項
        System.out.println(a2);
        System.out.println(a2.get(0));
        
        // 使用介面宣告變數，容易更換(切換)所操作的物件
        List a3;
        a3 = new ArrayList();
        a3 = new LinkedList();
        
        // Ex32_班級 繼承 ArrayList 可當作 ArrayList 使用
        ArrayList a4;
        // a4 = new ArrayList();
        a4 = new Ex32_班級();
        // a4 = new LinkedList(); 錯誤寫法 LinkedList 不是一種 ArrayList 類型
        System.out.println(a4);
        // 結論 : 優先考慮使用介面來宣告變數
    }
    
}
