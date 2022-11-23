/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java_OOP_物件導向;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author ckorsock1
 */
public class Ex34_Map {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // List 介面
        // 透過 整數索引 存取 value 值
        
        // Map 介面
        // 透過 Key 存取 value 值
        // Key 資料類型 沒有限制 接受任意類型資料
        // value 資料類型 沒有限制 接受任意類型資料
        Map<String, Object> map = new HashMap();
       
        // Map 使用put() 新增資料
        String Key_name = "name";
        String value_name = "Tom";
        map.put(Key_name, value_name);
        
        String Key_身高cm = "身高cm";
        double value_身高cm = 170.0;
        
        map.put(Key_身高cm, value_身高cm);
        
        // 省去宣告 key , value 變數
        map.put("體重kg", 70.0);
        System.out.println(map);
        
        // Map 使用 get() 讀取資料
        // String name = (String) map.get( key_name )
        String name = (String) map.get("name"); // Object 轉型 String
        System.out.println(name);
        double 身高cm = (double) map.get("身高cm"); // Object 轉型 double
        System.out.println(身高cm);
        double 體重kg = (double) map.get("體重kg");
        System.out.println(體重kg);
    }
    
}
