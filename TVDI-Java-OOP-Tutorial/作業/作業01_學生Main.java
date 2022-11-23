/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package 作業01;

/**
 *
 * @author ckorsock1
 */
public class 作業01_學生Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    作業01_學生資料庫 db = new 作業01_學生資料庫();
    作業01_輸入學生 in = new 作業01_輸入學生();
    作業01_總分計算器1 tot1 = new 作業01_總分計算器1();
    作業01_總分計算器2 tot2 = new 作業01_總分計算器2();
    作業01_輸出學生 out = new 作業01_輸出學生(db, tot1, tot2);
    
    作業01_學生資料 st = null;
    
        for (int i = 0; i < 2; i++) {
            in.輸入();
            st = new 作業01_學生資料();
            st.setName(in.getName());
            st.setEng(in.getEng());
            st.setMath(in.getMath());
            db.新增學生(st);
        }
    out.顯示資料庫();  
    }
    
}
