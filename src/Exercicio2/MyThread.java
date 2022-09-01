package Exercicio2;

public class MyThread implements Runnable{
    private Contador counter;
    private int executionCounter;

    public MyThread(Contador counter) {
        this.counter = counter;
        this.executionCounter = 0;
    }

    @Override
    public void run() {
        for (int i = 0; i < 1000; i++) {
            counter.incrementValue();
            this.executionCounter++;
        }
    }

    public int getExecutionCounter() {
        return this.executionCounter;
    }
}
