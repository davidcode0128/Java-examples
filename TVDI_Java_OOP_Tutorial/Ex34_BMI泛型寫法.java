/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java_OOP_物件導向;

import java.util.ArrayList;

/**
 *
 * @author ckorsock1
 */
public class Ex34_BMI泛型寫法 {
    public static void main(String[] args) {
        ArrayList<Ex34_BMI> al = new ArrayList();            
        al.add(new Ex34_BMI("Tom", 100,99)); // 第0項
        al.add(new Ex34_BMI("Amy", 80, 50)); // 第1項
        al.add(new Ex34_BMI("Jo", 70, 60)); // 第2項
        System.out.println(al);
        System.out.println("size = " + al.size());
        for (Ex34_BMI bmi: al) {
            // System.out.println(st.toString()); // toString() 可省略
            System.out.println(bmi);
            /*System.out.println(bmi.getName());
            System.out.println(bmi.get身高cm());
            System.out.println(bmi.get體重kg());*/
        }
        System.out.println("----------- 修改 ------------");
        //Ex34_BMI bmi = null; // 物件的參考變數(關聯到物件資料)    
        al.set(0 ,new Ex34_BMI("Jo", 70, 60));
        /*bmi.setName("Kuo");
        bmi.set身高cm(180);
        bmi.set體重kg(90);        */
        
        for (Ex34_BMI bmi1 : al) {
            // System.out.println(st.toString()); // toString() 可省略
            System.out.println(bmi1);
        }
        
    }
}
