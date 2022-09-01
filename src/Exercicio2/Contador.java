package Exercicio2;

public class Contador {
    private int value;

    public Contador() {
        this.value = 0;
    }

    public void incrementValue() {
        this.value += 1;
    }

    public int getValue() {
        return this.value;
    }
}
