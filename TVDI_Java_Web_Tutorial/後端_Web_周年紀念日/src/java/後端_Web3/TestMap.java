/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package 後端_Web3;

import java.util.Map;
import java.util.HashMap;
        
/**
 *
 * @author User
 */
public class TestMap {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Map<String, String> a = new HashMap<>();
        a.put("Steve", "iPhone");
        a.put("Bill", "Windows 10");
        a.put("1", "Paper");
        a.put("100", "中正區");
        a.put("Yin", "帥哥");
        
        System.out.println(a.get("100"));
    }
    
}
