/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * 學生登入並自行輸入科目名稱及成績系統
 */
public class Ex24綜合練習_學生登入成績輸入系統 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc;
        sc = new Scanner(System.in, "Big5");
        String name;

        System.out.println("請輸入您的名字: ");
        name = sc.nextLine();

        String pass = "";
        boolean ok = false;
        for (int i = 1; i <= 3; i++) {
            System.out.printf("-----第 %d 次-----\n", i);
            boolean x = true;
            while (x) {
                System.out.println("請輸入密碼(4位文數字)");
                pass = sc.nextLine();
                if (pass.length() != 4) {
                    System.out.println("請輸入4位文數字");
                } else {
                    x = false;
                }
            }
            if ("a123".equals(pass)) {
                ok = true;
                break;
            } else {
                System.out.println("密碼錯誤");
            }
            if (i < 3) {
                System.out.printf("還有 %d 次機會\n", 3 - i);
            } else {
                System.out.println("密碼錯誤已達3次，沒有機會了");
            }
        }
        System.out.println("------------------------");
        if (ok) {
            System.out.println("歡迎光臨");
        }

        String 字串 = "";
        String 科目[] = new String[5];
        int 成績[] = new int[5];

    /*    System.out.println("科目: " + Arrays.toString(科目));
        System.out.println("成績" + Arrays.toString(成績));
        System.out.println("");*/

        for (int i = 0; i < 科目.length; i++) {
            //%d 整數格式
            System.out.printf("請輸入第 %d 項 科目名稱: ", i);
            科目[i] = sc.nextLine();
        }
        System.out.println("科目" + Arrays.toString(科目));
        System.out.println("");
        for (int i = 0; i < 成績.length; i++) {
            // %d 整數格式
            // %s 字串格式
            // \n 換行
            System.out.printf("請輸入第 %d 項 科目成績: ", i);
            成績[i] = sc.nextInt();
        }
        System.out.println("科目" + Arrays.toString(科目));
        System.out.println("成績" + Arrays.toString(成績));
        System.out.println("");

        System.out.println("-----------------------");
        for (int i = 0; i < 成績.length; i++) {
            int 成 = 成績[i];
            String 科 = 科目[i];
            System.out.printf("%s %d\n", 科, 成);
        }
        System.out.println("-----您輸入的資料如下-----");
        //加總
        double sum = 0;
        for(int i = 0; i < 成績.length ;i++) {
			sum += 成績[i];
        }
        //平均                
        double avg= sum / 成績.length;
        System.out.println("平均分數 :"+ avg);
        if (avg >= 85.0) {
            System.out.println("好棒棒");
        }
        if (avg >= 70.0 && avg <= 85) {
            System.out.println("相當普通");
        }
        if (avg >= 60.0 && avg <= 70) {
            System.out.println("有點爛");
        } 
        if (avg < 60) {
            System.out.println("爛透了");
        }
    }
}