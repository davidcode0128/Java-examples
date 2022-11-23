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
public class Ex04_班級顯示 {

    // 欄位
    private String name;
    private Ex04_班級資料 data;

    // 方法
    public void setData(Ex04_班級資料 data) {
        System.out.println("------ 班級顯示 setData ------");
        if (data == null) {
            System.out.println("班級 setData 失敗，不能是null");
            return;
        }
        this.data = data;
        System.out.println("data 設定成功");
    }

    public void show() {
        System.out.println("------ 班級顯示 show------");
        System.out.println(this.data.getName());
        System.out.println(this.data.getSt1().name);
        System.out.println(this.data.getSt1().eng);
        System.out.println(this.data.getSt1().math);
    }
}
