import java.sql.Array;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamObj {
    public static void main(String[] args) {

        Stream<Object> names = Stream.empty();
        System.out.println(names);

        String name[] = {"Ajay", "Abhay", "Akash", "Devansh"};

        Stream<String> stm1 = Stream.of(name);
        List<String> namesA = (List<String>) Arrays.stream(name).filter(e -> e.startsWith("A")).collect(Collectors.toList());
        System.out.println(namesA);


        IntStream stm2 = Arrays.stream(new int[]{1, 5, 6, 4, 8, 9, 5, 45, 56, 21, 35, 89});
        stm2.forEach(e -> {
            System.out.println(e);
        });


        List<Integer> num1 = List.of(1, 5, 6, 4, 8, 9, 5, 45, 56, 21, 35, 89);
        num1.stream().forEach(e -> {
            System.out.println("Adding 10 to " + e);
            int nums1 = e + 10;

            System.out.println(nums1);
            try {
                TimeUnit.SECONDS.sleep(1);
            } catch (InterruptedException ex) {
                throw new RuntimeException(ex);
            }


        });


        List<Integer> num2 = List.of(1, 5, 6, 4, 8, 9, 5, 45, 56, 21, 35, 89);
        num2.stream().forEach(e -> {
            System.out.println("Square of " + e);
            int sq1 = e * e;

            System.out.println(sq1);
            try {
                TimeUnit.SECONDS.sleep(1);
            } catch (InterruptedException ex) {
                throw new RuntimeException(ex);
            }


        });


    }
}
