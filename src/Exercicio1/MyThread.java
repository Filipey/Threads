package Exercicio1;

public class MyThread implements Runnable{

    /**
     * Array recebido como parâmetro para realizar as operações
     */
    private int[] arr;
    /**
     * Flag para definir qual operação a Thread irá executar
     */
    private int type = 0;
    /**
     * Variável que armazena resultado final
     */
    private Long result;

    /**
     *
     * @param arr array que será operacionado
     * @param type flag para executar soma(0) ou multiplicação(1)
     */
    public MyThread(int[] arr, int type) {
        this.arr = arr;
        this.type = type;
        this.result = 0L;
    }
    @Override
    public void run() {
        if (this.type == 0) {
            sum();
            System.out.println("Thread de soma finalizada.");
        } else {
            multiply();
            System.out.println("Thread de produto finalizada.");
        }
    }

    private void sum() {
        for (int i = 0; i < this.arr.length; i++) {
            this.result += i;
        }
    }

    private void multiply() {
        this.result = 1L; // Impedindo multiplicação por 0
        for (int i = 1; i < this.arr.length; i++) {
            this.result *= this.arr[i];
        }
    }

    public Long getResult() {
        return this.result;
    }
}
