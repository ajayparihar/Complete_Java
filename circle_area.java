import java.util.Scanner;

public class circle_area {
    public static void main(String[] args){
        final float pi=3.14F;
        float area;
        System.out.println("Enter the RADIUS of the CIRCLE");
        Scanner scan = new Scanner(System.in);
        int radius= scan.nextInt();
        System.out.println("The RADIUS of the CIRCLE is:- "+radius);
        area = pi * (radius * radius);
        System.out.println("The AREA of the CIRCLE is:- "+area);
    }
}
