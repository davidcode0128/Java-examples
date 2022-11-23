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
public class Ex12輸入資料自我挑戰3 {

    /**
     * 輸入2個樂透號碼，範圍1~42，超出範圍或重複，要求重新輸入
     */
    public static void main(String[] args) {
    Scanner sc;
    sc = new Scanner(System.in , "Big5");
    int a;
    int b;
    
        System.out.println("請輸入第一個樂透數字1~42: ");
    a = sc.nextInt();
    
        System.out.println("請輸入第二個樂透數字1~42: ");
    b = sc.nextInt();
    
    if ( a == b ) {
            System.out.println("數字重複了，請重新輸入");
            }
    if ( a > 42 ) {
            System.out.println("第一個數字無效，請重新輸入");
        }
    if ( b > 42 ) {
            System.out.println("第二個數字無效，請重新輸入");
        }
    }
    
}
