/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;
import java.util.Scanner;
/**
 *
 * @ author ckorsock1
 */
public class Ex25方法 {
    // public static 返回值類型 方法名稱( 參數 )
    public static void hi(){
        System.out.println("你好");
    }
    public static void main(String[] args) {
        hi();
        hi();
        hi2();
        hi3("Tom");        
        // int x 是 main 主方法的區域變數，其他方法不可見
        int x = 加總(100 , 99); // x 會收到加總的返回值
        System.out.println("加總 = " + x);
 }
    // 方法可以隨意位置放 不影響
    public static void hi2(){
        System.out.println("你好2");
    }
    public static void hi3(String name){
        System.out.println("你好3 " + name);
    }
    public static int 加總(int a , int b){
        // int a , b , c 都是加總的區域變數，其他方法不可見
        int c = a + b;
        return c;
    }
}


 

