
package static_類別靜態成員;

/**
 * 類別的 欄位 與 方法 可宣告為靜態
 * 使用靜態欄位與方法 無須建立物件
 * 相同型別物件共享一份靜態資料
 */

// 引用類別靜態成員
import static java.lang.Math.random;
import static java.lang.Math.PI;

public class StaticImportClass {
    public static void main(String[] args) {
        // double d = Math.random();
        // double pi = Math.PI;
        
        // 可以直接使用 Math 靜態成員
        double d = random();
        double pi = PI;
    }
}
