/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package 作業01;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 *
 * @author ckorsock1
 */
public class 作業01_輸入學生 {

    private Map map;
    public 作業01_輸入學生(){
        this.map = new HashMap();
    }
    public void 輸入() {
        Scanner sc = new Scanner(System.in, "Big5");
        System.out.println("請輸入學生名稱: ");
        String Name = sc.nextLine();
        this.map.put("學生名稱", Name);
        System.out.println("請輸入英文成績: ");
        double Eng = sc.nextDouble();
        this.map.put("Eng", Eng);
        System.out.println("請輸入數學成績: ");
        double Math = sc.nextDouble();
        this.map.put("Math", Math);
    }

    public String getName() {
        return (String) map.get("學生名稱");
    }

    public double getEng() {
        return (double) map.get("Eng");
    }

    public double getMath() {
        return (double) map.get("Math");
    }
    @Override
    public String toString() {
        return "學生" + "map=" + map + '}';
    }
    
}
