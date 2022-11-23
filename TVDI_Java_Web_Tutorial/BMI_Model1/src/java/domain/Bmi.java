/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domain;

import java.io.Serializable;

public class Bmi implements Serializable{ // serializable
    private float cm;
    private float kg;
    
    // 無參數建構子

    public Bmi() {
    }
    // getter & setter
    public float getCm() {
        return cm;
    }

    public void setCm(float cm) {
        this.cm = cm;
    }

    public float getKg() {
        return kg;
    }

    public void setKg(float kg) {
        this.kg = kg;
    }
    public float getBmi(){
        float m;
        m = cm / 100f;
        return kg / ( m * m);
    }
}
