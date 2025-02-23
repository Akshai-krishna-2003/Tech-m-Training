public class ClassNotesForThread {

    public static void main(String[] args) {//Thread 1
        System.out.println("From Main thread!");
        System.out.println("From Main thread!");
        System.out.println("From Main thread!");
        Thread11 t1 = new Thread11();
        t1.start();//calls run method-Thread 2
        //t1.run();
        Thread22 t2 = new Thread22();
        Thread tt2 = new Thread(t2);
        new Thread(t2).start();//Thread 3
        tt2.start();//Thread 4
        t2.run();

        System.out.println(10 / 0);

    }

}

class Thread11 extends Thread{
    public void run()
    {
        System.out.println("From Thread1!"+this.getName());
        // System.out.println(10/0);
    }
}
class Thread22 implements Runnable
{
    public void run()
    {
        System.out.println("From Thread22!");
//        System.out.println(10/0);
    }
}
