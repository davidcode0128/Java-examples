/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package static_類別靜態成員;

/**
 *
 * @author User
 */
public class DogInstanceTest {

    public static void main(String[] args) {
        Dog d1 = Animal.getDogInstance();
        Dog d2 = Animal.getDogInstance();        
        d1.hello();
        d2.hello();
        System.out.println("d1 == d2 is " + (d1 == d2));
    }
    
}
