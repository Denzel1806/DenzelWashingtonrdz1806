/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
public class MemoryManagementExample {
    // A class to demonstrate object creation
    static class MemoryObject {
        private String name;

        public MemoryObject(String name) {
            this.name = name;
            System.out.println(name + " created.");
        }

        @Override
        protected void finalize() throws Throwable {
            System.out.println(name + " is being garbage collected.");
            super.finalize();
        }
    }

    public static void main(String[] args) {
        System.out.println("Starting the program...");

        // Step 1: Create objects
        MemoryObject obj1 = new MemoryObject("Object1");
        MemoryObject obj2 = new MemoryObject("Object2");

        // Step 2: Remove references
        obj1 = null;
        obj2 = null;

        // Step 3: Request garbage collection
        System.out.println("Requesting garbage collection...");
        System.gc();

        // Step 4: Perform some operation to allow GC to run
        try {
            Thread.sleep(1000); // Give some time for garbage collector
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Program execution completed.");
    }
}
