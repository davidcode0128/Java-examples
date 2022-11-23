/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

import java.util.Arrays;

/*  如果事先不知道元素值，只知道元素個數，那可以使用new關鍵字指定長度來建立陣列。例如預先建立長度為10的陣列：
    int[] scores = new int[10];
    在Java中只要看到new，一定就是建立物件，這個語法代表了陣列就是物件。
 */
public class Ex21陣列Arrays {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Arrays.toString() 陣列資料轉成字串

        // 陣列 一行寫法
        int[] a1 = {10, 20, 30};
        System.out.println("a1 = " + Arrays.toString(a1));
        String[] c1 = {"aa", "bb", "cc"};
        System.out.println(Arrays.toString(c1));
        // 陣列 分成兩行的寫法
        String[] a2; // 字串陣列
        a2 = new String[]{"AA", "BB", "CC"};
        System.out.println("a2 = " + Arrays.toString(a2));

        // int陣列 指定長度 自動設定每項初值
        int[] a3; // 整數陣列
        a3 = new int[3]; //長度3 初值為0
        System.out.println("a3 = " + Arrays.toString(a3));
        //String陣列 初值為 null
        String[] a4;
        a4 = new String[3]; // 長度3 初值為 null (空值，字串不存在)
        System.out.println("a4 = " + Arrays.toString(a4));
        Object[] a5; // 物件陣列
        a5 = new Object[4];
        System.out.println("a5 = " + Arrays.toString(a5));
        System.out.println("------------------------");
        
        int[] b0 = {10, 20, 30};
        int[] b1 = {40};
        // 二維陣列 : 用一維陣列關聯其他一維陣列
        // b[0] b陣列第0項 關聯到 b0
        // b[1] b陣列第1項 關聯到 b1
        int[][] b = {b0, b1};
        
        System.out.println("b0 長度: " + b0.length); // 3
        System.out.println("b1 長度: " + b1.length); // 1
        System.out.println("b 長度: " + b.length); // 2
        
        System.out.println("b0[0] = " + b0[0]); // 10
        System.out.println("b1[0] = " + b1[0]); // 40
        System.out.println("b[0] = " + b[1][0]); // 40
    }

}
