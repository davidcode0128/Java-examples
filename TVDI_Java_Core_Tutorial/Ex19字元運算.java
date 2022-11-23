/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

/**
 *
 * @ author ckorsock1
 */
public class Ex19字元運算 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    // char 字元類型
    // char可做整數運算
    
    int i = 'A'; // 'A' 即 65 (文字編碼值)
            System.out.println(i); // 65
            
    char c =(char)i; // 將int i 轉換成 char
        System.out.println(c); // 'A'
        
        System.out.println("------------------------");
        
        i += 1;
        c += 1;
        System.out.println(i); // 66
        System.out.println(c); // 'B'
        
        System.out.println("------------------------");
        for (int x = 65; x < 65+26; x++) {
            System.out.print(x + ": " + (char)x);
            System.out.print(" ");
        }
    }
    
}
