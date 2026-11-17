abstract class Animal {

    abstract void makeSound();

    void sleep(){
        System.out.println("The animal is sleeping");
    }
}

class Dog extends Animal {

    @Override 
    void makeSound(){
        System.out.println("Dog Barks");
    }
}
class Cat extends Animal {

    @Override 
    void makeSound(){
        System.out.println("Cat meows");
    }
}


public class AbstractClass {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.makeSound();
        dog.sleep();

        Cat cat = new Cat();
        cat.makeSound();
        cat.sleep();
    }
}
