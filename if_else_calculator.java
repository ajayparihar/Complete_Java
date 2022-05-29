import java.util.Scanner;

public class if_else_calculator {
    public static void main(String[] args) {
        int num1, num2, opr;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the FIRST NUMBER");
        num1 = scan.nextInt();
        System.out.println("Enter the SECOND NUMBER");
        num2 = scan.nextInt();
        System.out.println("""
                1 : + (Addition) a + b
                2 : - (Subtraction) a - b
                3 : * (Multiplication) a * b
                4 : / (Division) a / b
                5 : % (remainder) a % b""");
        opr = scan.nextInt();

        switch (opr) {
            case 1 -> System.out.println(num1 + num2);
            case 2 -> System.out.println(num1 - num2);
            case 3 -> System.out.println(num1 * num2);
            case 4 -> System.out.println(num1 / num2);
            case 5 -> System.out.println(num1 % num2);
            default -> System.out.println("INVALID INPUT!!!");
        }

    }
}