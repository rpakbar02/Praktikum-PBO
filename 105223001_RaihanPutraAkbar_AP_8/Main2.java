class Animal{
    void eat(){
        System.out.println("aing makan");
    }
}

class Dog extends Animal{
    void bark(){
        System.out.println("guguk");
    }
}
class Pig extends Animal{
    void oink(){
        System.out.println("ngok");
    }
}

public class Main2 {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.bark();
        dog.eat();
        Pig pig = new Pig();
        pig.oink();
        pig.eat();
    }
}
