package io.zipcoder.polymorphism;

// Dog subclass
class Dog extends Pet {
    public Dog(String name) {
        super(name);
    }

    @Override
    String speak() {
        return "Woof";
    }
}
