package io.zipcoder.polymorphism;

class Bird extends Pet {
    public Bird(String name) {
        super(name);
    }

    @Override
    String speak() {
        return "Tweet";
    }
}
