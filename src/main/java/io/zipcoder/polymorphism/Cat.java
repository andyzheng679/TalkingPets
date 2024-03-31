package io.zipcoder.polymorphism;

class Cat extends Pet {
    public Cat(String name) {
        super(name);
    }

    @Override
    String speak() {
        return "Meow";
    }
}
