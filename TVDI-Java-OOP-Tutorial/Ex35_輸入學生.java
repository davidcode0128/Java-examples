/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java_OOP_物件導向;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 *
 * @author ckorsock1
 */
public class Ex35_輸入學生 {
    private Map<String, Object> map = new HashMap();

    public Ex35_輸入學生() {
        this.map = new HashMap();
    }
    public String Name;
    public double Eng;
    public double Math;
    
    public void 輸入(){
        Scanner sc = new Scanner(System.in, "Big5");
        System.out.println("請輸入學生名稱: ");
        String Name = sc.nextLine();
        map.put("Name", Name);
        System.out.println("請輸入英文成績: ");
        double Eng = sc.nextDouble();
        map.put("Eng", Eng);
        System.out.println("請輸入數學成績: ");
        double Math = sc.nextDouble();
        map.put("Math", Math);
    }
    
public String getName(){
    return (String)map.get("Name");
}    
public double getEng(){
    return (double)map.get("Eng");
}    
public double getMath(){
    return (double)map.get("Math");
}    
}
