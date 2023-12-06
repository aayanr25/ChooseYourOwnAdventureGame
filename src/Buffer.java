import java.util.concurrent.TimeUnit;

public class Buffer {
    public Buffer() {
    }

    public static void buffer(int msec) {
        try {
            TimeUnit.MILLISECONDS.sleep(msec);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}