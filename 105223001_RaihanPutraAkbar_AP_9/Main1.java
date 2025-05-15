// class Animal{

// }
// class Mammal extends Animal{

// }
// class Reptile extends Animal{

// }
// class Dog extends Mammal{

// }

// public class App {
//     public static void main(String[] args) {
//         Animal animal = new Animal();
//         Mammal mammal = new Mammal();
//         Reptile reptile = new Reptile();
//         Dog dog = new Dog();

//         System.out.println(mammal instanceof Animal); // true
//         System.out.println(reptile instanceof Animal); // true
//         System.out.println(dog instanceof Animal); // true
//         System.out.println(dog instanceof Mammal); // true

//         Animal animal2 = new Mammal();

//         if (animal2 instanceof Dog) {
//             Dog dog2 = (Dog) animal2; 
//             System.out.println("Objek berhasil dibuat dari animal2");
//         } else {
//             System.out.println("gagal buat objek");
//         }
//     }
// }



class Animal{
    void eat(){
        System.out.println("AKU MAKAN");
    }
}

class Dog extends Animal{
    void bark(){
        System.out.println("AKU GONG");
    }
}
class Pig extends Animal{
    void oink(){
        System.out.println("AKU OINK");
    }
}

public class Main1 {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.bark();
        dog.eat();
        Pig pig = new Pig();
        pig.oink();
        pig.eat();
    }
}
