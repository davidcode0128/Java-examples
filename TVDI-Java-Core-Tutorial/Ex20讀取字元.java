/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

import java.util.Scanner;

/**
 *
 * 用Scanner讀取輸入的字元
 */
public class Ex20讀取字元 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in, "Big5");
        String s = ""; // 空字串
        System.out.println("s長度 = " + s.length());
        boolean x = true;
        while (x) {// 或是 s.length() != 1 當s長度不為1時循環
            try {
                
                System.out.println("請輸入一個字: ");
                s = sc.nextLine();
                System.out.println("你輸入了: " + s.length() + " 個字 ");
                char c = s.charAt(0); // 取得字串第0項文字
                System.out.println("第0項文字 = " + c);
                System.out.println("第0項文字編碼值 = " + (int) c);
                System.out.println("------------------------");
                break;
            } catch (Exception c) {
                System.out.println("請重新輸入");
            }
        }
    }
}
