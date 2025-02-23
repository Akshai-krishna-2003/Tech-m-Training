public class ThreadClassWithStringBuffferExample {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer();

        StringBufferExample t1 = new StringBufferExample(sb);
        StringBufferExample t2 = new StringBufferExample(sb);
        StringBufferExample t3 = new StringBufferExample(sb);

        t1.start();
        t2.start();
        t3.start();
    }
}

class StringBufferExample extends Thread {
    public StringBuffer sb;

    public StringBufferExample(StringBuffer sb) {
        this.sb = sb;
    }

    @Override
    public void run() {
        // Appending to StringBuilder
        sb.append(Thread.currentThread().getName());
        System.out.println("Thread " + Thread.currentThread().getName() + ": " + sb);
    }

    /*
    *
    *   Output for String Buffer:
    *   Thread Thread-1: Thread-0Thread-2Thread-1
        Thread Thread-2: Thread-0Thread-2
        Thread Thread-0: Thread-0
    *
    * */

}
