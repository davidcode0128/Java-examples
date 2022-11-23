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
public class Ex22陣列自我挑戰_輸入3個科目成績到陣列 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in, "Big5");
        String 科目[] = new String[3];
        int 成績[] = new int[3];

        System.out.println("科目: " + Arrays.toString(科目));
        System.out.println("成績" + Arrays.toString(成績));
        System.out.println("");

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
    }

}
