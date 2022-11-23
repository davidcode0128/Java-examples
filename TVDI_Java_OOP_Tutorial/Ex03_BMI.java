/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java_OOP_物件導向;

/**
 *
 * @author ckorsock1
 */
public class Ex03_BMI {

    // 定義欄位(基本資料)
    String name; // 預設值 Null (空值)
    double 身高cm; // 預設值 0.0
    double 體重kg;
    double bmi;

        // 定義方法 (方法內自動隱含this參考變數)
        public void 計算bmi() {
        // this 自動綁定調用(呼叫)者
        // this = a
        // 宣告 方法 區域變數(像是方法內部私有變數)
        double m公尺; // 只能在方法內部使用 其他程式看不到
        m公尺 = this.身高cm / 100.0;
        this.bmi = this.體重kg / (m公尺 * m公尺);
        System.out.println("計算完成" + this.bmi);
        }
        // 定義方法 (方法內自動隱含this參考變數)
        public void 顯示() {
        // this 自動綁定調用(呼叫)者
        // this = a    
            System.out.println("---------顯示---------");
            System.out.println(this.name);
            System.out.println(this.身高cm + "cm");
            System.out.println(this.體重kg + "kg");
            System.out.println("BMI = " + this.bmi);
            System.out.println("");
    }
}

