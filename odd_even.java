import java.util.Scanner;

public class odd_even {
    public static void main(String[] args) {
        int num;
        System.out.println("Enter a NUMBER");
        Scanner scan = new Scanner(System.in);
        num= scan.nextInt();
        if ((num %2)==0) {
            System.out.println("EVEN");
        }
        else {
            System.out.println("ODD");
        }

    }
}
