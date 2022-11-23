/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package 作業BMI;
import java.util.HashMap;
import java.util.Map;
/**
 *
 * @author User
 */
public class bmiModel {
    private double 身高cm = 0.0;
    private double 體重kg = 0.0;
    private double bmi = 0.0;
    private String result = "result";
    private static final Map<String, Double> map = new HashMap();

    public bmiModel() {
    }

   /* public bmiModel(double 身高cm, double 體重kg) {        
        this.map.put("身高cm", 身高cm);
        this.map.put("體重kg", 體重kg);
    }*/

    public void set身高cm(double 身高cm) {
        this.map.put("身高cm", 身高cm);
    }

    public void set體重kg(double 體重kg) {
        this.map.put("體重kg", 體重kg);
    }

    public String get身高cm() {
        double 身高cm = this.map.get("身高cm");
        return String.format("%.1f", 身高cm);
    }

    public String get體重kg() {
        double 體重kg = this.map.get("體重kg");
        return String.format("%.1f", 體重kg);
    }

    public String getBmi() {
        double m公尺; // 只能在方法內部使用 其他程式看不到
        m公尺 = this.map.get("身高cm") / 100.0;
        double bmi = this.map.get("體重kg") / (m公尺 * m公尺);
        return String.format("%.2f", bmi);
    }
    public String getResult(){
        double m公尺; // 只能在方法內部使用 其他程式看不到
        m公尺 = this.map.get("身高cm") / 100.0;
        double bmi = this.map.get("體重kg") / (m公尺 * m公尺);
        if (bmi < 18.5) {
            return "體重過輕";
        }
        if (bmi >= 24.0) {
            return "體重過重";
        }
        else {
            return "正常範圍";
        }
    }
}
