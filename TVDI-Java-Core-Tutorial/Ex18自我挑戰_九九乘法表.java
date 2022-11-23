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
public class Ex18自我挑戰_九九乘法表 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
            // 自我挑戰 輸出九九乘法表
        for (int i = 1; i <= 9; i++) {
            System.out.println();
            for (int j = 1; j <= 9; j++) {
                System.out.printf("%5d ", i*j);   // 殷老師版本
                
            }
            }
        
        for (int i = 1; i <= 9; i++) {  // 網路搜尋版本
            System.out.println();
            for (int j = 1; j <= 9; j++) {
                        int x = i * j;
                            
                if (x < 10) {

                    System.out.printf(" %d  ", x);

                } else {

                    System.out.printf(" %d ", x);

                }
    }
    
}
    }
}