package StartPoint;

public class TestNewThreadInterface implements Runnable{
    private String threadName;

    public TestNewThreadInterface(String name) {
        this.threadName = name;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println(this.threadName + " " + i);
        }
    }
}
