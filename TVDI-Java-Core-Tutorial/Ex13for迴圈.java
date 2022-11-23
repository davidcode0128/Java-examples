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
public class Ex13for迴圈 {

    /**
     * for較常用在需要巡迴一定的次數的計算
     */
    public static void main(String[] args) {
        // 變數i從0開始，若i小於10，便+1
        for (int i = 0; i <= 10; i++) {
            System.out.println( i );
        }
        System.out.println("------------------------");
        // 輸出字串i，若i從0開始，若i小於10，便+1 (不換行)
        String s = ""; // "" 表示空字串(字串裡沒有字)
        for (int i = 0; i <= 10; i++) {
            s += i ;
        }
        System.out.println( s );
        
        System.out.println("------------------------");
        // 變數i從10開始，若i大於0，便-1
        for (int i = 10; i >= 0; i--) {
            System.out.println( i );
        }
    }
    
}
