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
public class Ex15巢狀迴圈2輸入密碼 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in, "Big5");
    // "" 表示空字串 (字串裡沒有字)
    String pass = "";  // 迴圈內部使用此變數，必須設定初始值
    boolean ok = false; // 密碼輸入是否正確，初始值 false
    
    for (int i = 1; i <= 3; i++) {
        // printf 格式化輸出
        // %d 整數
        // %2d 2位整數
        // %02d 2位整數，位數不足前面補0
        System.out.printf("-----第 %d 次-----\n", i);
        // System.out.printf("-----第 %2d 次-----\n", i);
        // System.out.printf("-----第 %02d 次-----\n", i);
    boolean x = true;
        while (x) {            
            System.out.println("請輸入密碼(4位文數字)");
            pass = sc.nextLine();
            if (pass.length() != 4) { // length() 字串長度
                System.out.println("請輸入4位文數字");
            } else {
            x = false;
            }
        } //while
        
            // 比對文字資料，須使用equals()
            // == 不是比對文字，而是判斷兩個字串記憶體位址是否相同
            if ("a123".equals(pass)) { // 變數pass若沒指定初始值，會出現語法錯誤
                ok = true;
                break; // 跳出目前迴圈 (即for) 顯示結束
            } else {
                System.out.println("密碼錯誤");
            }
            if (i < 3) {
                System.out.printf("還有 %d 次機會\n" , 3 - i);
            } else {
                System.out.println("密碼錯誤已達3次，沒有機會了");
            }
        } // for
        
        System.out.println("------------------------");
        if (ok) {
            System.out.println("歡迎光臨");
        }
        
    }
    
}
