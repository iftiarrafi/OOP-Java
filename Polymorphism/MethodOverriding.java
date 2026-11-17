
class Animal {
    void makeSound(){
        System.out.println("Animal sound");
    }
}

class Cat extends Animal{
    @Override 
    void makeSound() {
        System.out.println("Dog is barking");
    }
}


public class MethodOverriding {
    public static void main(String[] args) {
        Animal animal = new Animal();
        animal.makeSound();
        Cat c1 = new Cat();
        c1.makeSound();
    }
}
