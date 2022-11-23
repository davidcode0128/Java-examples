/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

import java.util.Scanner; // 載入程式

/**
 *
 * @ author ckorsock1
 */
public class Ex12輸入資料 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Scanner 是一種資料類型 (通常第一個字大寫)
        // sc 是變數名稱
        
        // System.in 代表鍵盤輸入裝置
        // Big5 代表文字編碼 (Windows 文字模式採 Big5 編碼)
        
        // 建立某種東西
    Scanner sc;
    sc = new Scanner(System.in , "Big5" ); // 指定正確編碼，讓中文輸入沒問題
    
    // 宣告變數 (集中在一處)
    String name; // 字串類型
    int eng;
    double math;
    
    
    // Scanner 幾個常用輸入功能
    //        nextLine()   輸入一行字串
    //        nextInt()    輸入整數
    //        nextDouble() 輸入浮點數
        System.out.println("請輸入名字: ");
    name = sc.nextLine();
    
        System.out.println("請輸入英文成績: ");
    eng = sc.nextInt();
    
        System.out.println("請輸入數學成績: ");
    math = sc.nextDouble();
    
    System.out.println("-----您輸入的資料如下-----");
    
    String s;  // 字串類型
    // 利用 += 組合字串
        s = "name: " + name + "\n"; // \n 換行符號
        s += "eng: " + eng + "\n";
        s += "math: " + math + "\n";
    // 輸出組合好的字串
        System.out.println(s);
    }
    
}
