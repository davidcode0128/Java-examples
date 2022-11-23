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
public class Ex04_Student顯示 {
    // 欄位
    // 設計 private 私有欄位，public set 方法
    private Ex04_Student資料 data; // 預設值 null(空值)
    
    // 方法 (內部隱含this參考變數)
    public void setData(Ex04_Student資料 data){
        // 參數 data 區域(自動)變數，方法結束自動消失
        // this = out 自動綁定
        System.out.println("----- setData -----");
        if (data == null) {
            System.out.println("設定失敗，不接受 null");
            return;
        }
        System.out.println("----- 設定成功 -----");
        this.data = data;
    }
    // 方法 (內部隱含this參考變數)
    public void show() {
        System.out.println("----- show -----");
        // this = out 當 show()被調用(呼叫)，自動綁定
        if ( this.data == null) {
            System.out.println("無法顯示: data 尚未設定");
            return; // 結束返回 沒有返回值
        } // 也可用else{}
        // 若已經 return 以下不會執行
        System.out.println(this.data.name);
        System.out.println(this.data.eng);
        System.out.println(this.data.math);
    }
}
