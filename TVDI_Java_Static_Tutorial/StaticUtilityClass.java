
package static_類別靜態成員;

/**
 *靜態方法也稱為 class method ( 類別方法 )
 * 靜態資料常被用在建構子 執行物件初執設定
 * 靜態方法不能使用 同類別 的 非靜態成員( 欄位、方法 )
 * 子類別重寫父類別靜態方法 不稱為 覆寫( override ) 所以不會發生虛擬方法的調用
 */
// 工具類別
public class StaticUtilityClass {
    // 靜態方法
    public static void printMessage(){
        System.out.println("執行此方法不需要物件");
    }
    /*
    // 錯誤示範
    public class StaticErrorClass{
    private int x;
    public static void staticMethod(){
        x = 1; // complie error (編譯失敗)
        instanceMethod(); // complie error (編譯失敗)
    }
    
    public void instanceMethod(){
        x = 2;
    }
    }
*/
}
