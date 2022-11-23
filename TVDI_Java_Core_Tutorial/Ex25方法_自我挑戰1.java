/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

import java.util.Scanner;

/**
 *
 * @ author ckorsock1 設計一個 平均() 方法，有兩個整數參數，並讓返回值為浮點數
 */
public class Ex25方法_自我挑戰1 {

    public static double 平均(double a, double b) {
        Scanner sc;
        String 字串a = "";
        String 字串b = "";
        sc = new Scanner(System.in, "Big5");
        字串a = sc.nextLine();
        字串b = sc.nextLine();
        a = Double.parseDouble(字串a);
        b = Double.parseDouble(字串b);
        double c = (a + b) / 2;
        System.out.println(c);
        return c;
    }

    public static void main(String[] args) {
        平均(0, 0);
    }

}
