public class TestTask1 {
    public static void main(String[] args) {

        System.out.println("Inside main thread: "+Thread.currentThread().getName());

        new Thread(new AkTask1Thread2()).start();
        new AkTask1Thread1().start();

    }
}

class AkTask1Thread1 extends Thread {

    @Override
    public void run() {
        this.setName("AkTask1Thread1");
        System.out.println("This is thread: "+ this.getName());

    }
}

class AkTask1Thread2 implements Runnable {

    @Override
    public void run() {
        Thread.currentThread().setName("AkTask1Thread2");
        System.out.println("This is thread: "+ Thread.currentThread().getName());
    }
}
