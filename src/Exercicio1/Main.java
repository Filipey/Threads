package Exercicio1;

import java.util.Scanner;

/**
 * Crie um programa que calcule a soma e o produto dos elementos de um vetor.
 * Cada uma dessas operações deve ser executada por uma thread diferente.
 */
public class Main {
    public static void main(String[] args) throws InterruptedException {
        int[] array = generateArray();

        MyThread t1 = new MyThread(array, 0); // Thread que executa a soma
        MyThread t2 = new MyThread(array, 1); // Thread que executa a produto

        Thread th1 = new Thread(t1); // Thread container de T1
        Thread th2 = new Thread(t2); // Thread container de T2

        th1.start();
        th2.start();

        th1.join();
        th2.join();

        System.out.println("Soma: " +t1.getResult());
        System.out.println("Produto: " +t2.getResult());
    }

    /**
     * Gerando um array com tamanho definido pelo usuário
     * @return novo array
     */
    public static int[] generateArray() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um tamanho para o array: ");
        int length = sc.nextInt();
        int[] array = new int[length];

        for (int i = 0; i < array.length; i++) { // inicializando o array
            array[i] = i;
        }

        return array;
    }
}
