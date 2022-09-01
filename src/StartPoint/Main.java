package StartPoint;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        // StartPoint.TestNewThread t1 = new StartPoint.TestNewThread("Thread 1");;
        // StartPoint.TestNewThread t2 = new StartPoint.TestNewThread("Thread 2");
        //
        // t1.start();
        // t2.start();
        // System.out.println("StartPoint.Main finished");

        // ------------------------------------------------------------------------

        // StartPoint.TestNewThreadInterface t1 = new StartPoint.TestNewThreadInterface("Thread 1 ");
        // StartPoint.TestNewThreadInterface t2 = new StartPoint.TestNewThreadInterface("Thread 2 ");
        //
        // Thread th1 = new Thread(t1);
        // Thread th2 = new Thread(t2);
        //
        // th1.start();
        // th2.start();
        //
        // th1.join();
        // th2.join();

        // ------------------------------------------------------------------------
        int[] array = new int[1000];

        for (int i = 0; i < 1000; i++) {
            array[i] += i+1;
        }

        TestNewThread t1 = new TestNewThread("Thread 1", array, 0, (array.length / 2) - 1);
        TestNewThread t2 = new TestNewThread("Thread2", array, array.length / 2, array.length - 1);

        t1.start();
        t2.start();

        t1.join();
        t2.join();

        System.out.println("Resultado = " + (t1.getResult() + t2.getResult()));

        System.out.println("StartPoint.Main finished");
    }
}
