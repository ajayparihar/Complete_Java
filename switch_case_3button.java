import java.util.Scanner;

public class switch_case_3button {

    public static void main(String[] args) {
        int button;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the NUMBER");
        button = scan.nextInt();
        switch (button) {
            case 1 -> System.out.println("HELLO");
            case 2 -> System.out.println("NAMASTE");
            case 3 -> System.out.println("BONJOUR");
            default -> System.out.println("INVALID INPUT!!!");
        }
    }
}
