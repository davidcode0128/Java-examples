/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

import java.util.Scanner;

/**
 * Double parseDouble() throws NumberFormatException
 * https://docs.oracle.com/javase/8/docs/api/java/lang/Double.html#parseDouble-java.lang.String-
 */
public class Ex24例外處理自我挑戰_字串轉浮點數_BMI {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in, "Big5");
        String 字串 = "";
        double 身高 = 0.0;
        double 體重 = 0.0;
        double BMI = 0.0;
        boolean x = true;
        while (x) {
            try {
                System.out.println("請輸入身高cm:");
                字串 = sc.nextLine();
                身高 = Double.parseDouble(字串);
                System.out.println("請輸入體重kg:");
                字串 = sc.nextLine();
                體重 = Double.parseDouble(字串);
                break;
            } catch (NumberFormatException 變數) {

                /*System.err.println("------ 例外處裡 開始 ------");*/
                System.err.println(字串 + " 不是有效的數字資料 請重新輸入資料");

                /*  
            System.err.println("例外訊息");
            System.err.println(變數.getMessage());
            System.err.println("");
            
            System.err.println("例外程式資訊");
            變數.printStackTrace();
            System.err.println("");
            
                 */
            }
        }

        BMI = 體重 / (身高 * 身高 * 0.0001);
        System.out.printf("您的BMI值為: %.1f \n", BMI);
        if (BMI < 18.5) {
            System.out.println("體重過輕");
        }
        if (BMI > 18.5 && BMI < 24 ) {
            System.out.println("正常範圍");
        }
        if (BMI >= 24) {
            System.out.println("體重過重");

        }
    }
}
