/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package garbagecollectiondemo;

public class GarbageCollectionDemo {
    
    // A simple class to create objects for demonstration
    static class MyObject {
        String name;
        
        // Constructor to initialize name
        MyObject(String name) {
            this.name = name;
        }
        
        // Overriding finalize() method to see when GC occurs
        @Override
        protected void finalize() {
            System.out.println("Garbage Collector is called for: " + name);
        }
    }

    public static void main(String[] args) {
        
        // Creating objects of MyObject class
        MyObject obj1 = new MyObject("Object 1");
        MyObject obj2 = new MyObject("Object 2");
        MyObject obj3 = new MyObject("Object 3");
        
        // Dereferencing obj2 - It will become eligible for garbage collection
        obj2 = null;

        // Suggest to the JVM to run garbage collection
        System.gc();
        
        // Creating a new object, replacing obj1
        obj1 = new MyObject("New Object");
        
        // Dereferencing obj1 - It will become eligible for garbage collection
        obj1 = null;

        // Suggest to the JVM to run garbage collection again
        System.gc();

        // Adding a little delay to ensure GC happens (not guaranteed)
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
