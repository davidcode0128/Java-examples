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
public class Ex04運算 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    int eng = 100;
    int math = 80;
    int ch = 85;
    int sci = 20;
    int soc = 10;
    int tot = eng + math + ch + sci + soc;
    
     //(double)tot 將tot暫時轉變到double容器，讓資料變成浮點數類型
     
    double avg = (double)tot / 5.0; //浮點數運算 資料必須是浮點數
    
    
        System.out.println("英文成績" + eng);
        System.out.println("數學成績" + math);
        System.out.println("國文成績" + ch);
        System.out.println("自然成績" + sci);
        System.out.println("社會成績" + soc);
        System.out.println("總分" + tot);
        System.out.println("平均" + avg);
    }
}
