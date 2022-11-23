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
 * @ author ckorsock1
 */
public class Ex24自我挑戰_樂透號碼 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc;
        sc = new Scanner(System.in, "Big5");
        int[] 樂透號碼 = new int[6];
        boolean x = true;
        while (x) {
            for (int i = 0; i < 樂透號碼.length; i++) {
                // %d 整數格式
                // %s 字串格式
                // \n 換行
                System.out.printf("請輸入第 %d 個 樂透號碼(1~49): ", i);
                樂透號碼[i] = sc.nextInt();
            }

            if (樂透號碼[0] > 49 || 樂透號碼[0] <= 0) {
                System.out.println("號碼無效，請重新輸入");
            } else {
                x = false;
            }
            if (樂透號碼[1] > 49 || 樂透號碼[1] <= 0) {
                System.out.println("號碼無效，請重新輸入");
            } else {
                x = false;
            }
            if (樂透號碼[2] > 49 || 樂透號碼[2] <= 0) {
                System.out.println("號碼無效，請重新輸入");
            } else {
                x = false;
            }
            if (樂透號碼[3] > 49 || 樂透號碼[3] <= 0) {
                System.out.println("號碼無效，請重新輸入");
            } else {
                x = false;
            }
            if (樂透號碼[4] > 49 || 樂透號碼[4] <= 0) {
                System.out.println("號碼無效，請重新輸入");
            } else {
                x = false;
            }
            if (樂透號碼[5] > 49 || 樂透號碼[5] <= 0) {
                System.out.println("號碼無效，請重新輸入");
            } else {
                x = false;
            }
        }
        int[] 開獎號碼 = new int[7];
        for (int i = 0; i < 7; i++) {

            開獎號碼[i] = (int) Math.floor(Math.random() * 49 + 1);

            for (int j = 0; j < i; j++) {//檢查有無重覆

                if (開獎號碼[i] == 開獎號碼[j]) {//有重覆重抽一次

                    i--;

                    break;

                }

            }

        }
System.out.println("您的號碼: " + Arrays.toString(樂透號碼));
System.out.print("本期開獎號碼: ");

        for (int z = 0; z < 7; z++) {

            System.out.print(開獎號碼[z] + " ");
        }
        System.out.println("");
                System.out.println("開獎結束");
            }
}
