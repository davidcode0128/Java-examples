/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java_OOP_物件導向;

import java.util.Scanner;

/**
 *
 * @author ckorsock1
 */
public class Ex34_MapMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Ex34_BMI bmi;
        bmi = new Ex34_BMI("",0,0);
        
        try {
            
        Scanner sc = new Scanner(System.in, "Big5");
        System.out.println("請輸入 name: ");
        String name = sc.nextLine();
        System.out.println("請輸入 身高cm: ");
        double 身高cm = sc.nextDouble();
        System.out.println("請輸入 體重kg");
        double 體重kg = sc.nextDouble();
        
        bmi.setName(name);
        bmi.set身高cm(身高cm);
        bmi.set體重kg(體重kg);
        
        System.out.println("------------ 取值 ------------");
        System.out.println(bmi.getName());
        System.out.println(bmi.get身高cm());
        System.out.println(bmi.get體重kg());        
    }
     catch (Exception e) {
         System.out.println("資料無效 請重新輸入");
        }
}
}
