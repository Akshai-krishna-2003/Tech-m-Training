import java.util.HashMap;

public class ThreadClassWithStringBuilderExample {

    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();

        StringBuilderExample t1 = new StringBuilderExample(sb);
        StringBuilderExample t2 = new StringBuilderExample(sb);
        StringBuilderExample t3 = new StringBuilderExample(sb);

        t1.start();
        t2.start();
        t3.start();
    }
}

class StringBuilderExample extends Thread {
    public StringBuilder sb;

    public StringBuilderExample(StringBuilder sb) {
        this.sb = sb;
    }

    @Override
    public void run() {
        // Appending to StringBuilder
        sb.append(Thread.currentThread().getName());
        System.out.println("Thread " + Thread.currentThread().getName() + ": " + sb);
    }

    /*
    *   Output for String Builder:
    *   Thread Thread-2: Thread-0Thread-2
        Thread Thread-0: Thread-0
        Thread Thread-1: Thread-0Thread-2Thread-1
    *
    * */

}
