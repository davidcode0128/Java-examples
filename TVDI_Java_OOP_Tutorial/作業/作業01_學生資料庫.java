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
public class 作業01_學生資料庫 {

    private ArrayList<作業01_學生資料> data;
    
    public 作業01_學生資料庫(){
        this.data = new ArrayList();
    }
    public ArrayList<作業01_學生資料> get所有學生() {
        return data;
    }
    
    public void 新增學生(作業01_學生資料 st) {
        this.data.add(st);
    }

    public String toString() {
        String s = "";
        for (作業01_學生資料 st : data) {
            s += st.toString() + "\n";
        }
        return s;
    }
}
