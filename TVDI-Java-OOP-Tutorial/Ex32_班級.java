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
public class Ex32_班級 extends ArrayList{ // extends (繼承)
    private String name;
    
    // 建構子 初值設定
    public Ex32_班級() {
        this.name = "未命名";
    }
    
    // getter & setter
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    // toString 給System.out.println 使用

    @Override
    public String toString() {
        // 返回字串
        // return "Ex32_班級名稱: " + name;
        String s;
        s = "";
        s += "Ex32_班級名稱: " + name + "\n"; // \n 換行 
        // this 即 a1 (本身就是 ArrayList 繼承來的)
        for (Object obj : this) { // 加強版 for
            // obj 代表從 ArrayList 陣列讀取到的學生
            System.out.println(obj); // obj.toString() 即 Ex29_Student.toString()
            
        Ex29_Student st;
        // st 是一種物件，但不一定是學生
        st = (Ex29_Student) obj; // Object 轉型成 Student
        s += st.getName() + "\n"; // "\n" 換行 
        }
        return s;
    }
    
}
