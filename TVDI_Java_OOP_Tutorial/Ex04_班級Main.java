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
public class Ex04_班級Main {

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
        st2.eng = 80;
        st2.math = 84;

        Ex04_班級資料 c1;
        c1 = new Ex04_班級資料();
        c1.setName("甲班");
        c1.setSt1(st1);
        
        Ex04_班級資料 c2;
        c2 = new Ex04_班級資料();
        c2.setName("乙班");
        c2.setSt1(st2);

        Ex04_班級顯示 out;
        out = new Ex04_班級顯示();
        out.setData(c1);
        out.show();
        out.setData(c2);
        out.show();
    }

}
