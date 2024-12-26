/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oop;
// Base class (Parent class)
class Animal {
    private String name;

    // Constructor
    public Animal(String name) {
        this.name = name;
    }

    // Getter for name
    public String getName() {
        return name;
    }

    // Method to make a sound (to be overridden)
    public void makeSound() {
        System.out.println("Some generic animal sound");
    }
}

// Derived class (Child class)
class Dog extends Animal {
    // Constructor
    public Dog(String name) {
        super(name); // Call the constructor of the parent class
    }

    // Overriding the makeSound method
    @Override
    public void makeSound() {
        System.out.println("Woof! Woof!");
    }

    // Additional method
    public void fetch() {
        System.out.println(getName() + " is fetching a ball!");
    }
}

// Another Derived class
class Cat extends Animal {
    // Constructor
    public Cat(String name) {
        super(name);
    }

    // Overriding the makeSound method
    @Override
    public void makeSound() {
        System.out.println("Meow!");
    }
}

// Main class
public class Main {
    public static void main(String[] args) {
        // Create objects
        Animal genericAnimal = new Animal("Generic Animal");
        Dog dog = new Dog("Buddy");
        Cat cat = new Cat("Whiskers");

        // Demonstrate polymorphism
        genericAnimal.makeSound();
        dog.makeSound();
        cat.makeSound();

        // Use specific methods of Dog and Cat
        dog.fetch();

        // Example of upcasting
        Animal myAnimal = new Dog("Max");
        myAnimal.makeSound(); // Calls the Dog's overridden method

        // Example of downcasting (with caution)
        if (myAnimal instanceof Dog) {
            Dog myDog = (Dog) myAnimal;
            myDog.fetch();
        }
    }
}
