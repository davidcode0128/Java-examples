/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

import java.util.Scanner;

/**
 *
 * @ author ckorsock1
 */
public class Ex12輸入資料自我挑戰1 {

    /**
     * 輸入兩個整數，顯示(整數)最大值和最小值
     */
    public static void main(String[] args) {
    Scanner sc;
    sc = new Scanner(System.in , "Big5");
    int a;
    int b;
    
        System.out.println("請輸入數字1: ");
    a = sc.nextInt();
    
        System.out.println("請輸入數字2: ");
    b = sc.nextInt();
    
    System.out.println("您輸入的資料最大值為:" );
    int c;
    c = Math.max(a, b);
        System.out.println(c);
    System.out.println("您輸入的資料最小值為:" );
    
    int d;
    d = Math.min(a, b);
        System.out.println(d);
    }
    
}
