package static_類別靜態成員;

/**
 *
 * @author User
 */
public class StaticCallerClass {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double p = Math.PI;        // 靜態欄位
        double d = Math.random(); // 靜態方法
        
        StaticUtilityClass.printMessage(); // 靜態方法
        
        StaticUtilityClass sm = new StaticUtilityClass();
        sm.printMessage(); // 用物件參考呼叫靜態方法 ( 避免這樣寫，容易誤會)
        
        Student st1 = new Student();
        Student st2 = new Student();
        System.out.println("count: " + Student.getCount());
        System.out.println("st1.id = " + st1.getId());
        System.out.println("st2.id = " + st2.getId());
        sameClassMethod(); // 呼叫 同類別 類別方法 ( 靜態方法 )
    }
public static void sameClassMethod(){
    System.out.println("執行同類別裡的類別方法( 靜態方法 )");
}
}
