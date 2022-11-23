package static_類別靜態成員;

/**
 * 通常會透過靜態工廠方法來取得物件( 代替建構子 ) 靜態工廠方法可回傳預先建立好的物件( 快取 ) 避免重複建立物件
 * 靜態工廠方法可產生回傳型別的子型別物件
 */
public abstract class Animal { // 抽象類別

    private static Dog dog; // 靜態欄位

    // 快取物件(提早做好物件)
    static {
        System.out.println("Animal 靜態初始化");
        dog = new Dog();
    }
    // 靜態工廠方法: 建立 Dog 物件實體
    public static Dog getDogInstance(){
        System.out.println("執行getDogInstance()");
        return dog; // 回傳預先建立好的物件 (同一個物件)
    }
    
    // 靜態工廠方法: 建立 Dog 物件
    public static Dog creatDog() {
        return new Dog();
    }

    // 靜態工廠方法: 建立 Animal 子物件
    public static Animal createAnimal() {
        if (Math.random() > 0.5) {
            return new Dog();
        } else {
            return new Cat();
        }
    }

    // 抽象方法
    abstract public void hello();
}

class Dog extends Animal {

    // 建構子
    public Dog(){
        System.out.println("Dog 建構子");
    }
    @Override
    public void hello() {
        System.out.println("汪");
    }
}

class Cat extends Animal {

    @Override
    public void hello() {
        System.out.println("喵");
    }
}
