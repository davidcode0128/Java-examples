/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java_OOP_物件導向;

import java.util.Arrays;

/**
 *
 * @author ckorsock1
 */
public class Ex26_學生陣列 {
    public static void main(String[] args) {
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
        
        // 宣告變數 建立陣列
        Ex04_Student資料[] a1;
        a1 = new Ex04_Student資料[3]; // 長度3 初值為 null
        
        System.out.println("a1 = " + Arrays.toString(a1)); // [null, null, null]
        
        // 設定陣列參考的資料對象
        int i = 0; // i 代表 index 陣列索引 從0算起
        System.out.println("i = " + i);
        a1[i] = st1; // a1[0] 關聯到st1
        
        i += 1; // i++ 也可以 即+1
        System.out.println("i = " + i);
        
        a1[i] = st2; // a1[1] 關聯到st2
        
        i += 1; // i++ 也可以 即+1
        System.out.println("i = " + i);
        a1[i] = st3;
        
        System.out.println("-----------------------");
        
        System.out.println("a1 = " + Arrays.toString(a1));
        
        System.out.println("-----------------------");
        // 用 for 逐項讀取陣列
        for (int j = 0; j < a1.length; j++) {
            System.out.println("j = " + j);
            if (a1[j] == null) {
                System.out.println("學生物件不存在");
            } else {
                System.out.println(a1[j].name + " " + a1[j].eng + " " + a1[j].math);
            }
        }
    }

}
