import java.util.Scanner;

public class weird {

    public static void main(String[] args) {
        int num;
        Scanner scan = new Scanner(System.in);

        num = scan.nextInt();

        if (num % 2 == 0) {
            if (num > 1 & num < 6) {
                System.out.println("Not Weird");
            } else if (num > 5 & num < 21) {
                System.out.println("Weird");
            } else {
                System.out.println("Not Weird");

            }
        } else {
            System.out.println("Weird");
        }
    }
}

