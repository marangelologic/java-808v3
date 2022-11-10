package oca.chapter.two.overloading;

public class OverloadingSample {
    public static void main(String[] args) {
        Meat m = new Meat();
        Animal a = new Dog();
        m.eatenBy(a);
        testDownCasting((Dog) a);
    }

    private static void testDownCasting(Dog x) {

    }
}

class Animal {
    void eat() {
        System.out.println("this method invoked is from Animal");
    }
}

class Dog extends Animal {
    @Override
    void eat() {
        System.out.println("this method being invoked is from Dog");
    }
}

class Meat {

    void eatenBy(Animal a) {
        System.out.println("This is called from the method with animal argument");
    }

    void eatenBy(Dog d) {
        System.out.println("This is called from the method with Dog argument");
    }
}