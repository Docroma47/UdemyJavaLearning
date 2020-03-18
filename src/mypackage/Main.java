package mypackage;

public class Main {

    public static void main(String[] args) {
        Dog dog = new Dog();
        Cat cat = new Cat();

        dog.sit();
        dog.saySmth();
        dog.eat();
        dog.walk("Park");

        System.out.println();
        cat.saySmth();
        cat.eat();
        cat.walk("Backyard");

    }
}
