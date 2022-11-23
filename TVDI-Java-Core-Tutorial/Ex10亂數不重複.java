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
public class Ex10亂數不重複 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    int a1;
    a1 = (int)(Math.random() *3 ) + 1;  // 1~3
        System.out.println(" a1 = " + a1);
        
    int a2;
    a2 = (int)(Math.random() *3 ) + 1;  //1~3
        System.out.println(" a2 = " + a2);
    
        if (a2 == a1) {
            System.out.println("重複了");
            
        }
    }
    
}
