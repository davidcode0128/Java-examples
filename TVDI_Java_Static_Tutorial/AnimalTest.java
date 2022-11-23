package static_類別靜態成員;

/**
 *
 * @author User
 */
public class AnimalTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Animal animal = Animal.createAnimal();
        animal.hello();
        Dog dog = Animal.creatDog();
        dog.hello();
        System.out.println("------------");
        Animal animal1 = Animal.createAnimal();
        animal1.hello(); // hello() 是虛擬方法
        // 執行時期根據物件型別，執行物件覆寫方法
    }
    
}
