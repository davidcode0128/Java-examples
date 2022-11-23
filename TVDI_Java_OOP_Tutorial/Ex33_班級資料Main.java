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
public class Ex33_班級資料Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Ex29_Student st1;
        st1 = new Ex29_Student("Tom",100,99); // 自動採預設值
               
        Ex29_Student st2;
        st2 = new Ex29_Student("Amy",85,80); // 自動採預設值

        Ex29_Student st3;
        st3 = new Ex29_Student("Jo",60,65);
        Ex33_班級資料 c1;
        c1 = new Ex33_班級資料("甲班");
        
        c1.add(st1);
        c1.add(st2);
        c1.add(st3);
        
        c1.show();
           
    }
    
}
