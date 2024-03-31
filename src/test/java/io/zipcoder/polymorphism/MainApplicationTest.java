package io.zipcoder.polymorphism;

import org.junit.Assert;
import org.junit.Test;

public class MainApplicationTest {
@Test
    public void testMe(){}

    @Test
    public void testGetName() {
        // Given
        Pet pet = new Dog("Rover");

        // When
        String expected = "Rover";
        String actual = pet.getName();

        // Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testSetName() {
        // Given
        Pet pet = new Cat("Whiskers");

        // When
        pet.setName("Fluffy");
        String expected = "Fluffy";
        String actual = pet.getName();

        // Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testDogSpeak() {
        // Given
        Dog dog = new Dog("Rover");

        // When
        String expected = "Woof";
        String actual = dog.speak();

        // Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testCatSpeak() {
        // Given
        Cat cat = new Cat("Whiskers");

        // When
        String expected = "Meow";
        String actual = cat.speak();

        // Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testBirdSpeak() {
        // Given
        Pet bird = new Bird("Tweety");

        // When
        String expected = "Tweet";
        String actual = bird.speak();

        // Then
        Assert.assertEquals(expected, actual);
    }
}
