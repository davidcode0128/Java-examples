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
public class Ex15綜合練習01學生成績登入輸入 {

    /**
     * @param args the command line arguments 輸入姓名 密碼 驗證 輸入成績顯示平均 評語是否合格
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
        int eng;
        int math;
        int chi;
        int soc;
        int sci;

        System.out.println(name);

        System.out.println("請輸入國文成績: ");
        chi = sc.nextInt();

        System.out.println("請輸入英文成績: ");
        eng = sc.nextInt();

        System.out.println("請輸入數學成績: ");
        math = sc.nextInt();

        System.out.println("請輸入社會成績: ");
        soc = sc.nextInt();

        System.out.println("請輸入自然成績: ");
        sci = sc.nextInt();

        System.out.println("-----您輸入的資料如下-----");

        String s;  // 字串類型
        // 利用 += 組合字串
        s = "名字: " + name + "\n"; // \n 換行符號
        s += "國文成績: " + chi + "分" + "\n";
        s += "英文成績: " + eng + "分" + "\n";
        s += "數學成績: " + math + "分" + "\n";
        s += "社會成績: " + soc + "分" + "\n";
        s += "自然成績: " + sci + "分" + "\n";
        // 輸出組合好的字串
        System.out.println(s);
        int tot = eng + math + chi + soc + sci;
        double avg = (double) tot / 5.0;
        System.out.println("平均分數 :"+ avg);
        if (avg > 90.0) {
            System.out.println("好棒棒");
        }
        if (avg > 70.0) {
            System.out.println("相當普通");
        }
        if (avg > 60.0) {
            System.out.println("有點爛");
        } else {
            System.out.println("爛透了");
        }
    }

}
