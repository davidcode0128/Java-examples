/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package 作業BMI;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author User
 */
public class bmiModelTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double 身高cm = 0.0;
        double 體重kg = 0.0;
        Map<String, Double> map = new HashMap<>();
        map.put("身高cm", 10.0);
        map.put("體重kg", 10.0);
        System.out.println(map.get("身高cm"));
        System.out.println(map.get("體重kg"));
        bmiModel b = new bmiModel();
        b.set身高cm(180);
        b.set體重kg(90);
        map.put("身高cm", 身高cm);
        map.put("體重kg", 體重kg);
        System.out.println(b.getBmi());
        System.out.println(b.getResult());
        System.out.println(b.get身高cm());
        System.out.println(b.get體重kg());
        System.out.println(b.getBmi());
        System.out.println(b.getResult());
    }

}
