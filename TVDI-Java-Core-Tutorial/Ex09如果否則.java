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
public class Ex09如果否則 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    int eng = 100;
    int math = 0;
    int tot = eng + math;
    double avg = (double)tot / 2.0;
    
        if (avg > 90.0) {
            System.out.println("好棒棒");
        }
        if (avg > 70.0) {
            System.out.println("相當普通");
        }
        if (avg >60.0 ) {
            System.out.println("有點爛");
        }
        else {
            System.out.println("爛透了");
        }
        
    }
    
}
