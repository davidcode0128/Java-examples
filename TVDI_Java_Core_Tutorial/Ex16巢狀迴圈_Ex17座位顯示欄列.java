/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

/**
 *
 * @ author ckorsock1
 */
public class Ex16巢狀迴圈_Ex17座位顯示欄列 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("   A  B  C  D  E  F  G  H  I  J"); // 使第一欄顯示A~J
        for (int K = 1; K <= 9; K++) {

            System.out.print(K + "  "); // 讓每一列顯示數字
            for (int i = 0; i < 10; i++) {
                System.out.print("O  "); // 用print使O不換行
            }
            System.out.println(""); //  再用一個println使出現10個O以後換行
        }

        char c = 'A';
        // System.out.println(c); // A

        c += 1;
        // System.out.println(c); // B
        int x = 0;
        int y = 1;

        System.out.println("   A  B  C  D  E  F  G  H  I  J");

        for (int j = 1; j <= 9; j++) {

            System.out.print(j + "  "); // 讓每一列顯示數字
            for (int i = 0; i < 10; i++) {
                if (y == j && i == x) {
                    System.out.print("x  ");
                } else {
                    System.out.print("O  "); 
                }
            }
            System.out.println("");
        }
    }
}
