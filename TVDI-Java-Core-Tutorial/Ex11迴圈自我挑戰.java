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
public class Ex11迴圈自我挑戰 {

    /**
     * @param args the command line arguments
     */
    
    /* 
     賦值運算符號
     += 賦予加
     -= 賦予減
     比較運算符號
     ==相等
     !=不相等
     邏輯運算符號
     && 且
     || 或
     !  非*/
    public static void main(String[] args) {
    int a1;
    a1 = (int)(Math.random()* 3 ) +1;
        System.out.println(" a1 = " + a1 );
    boolean x;
    x = true;
    
    while (x) {            
    int a2;
    a2 = (int)(Math.random() * 3 ) +1;
        System.out.println(" a2 = " + a2 );
    int a3;
    a3 = (int)(Math.random() * 3 ) +1;
        System.out.println(" a3 = " + a3 );
            if ( a3 == a2 || a3 == a1 || a2 == a1 ) {   //a3 重複了 a2 或 a1
                System.out.println("重複了");
            }
    else
    {
        x = false;
        System.out.println("迴圈結束");
    }
}                
}
}
    
