class Animal {
    void speak() {
        System.out.println("The animal makes a sound.");
    }
}

class Dog extends Animal {
    @Override
    void speak() {
        System.out.println("The dog barks.");
    }
}

public class OverrideExample {
    public static void main(String[] args) {
        Animal animal = new Dog();
        animal.speak();
    }
}
