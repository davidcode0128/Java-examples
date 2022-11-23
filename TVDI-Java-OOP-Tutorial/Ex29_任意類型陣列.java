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
public class Ex29_任意類型陣列 {

    public static void main(String[] args) {

        // Object 代表可關聯到任一類型
        Object x;
        x = 100;
        x = 3.14;
        x = "Hi";
        x = new Ex29_Student();

        Object[] array;
        array = new Object[3];
        array[0] = 100;
        array[1] = 3.14;
        array[2] = new Ex29_Student("Tom", 100, 99);

        for (int i = 0; i < array.length; i++) {
            System.out.println("i = " + i);
            System.out.println(array[i]);
        }

        System.out.println("------------------------");

        // array[2].setName("Amy"); // 陣列是 Object 類型，不能直接當學生用
        // 從 array 讀取一項 放到obj 變數
        for (Object obj : array) { // 加強版 for 用法
            System.out.println(obj);
        }

        System.out.println("----------- 讀取值 -------------");

        System.out.println(((Ex29_Student) array[2]).getName());
        System.out.println(((Ex29_Student) array[2]).getEng());
        System.out.println(((Ex29_Student) array[2]).getMath());
        System.out.println("----------- 修改值 -------------");

        //  需將 Object 轉型 Student
        Ex29_Student st;
        // st = array[2]; // 是一種物件，但不一定是學生
        st = (Ex29_Student) array[2]; // 轉型寫法
        st.setName("Amy");
        st.setEng(95);
        st.setMath(90);

        // 從 array 讀取一項 放到 obj 變數
        for (Object obj : array) { // 加強版 for 用法
            System.out.println(obj);
        }
        System.out.println("----------- 讀取值 -------------");

        System.out.println(((Ex29_Student) array[2]).getName());
        System.out.println(((Ex29_Student) array[2]).getEng());
        System.out.println(((Ex29_Student) array[2]).getMath());

    }
}
