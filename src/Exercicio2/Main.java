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

        System.out.println("\nRodando o programa múltiplas vezes, " +
                "observa-se que o resultado do contador é diferente a cada execução.");
        System.out.println("\nPor exemplo, ambas as Threads executaram 1000 vezes," +
                " mas o valor 2000 não é necessariamente o resultado");
        System.out.println("\nExecuções da Thread 1: " +t1.getExecutionCounter() +" \n" +
                "Execuções da Thread 2: " + t2.getExecutionCounter());

        System.out.println("\nIsso pode significar que ambas as Threads " +
                "fizeram algumas incrementações com valores antigos de Counter, " +
                "gerando as vezes resultados diferentes de 2000");
    }
}
