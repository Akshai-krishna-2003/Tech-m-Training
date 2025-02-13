public class TestTask2 {
    public static void main(String[] args) {
        new AkTask2Thread1().start();
        new Thread(new AkTask2Thread2()).start();
    }
}

class AkTask2Thread1 extends Thread {

    @Override
    public void run() {
        this.setName("AkTask1Thread1");
        System.out.println("This is thread: "+ this.getName());

        System.out.println("Dividing by zero: "+ 10/0 );

    }
}

class AkTask2Thread2 implements Runnable {

    @Override
    public void run() {
        Thread.currentThread().setName("AkTask1Thread2");
        System.out.println("This is thread: "+ Thread.currentThread().getName());
        System.out.println("Dividing by zero: "+ 10/0 );
    }
}
