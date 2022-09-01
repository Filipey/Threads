package Exercicio1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um tamanho para o array: ");
        int length = sc.nextInt();
        int[] array = new int[length];

        for (int i = 0; i < array.length; i++) {
            array[i] = i;
        }

        MyThread t1 = new MyThread(array, 0); // Thread que executa a soma
        MyThread t2 = new MyThread(array, 1); // Thread que executa a produto

        Thread th1 = new Thread(t1); // Threads superior a T1
        Thread th2 = new Thread(t2); // Threas superior a T2

        th1.start();
        th2.start();

        th1.join();
        th2.join();

        System.out.println("Soma: " +t1.getResult());
        System.out.println("Produto: " +t2.getResult());
    }
}
