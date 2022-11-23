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
public class 作業01_輸出學生 {
    
    private 作業01_學生資料庫 db;
    private 作業01_總分計算器1 tot1;
    private 作業01_總分計算器2 tot2;

    public 作業01_輸出學生(作業01_學生資料庫 db, 作業01_總分計算器1 tot1, 作業01_總分計算器2 tot2) {
        this.db = db;
        this.tot1 = tot1;
        this.tot2 = tot2;
    }
    
    public void 顯示(作業01_學生資料 st){
        System.out.println(st.toString() + " 總分 " + tot1.總分(st.getEng(),st.getMath()));
        System.out.println(st.toString() + " 加權總分 " + tot2.總分(st.getEng(),st.getMath()));
    }
        public void 顯示資料庫() {
        ArrayList<作業01_學生資料> a;
        a = db.get所有學生();
        for (作業01_學生資料 st : a) {
            顯示(st);
        }
    }
}