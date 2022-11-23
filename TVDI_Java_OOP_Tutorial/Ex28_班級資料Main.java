/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java_OOP_物件導向;

/**
 *
 * @author ckorsock1
 */
public class Ex28_班級資料Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Ex04_Student資料 st1;
        st1 = new Ex04_Student資料(); // 自動採預設值
        st1.name = "Tom";
        st1.eng = 100;
        st1.math = 99;
        
        Ex04_Student資料 st2;
        st2 = new Ex04_Student資料(); // 自動採預設值
        st2.name = "Amy";
        st2.eng = 85;
        st2.math = 80;
        
        Ex04_Student資料 st3;
        st3 = new Ex04_Student資料(); // 自動採預設值
        st3.name = "Jo";
        st3.eng = 95;
        st3.math = 75;
        
        Ex28_班級資料 c1;
        c1 = new Ex28_班級資料("甲班");
        c1.add(st1);
        c1.add(st2);
        c1.add(st3);
        
        c1.show();
    }
    
}
