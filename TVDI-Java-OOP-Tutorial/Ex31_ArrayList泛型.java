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
public class Ex31_ArrayList泛型 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // 相當於 Ex29_Student[] array;
        ArrayList<Ex29_Student> al;
        al = new ArrayList();
        // al.add(100); 只接受 Ex29_Student 類型
        al.add(new Ex29_Student("Tom", 100, 99)); // 第0項
        al.add(new Ex29_Student("Amy", 90, 95)); // 第1項
        al.add(new Ex29_Student("Jo", 60, 65)); // 第2項
        System.out.println(al);
        System.out.println("size = " + al.size());
        
        for (Ex29_Student st : al) {
            // System.out.println(st.toString()); // toString() 可省略
            System.out.println(st);
        }
        System.out.println("----------- 修改 ------------");
        Ex29_Student st;  // 物件的參考變數(關聯到物件資料)
        st = al.get(0); // 當初宣告時已經限定是 Ex29_Student 類型
        st.setEng(10);
        st.setMath(50);
        st.setName("Tommy");
        
        for (Ex29_Student st1 : al) {
            // System.out.println(st.toString()); // toString() 可省略
            System.out.println(st1);
        }
    }
    
}
