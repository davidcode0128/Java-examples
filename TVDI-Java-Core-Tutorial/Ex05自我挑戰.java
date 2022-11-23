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
public class Ex05自我挑戰 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        long myNum = 15000000000L; 
        System.out.println(myNum); 
        
        // 大數字之間 可使用底線分隔 方便閱讀
        long 獎金1 = 2_000_000_000L; //20億
        long 獎金2 = 3_000_000_000L; //30億
        long 總獎金 = 獎金1 + 獎金2;
            System.out.println(總獎金);
    }
    
}
