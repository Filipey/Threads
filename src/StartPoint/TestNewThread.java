package StartPoint;

public class TestNewThread extends Thread{
    private String name;
    private int[] array;
    private int init;
    private int end;
    private int result = 0;

    public TestNewThread(String threadName, int[] array, int init, int end) {
        this.name = threadName;
        this.array = array;
        this.init = init;
        this.end = end;
    }

    private void sum() {
        for (int i = init; i <= end; i++) {
            this.result += array[i];
        }
    }

    public int getResult() {
        return this.result;
    }

    @Override
    public void run() {
        sum();
    }
}
