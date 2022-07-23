import java.util.Arrays;
import java.util.concurrent.TimeUnit;
import java.util.stream.Stream;

public class AddingStr {
    public static void main(String[] args) {


        String[] names = {"Gaurav", "Gulli", "Akash"};
        Stream<String> stm1 = Stream.of(names);
        Arrays.stream(names).forEach(e -> {
            System.out.println("Checking Full Name of " + e);
            try {
                TimeUnit.SECONDS.sleep(2);
            } catch (InterruptedException ex) {
                throw new RuntimeException(ex);
            }
            for (int i = 0; i < 5; i++) {
                System.out.print(".");
                try {
                    TimeUnit.SECONDS.sleep(1);
                } catch (InterruptedException ex) {
                    throw new RuntimeException(ex);
                }
            }
            System.out.println(" ");

            String cName = e + " BHADWA";
            System.out.println("Full name of " + e + " is " + cName);
            try {
                TimeUnit.SECONDS.sleep(3);
            } catch (InterruptedException ex) {
                throw new RuntimeException(ex);
            }

            System.out.println(" ");

        });

        System.out.println("MYSTERY REVILED...");


    }


}
