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
public class Ex07常見數學運算 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println( Math.sqrt(64.0));  // 平方根
        System.out.println( Math.pow(8.0, 2.0)); // 次方
        System.out.println( Math.random());  // 0.0 <= 亂數 < 1.0
        System.out.println( Math.max(5, 10));  // 最大值
        System.out.println( Math.abs(-5.6));  //  絕對值
        int randomNum = (int)(Math.random() * 101);  //  取0~100的亂數
        System.out.println(randomNum);
        
        long randomNum1 = (long)(Math.random()* 1000000000000001L);  //取極大數字的亂數
        System.out.println(randomNum1);
    }
    
}
