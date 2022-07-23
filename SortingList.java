import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class SortingList {

    public static void main(String[] args) {
        List<Integer> list = List.of(56, 8, 62, 45, 21, 6, 9, 87, 845, 45, 62, 24);
        System.out.println(list);


        List<Integer> listEven = new ArrayList<>();

        for (Integer i : list) {
            if (i % 2 == 0) {
                listEven.add(i);
            }

        }
        System.out.println(list);
        System.out.println(listEven);


    }
}
