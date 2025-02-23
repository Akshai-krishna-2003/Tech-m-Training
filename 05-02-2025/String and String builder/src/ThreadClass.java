public class ThreadClass extends Thread {
    public static void main(String[] args) {
        /*
         * What is thread?
         * Thread creation two types
         * 1. Thread class
         * 2. Runnable interface
         * Commonly run() called
         * Thread in heap memory
         * new -> wait -> execute -> dead
         *
         * join() method ->  allows one thread to wait until another thread completes its execution
         *
         * user thread -> inside jvm thread
         * demon thread -> Low priority thread outside jvm
         *
         *
         * */

        ThreadClass tc = new ThreadClass();
        System.out.println(tc.getName());
        System.out.println(tc.getState());
        tc.start();
        System.out.println(tc.getState());
        System.out.println("Tc executed done");
        System.out.println(tc.isAlive());
        System.out.println(tc.getState());
        //        tc.start();
        System.out.println(tc.getState());

        ThreadClass tc1 = new ThreadClass();
        System.out.println(tc1.getState());
        tc1.start();
        System.out.println("Tc1 executed done");
    }

    public void run() {
        System.out.println("Thread run() called");
        System.out.println(this.getName());
        System.out.println(this.getState());

    }
}
