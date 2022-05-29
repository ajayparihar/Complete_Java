import java.util.Scanner;

public class three_buttons {
    public static void main(String[] args){
        int button;
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the NUMBER");
        button= scan.nextInt();
        if (button==1) {
            System.out.println("HELLO");
        }
        else if (button==2) {
            System.out.println("NAMASTE");
        }
        else if (button==3) {
            System.out.println("BONJOUR");
        }
        else {
            System.out.println("INVALID INPUT!!!");
        }

    }
}
