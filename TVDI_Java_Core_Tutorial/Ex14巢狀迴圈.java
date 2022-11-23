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
public class Ex14巢狀迴圈 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String s = "";
        for (int i = 0; i < 10; i++) {
            System.out.println("i = " + i );
            for (int j = 0; j < 10; j++) {
            System.out.println("j = " + j);
            s +=  j;
        }
            System.out.println(s);
    }
}
}    

