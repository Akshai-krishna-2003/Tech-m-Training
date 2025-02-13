public class ThreadClassDemoTeaching {
    // Multithreading
    // This supports concurrenncy
    // When you are making the OS to use more than one task to work at same time it is called concurrency
    // Execute more than 1 methods parallely
    // A type of multi tasking
    // Thread life cycle
    // Note: Main thread  starts 1st and exists atlast
    // Other threads
    // Inter thread communication

    public static void main(String[] args) {
        Thread t1 = new Thread(new Thread1());
        t1.start();

        Thread2 t2 = new Thread2();
        t2.start();
    }

}

class Thread1 implements Runnable {

    @Override
    public void run() {
        Thread.currentThread().setName("Runnable Thread");
        System.out.printf("This is a thread: %s%n", Thread.currentThread().getName());
    }
}

class Thread2 extends Thread {

    @Override
    public void run() {
        this.setName("Thread Thread");

        System.out.printf("This is a thread: %s%n", this.getName());
    }
}
