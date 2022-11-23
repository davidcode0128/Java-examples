/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package 作業01;

import java.util.ArrayList;

/**
 *
 * @author ckorsock1
 */
public class 作業01_輸出學生test {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    作業01_學生資料庫 db = new 作業01_學生資料庫();
    作業01_總分計算器1 totTest1 = new 作業01_總分計算器1();
    作業01_總分計算器2 totTest2 = new 作業01_總分計算器2();
    作業01_輸出學生 outTest = new 作業01_輸出學生(db, totTest1, totTest2);
    作業01_學生資料 st1 = new 作業01_學生資料();
    // 顯示方法 1
    st1.setName("Tom");
    st1.setEng(80);
    st1.setMath(50);
    outTest.顯示(st1);
    作業01_學生資料 st2 = new 作業01_學生資料();
    st2.setName("Amy");
    st2.setEng(50);
    st2.setMath(20);
    outTest.顯示(st2);
    // 顯示方法 2
    ArrayList<作業01_學生資料> a;
        a = db.get所有學生();
        db.新增學生(st1);
        db.新增學生(st2);
        for (作業01_學生資料 st : a) {
            outTest.顯示(st);
        }
    // 顯示方法 3
       outTest.顯示資料庫();
    }
    
}
