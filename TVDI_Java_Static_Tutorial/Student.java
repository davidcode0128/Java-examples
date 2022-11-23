package static_類別靜態成員;

/**
 * 靜態變數又稱為 類別變數( class variables )
 * 靜態資料只會有一份
 * 物件共享同一份靜態資料
 * 第一次使用類別 會先載入類別到記憶體 進行初始化(初值設定)
 */
public class Student {
    private static int counter; // 紀錄物件數量
    private int id; // 編號
    
    {
    id = 0;
        System.out.println("非靜態初始化區塊 id = " + id);
    }
    static {
    counter = 0;
        System.out.println("靜態初始化區塊 counter = " + counter);
    }
    // 建構子

    public Student() {
        System.out.println("Student 建構子");
        counter++;
        id = counter;
    }
    // getter
    public static int getCount(){
        return counter;
    }
    
    public int getId(){
        return id;
    }
}
