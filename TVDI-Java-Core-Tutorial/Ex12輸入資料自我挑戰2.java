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
public class Ex12輸入資料自我挑戰2 {

    /**
     * 輸入兩個整數，如果重複了，要求重新輸入
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
    
     if ( a == b ) {
                System.out.println("數字重複了，請重新輸入");
            }
                     
    }
}