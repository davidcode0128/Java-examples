/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

/**
 *
 * @ author ckorsock1
 設計一個計算BMI()方法，有兩個浮點數參數，並讓返回值為浮點數
 */
public class Ex25方法_自我挑戰2 {

    public static double BMI(double 身高 , double 體重) {
        double bmi = 體重 / (身高 * 0.01 * 身高 * 0.01);
        return bmi;
    }

    public static void main(String[] args) {
        double bmi = BMI(180, 90);
        System.out.println(bmi);
        System.out.printf("BMI : %.1f \n", bmi);
        System.out.printf("您的BMI值為: %.1f \n", bmi);

    }

}
