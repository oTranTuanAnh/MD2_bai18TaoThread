import java.util.Objects;

public class NumberGenerator implements Runnable{
    private String name;

    public NumberGenerator(String name) {
        this.name = name;
    }

    public NumberGenerator() {
    }



    @Override
    public void run() {
        try {
            for (int i = 0; i < 10; i++) {
                System.out.println("print "+ this.name+ " is " +i+ ", hash code "+ this.hashCode());
                Thread.sleep(500);
            }
        } catch (InterruptedException e) {
            System.out.println("Over");
        }
    }
}
