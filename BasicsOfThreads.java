### **Basics of Threads in Java**

In Java, a thread is a lightweight process and is the smallest unit of execution. Using threads allows a program to perform multiple tasks simultaneously (multithreading). The Java `java.lang.Thread` class and the `Runnable` interface are the foundation for creating and managing threads.

---

### **How Threads Work**
- A **thread** runs inside a Java Virtual Machine (JVM) process.
- Each thread has its own:
  - Program counter
  - Stack
  - Local variables
- Threads share the process memory (heap), enabling them to communicate and share data.

---

### **Thread Lifecycle**
1. **New**: A thread is created but not started yet.
2. **Runnable**: The thread is ready to run and is waiting for CPU time.
3. **Running**: The thread is executing.
4. **Blocked/Waiting**: The thread is paused, waiting for some condition or resource.
5. **Terminated**: The thread has finished execution.

---

### **Creating Threads**
Java provides two primary ways to create threads:
1. **By extending the `Thread` class**
2. **By implementing the `Runnable` interface**

---

### **Example 1: Extending `Thread`**
```java
class MyThread extends Thread {
    @Override
    public void run() {
        // Task performed by this thread
        System.out.println("Thread running: " + Thread.currentThread().getName());
    }
}

public class ThreadExample {
    public static void main(String[] args) {
        MyThread thread1 = new MyThread(); // Create a new thread
        thread1.start(); // Start the thread
    }
}
```

**Explanation**:
- The `run()` method contains the code that the thread will execute.
- The `start()` method starts the thread, which calls the `run()` method.

---

### **Example 2: Implementing `Runnable`**
```java
class MyRunnable implements Runnable {
    @Override
    public void run() {
        System.out.println("Thread running: " + Thread.currentThread().getName());
    }
}

public class RunnableExample {
    public static void main(String[] args) {
        Thread thread1 = new Thread(new MyRunnable()); // Create a new thread
        thread1.start(); // Start the thread
    }
}
```

**Explanation**:
- By implementing `Runnable`, the class becomes more flexible, as it can extend other classes as well.

---

### **Thread Methods**
Here are some common methods of the `Thread` class:
| **Method**              | **Description**                                           |
|--------------------------|-----------------------------------------------------------|
| `start()`               | Starts the thread, invoking the `run()` method.            |
| `run()`                 | Contains the task to be performed by the thread.           |
| `sleep(milliseconds)`   | Pauses the thread for a specified time.                    |
| `join()`                | Waits for the thread to finish execution.                  |
| `getName()`             | Returns the thread's name.                                 |
| `setName(String name)`  | Sets the thread's name.                                    |
| `isAlive()`             | Checks if the thread is alive.                             |
| `yield()`               | Suggests to the thread scheduler to give another thread a turn. |

---

### **Example: Multi-threading**
```java
class Task extends Thread {
    private String taskName;

    Task(String taskName) {
        this.taskName = taskName;
    }

    @Override
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println(taskName + " - Count: " + i);
            try {
                Thread.sleep(500); // Pause for 500ms
            } catch (InterruptedException e) {
                System.out.println("Thread interrupted: " + taskName);
            }
        }
    }
}

public class MultiThreadExample {
    public static void main(String[] args) {
        Task thread1 = new Task("Thread 1");
        Task thread2 = new Task("Thread 2");

        thread1.start(); // Start Thread 1
        thread2.start(); // Start Thread 2
    }
}
```

**Output (may vary due to scheduling)**:
```
Thread 1 - Count: 1
Thread 2 - Count: 1
Thread 1 - Count: 2
Thread 2 - Count: 2
...
```

---

### **Synchronization**
When multiple threads access shared resources, conflicts or race conditions may occur. To avoid this, Java provides synchronization mechanisms.

**Synchronized Method Example**:
```java
class Counter {
    private int count = 0;

    public synchronized void increment() {
        count++;
    }

    public int getCount() {
        return count;
    }
}

public class SynchronizedExample {
    public static void main(String[] args) throws InterruptedException {
        Counter counter = new Counter();

        Thread t1 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                counter.increment();
            }
        });

        Thread t2 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                counter.increment();
            }
        });

        t1.start();
        t2.start();

        t1.join(); // Wait for t1 to finish
        t2.join(); // Wait for t2 to finish

        System.out.println("Final count: " + counter.getCount());
    }
}
```

**Output**:
```
Final count: 2000
```

---

### **Key Points**
- Use **threads** to achieve parallelism.
- Always handle **shared resources** carefully to avoid race conditions.
- Prefer **`Runnable` interface** over extending `Thread` if you need inheritance flexibility.
- Use **synchronization** for thread-safe operations.

