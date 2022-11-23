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
public class Ex23輸入的字串轉換成數字 {

    /** Integer.parseInt() throws NumberFormatException
     *  https://docs.oracle.com/javase/8/docs/api/java/lang/Integer.html#parseInt-java.lang.String-
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in, "Big5");

        // 實務上，鍵盤輸入的資料，會先以字串儲存，再轉換成其他類型
        // 字串轉整數 Integer.parseInt() 可能產生例外 NumberFormatException
        // 建立好習慣 宣告變數指定初值
        String 字串 = "";
        int 整數 = 0;
        // try 包含可能例外程式
        try {
            System.out.println("請輸入整數:");
            字串 = sc.nextLine();
            整數 = Integer.parseInt(字串);
            System.out.println("轉換整數成功" + 整數);
        // catch 捕捉例外
        } catch (NumberFormatException 變數) {
        // 使用System.err 輸出紅色錯誤訊息
            System.err.println("------ 例外處裡 開始 ------");
            
            System.err.println(字串 + " 不是有效的整數格式");
            System.err.println("");
            
            System.err.println("例外訊息");
            System.err.println(變數.getMessage());
            System.err.println("");
            
            System.err.println("例外程式資訊");
            變數.printStackTrace();
            System.err.println("");
            
            System.err.println("------ 例外處理 結束 ------");
        }
    }

}
