package Exercicio2;

public class MyThread implements Runnable{
    private Contador counter;

    public MyThread(Contador counter) {
        this.counter = counter;
    }

    @Override
    public void run() {
        for (int i = 0; i < 1000; i++) {
            counter.incrementValue();
        }
    }
}
