/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java_OOP_物件導向;

/**
 *
 * @author 
 */
public class Ex04_StudentMain {
    public static void main(String[] args) {
        
        Ex04_Student資料 st1 = new Ex04_Student資料(); // 自動採預設值
        st1.name = "Tom";
        st1.eng = 100;
        st1.math = 99;
        
        Ex04_Student資料 st2 = new Ex04_Student資料(); // 自動採預設值
        st2.name = "Amy";
        st2.eng = 85;
        st2.math = 80;
        Ex04_Student顯示 out = new Ex04_Student顯示(); // 自動採預設值
        
        // out.data 若尚未設定，引發例外(異常) Exception in thread "main" java.lang.NullPointerException
        out.show();
        
        // 無法使用private data
        // out.data = st1; // 設定顯示所需資料 //data has private access
        out.setData(null);
        out.setData(st1);
        // out.setData(null);
        out.show();
        out.setData(st2);
        out.show();
        System.out.println("--- END ---");
    }
    
}
