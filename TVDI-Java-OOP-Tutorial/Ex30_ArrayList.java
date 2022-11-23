/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java_OOP_物件導向;

import java.util.ArrayList;

/**
 *
 * @author ckorsock1
 */
public class Ex30_ArrayList {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // ArrayList 動態陣列 自動變大
        ArrayList al;
        al = new ArrayList(); // 接受任意類型資料
        // add() 新增資料
        al.add(100); // 第0項
        al.add(3.14); // 第1項
        al.add("hi"); // 第2項
        al.add(new Ex29_Student("Tom", 100, 99)); // 第3項
        // al.add(new Ex29_Student("Amy", 50, 30));
        System.out.println(al); // 自動呼叫 toString()
        System.out.println("----------------------");
        // size() 即陣列長度
        for (int i = 0; i < al.size(); i++) {
            System.out.println("i = " + i);
            // get(i) 取得第i項資料
            Object obj = al.get(i);
            System.out.println(obj);
        }
        // 執行到此，上面for迴圈裡的 obj 變數，會自動消失
        System.out.println("----------------------");
        for (Object obj : al) { // 加強版 for
            System.out.println(obj);
        }
        // 執行到此，上面for迴圈裡的 obj 變數，會自動消失
        System.out.println("----------- 修改資料 -----------");
        Object obj;
        obj = al.get(3); // Student 物件
        Ex29_Student st;
        st = (Ex29_Student)obj; // Object 轉型 Student
        st.setName("Amy");
        st.setEng(80);
        st.setMath(85);
        for (Object obj2 : al) { // 加強版 for
            System.out.println(obj2);
            
        }
    }

}
