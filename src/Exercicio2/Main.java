package Exercicio2;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        // Inicializando minhas Threads, compartilhando o mesmo contador
        Contador counter = new Contador();
        MyThread t1 = new MyThread(counter);
        MyThread t2 = new MyThread(counter);

        // Inicializando Threads Containers
        Thread th1 = new Thread(t1);
        Thread th2 = new Thread(t2);

        // Disparando Threads
        th1.start();
        th2.start();

        // Esperando a finalização de cada Thread
        th1.join();
        th2.join();

        System.out.println("O valor final do contador é: " + counter.getValue());

        System.out.println("\nDessa forma, podemos ver que cada Thread não incrementou 1000 vezes o Contador,\n" +
                "sendo que esperava-se o valor final igual a 2000 mas obtivemos " + counter.getValue());
    }
}
