/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package 後端_Web3;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author User
 */
public class AnniversaryModel {

    private int year = 1; // 結婚幾周年
    private static final Map<Integer, String> map = new HashMap(); // Map <索引, 值> 像是可自訂索引編號的陣列

    // 無參數建構子
    public AnniversaryModel() {

        map.put(1, "Paper" );
        map.put(2, "Cotton" );
        map.put(3, "Leather" );
        map.put(4, "Linen, Silk" );
        map.put(5, "Wood" );
        map.put(6, "Iron" );
        map.put(7, "Wool, Copper" );
        map.put(8, "Bronze" );
        map.put(9, "Pottery, China" );
        map.put(10, "Tin, Aluminum" );
        map.put(11, "Steel" );
        map.put(12, "Silk" );
        map.put(13, "Lace" );
        map.put(14, "Ivory" );
        map.put(15, "Crystal" );
        map.put(20, "China" );
        map.put(25, "Silver" );
        map.put(30, "Pearl" );
        map.put(35, "Coral" );
        map.put(40, "Ruby" );
        map.put(45, "Sapphire" );
        map.put(50, "Gold" );
        map.put(55, "Emerald" );
        map.put(60, "Diamond" );
    }
    // setter
    public void setYear(int year) {
        this.year = year;
    }
    // getter
    public int getYear() {
        return year;
    }
    // getter
    public String getMaterial() { // JSP 透過 ${model.material} 讀取資料
        return map.get(year);
    }
 

}
