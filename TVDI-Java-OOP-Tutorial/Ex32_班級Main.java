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
public class Ex32_班級Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Ex32_班級 a1;
        a1 = new Ex32_班級(); // 繼承 ArrayList
        System.out.println(a1); // a1.toString()
        a1.setName("甲班");
        System.out.println(a1); // a1.toString
        // 加入學生
        // add() 是從ArrayList 繼承來的功能
        a1.add(new Ex29_Student("Tom", 100, 99));
        a1.add(new Ex29_Student("Amy", 90, 95));
        a1.add(new Ex29_Student("Jo", 60, 65));
        System.out.println(a1); // a1.toString
    }
    
}
