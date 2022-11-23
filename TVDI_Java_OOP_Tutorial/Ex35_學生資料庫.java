/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java_OOP_物件導向;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ckorsock1
 */
public class Ex35_學生資料庫 {

    private ArrayList<Ex29_Student> a;

    public Ex35_學生資料庫(){
        this.a = new ArrayList();
    }
    
    public ArrayList<Ex29_Student> get所有學生() {
        return a;
    }
    
    public void 新增學生(Ex29_Student st) {   
        this.a.add(st);
    }

    public String toString() {
        String s = "";
        for (Ex29_Student st : a) {
            s += st.toString() + "\n";
        }
        return s;
    }
}
