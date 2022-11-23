/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

/**
 *
 * @ author ckorsock1
 */
public class Ex08亂數 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    double a;
    a = Math.random();
        System.out.println("a = " + a);
    double b;
    b = a * 10.0;
        System.out.println("b = " + b);
    int c;
    c = (int)(a * 10.0);
        System.out.println("c = " + c); // 0~9的亂數
    int d;
    d = (int)(a * 10.0) + 1;
        System.out.println("d = " + d); // 1~10的亂數
    }
    
}
