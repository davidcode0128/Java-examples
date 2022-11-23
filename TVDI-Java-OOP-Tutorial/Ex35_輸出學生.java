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
public class Ex35_輸出學生 {

    private Ex35_學生資料庫 db;
    private Ex35_總分計算器1 tot1;
    private Ex35_總分計算器2 tot2;

    // 建構子
    public Ex35_輸出學生(Ex35_學生資料庫 db, Ex35_總分計算器1 tot1, Ex35_總分計算器2 tot2){
        this.db = db;
        this.tot1 = tot1;
        this.tot2 = tot2;
    }
    public void 顯示(Ex29_Student st){
        System.out.println(st.toString() + " 總分 " + tot1.總分(st.getEng(),st.getMath()));
        System.out.println(st.toString() + " 加權總分 " + tot2.總分(st.getEng(),st.getMath()));
    }
    public void 顯示資料庫() {
        ArrayList<Ex29_Student> a;
        a = db.get所有學生();
        for (Ex29_Student st : a) {
            顯示(st);
        }
    }
}
