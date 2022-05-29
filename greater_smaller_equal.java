import java.util.Scanner;

public class greater_smaller_equal {
    public static void main(String[] args){
        int num1, num2;
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the FIRST NUMBER");
        num1= scan.nextInt();
        System.out.println("Enter the SECOND NUMBER");
        num2=scan.nextInt();
        if (num1==num2) {
            System.out.println("Both the numbers are EQUAL");
        }
        else if (num1<num2) {
            System.out.println(num1 + " is SMALLER then " + num2);
        }
        else {
            System.out.println(num1 + "is GREATER then" + num2);
        }

    }
}
