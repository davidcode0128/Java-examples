/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java_OOP_物件導向;

/**
 *
 * @author
 */
public class Ex04_班級資料 {

    // 欄位
    private String name;
    private Ex04_Student資料 st1; // 預設值 null
    private Ex04_Student資料 st2; // 預設值 null

    // 方法
    public String getName() {
        // this 自動綁定調用(呼叫)者
        // this = data (班級顯示 show方法有使用到)
        return this.name;
    }
    // 方法
    public Ex04_Student資料 getSt1(){
        return this.st1;
    }
    // 方法
    public Ex04_Student資料 getSt2(){
        return this.st2;
    }
    // 方法
    public void setName(String name) {
        System.out.println("------ 班級 setName ------");
        if (name == null) {
            System.out.println("班級 setData 失敗，不能是null");
            return;
        }
        this.name = name;
        System.out.println(name + " 設定成功");
    }

    // 方法
    public void setSt1(Ex04_Student資料 st1) {
        if (st1 == null) {
            System.out.println("st1 設定失敗，不能是null");
            return;
        }
        this.st1 = st1;
        System.out.println("st1 設定成功");
    }

    public void setSt2(Ex04_Student資料 st2) {
        if (st2 == null) {
            System.out.println("st2 設定失敗，不能是null");
            return;
        }
        this.st2 = st2;
        System.out.println("st2 設定成功");
    }
}
