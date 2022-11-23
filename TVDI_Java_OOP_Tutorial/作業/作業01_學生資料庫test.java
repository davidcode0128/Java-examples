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
public class 作業01_學生資料庫test {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        作業01_學生資料庫 db1 = new 作業01_學生資料庫();
        作業01_學生資料 st1 = new 作業01_學生資料();
         st1.setName("TOM");
        st1.setEng(90);
        st1.setMath(50);
        db1.新增學生(st1);
        作業01_學生資料 st2 = new 作業01_學生資料();
        st2.setName("AMY");
        st2.setEng(60);
        st2.setMath(20);
        db1.新增學生(st2);
        System.out.println(db1);
    }
    
}
