/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java_OOP_物件導向;

/**
 * 執行流程 輸入 2個 學生資料 建立 2個 學生物件 將 2個 學生物件 放入 學生資料庫 輸出 學生資料庫，顯示所有學生資料與總分
 */
public class Ex35_Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Ex35_輸入學生 in = new Ex35_輸入學生();
        Ex35_學生資料庫 db = new Ex35_學生資料庫();
        Ex35_總分計算器1 tot1 = new Ex35_總分計算器1();
        Ex35_總分計算器2 tot2 = new Ex35_總分計算器2();
        Ex35_輸出學生 out = new Ex35_輸出學生(db, tot1, tot2);

        Ex29_Student st = null;
        
        for (int i = 0; i < 2; i++) {
            in.輸入();
            st = new Ex29_Student();
            st.setName(in.getName());
            st.setEng(in.getEng());
            st.setMath(in.getMath());
            db.新增學生(st);
        }
        out.顯示資料庫();
    }

}
