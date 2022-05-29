import java.util.Scanner;

public class adult {
        public static void main(String[] args){
            int age;
            Scanner scan=new Scanner(System.in);
            System.out.println("Enter your AGE");
            age= scan.nextInt();
            if (age<18)
                System.out.println("MINOR");

            else {
                System.out.println("ADULT");
            }

        }
    }
