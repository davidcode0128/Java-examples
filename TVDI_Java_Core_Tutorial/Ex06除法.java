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
public class Ex06除法 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    int a = 5;
    int b = 3;
    int c = a / b;  // 商數
    int d = a % b;  // 餘數
        System.out.println("5 / 3 = " + c);
        System.out.println("5 % 3 = " + d);
        
        // 轉型
        // (double)a 暫時將變數a轉到double容器
        
    double e = (double)a / (double)b;
        System.out.println("5.0 / 3.0 = " + e);
        // printf 格式化輸出
        // %.2f 小數兩位
        // \n 換行
        System.out.printf("5.0 / 3.0 = %.1f \n", e);
    }
    
}
