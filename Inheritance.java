class A {
    int a;
    int b;
    int c;

    void add() {
        a = 10;
        b = 20;
        c = a + b;
        System.out.println("Sum is: " + c);
    }

    void sub() {
        a = 100;
        b = 200;
        c = a - b;
        System.out.println("Difference is: " + c);
    }
}

class B extends A {
    int a, b, c;

    void mul() {
        a = 10;
        b = 20;
        c = a * b;
        System.out.println("Product is: " + c);
    }

    void div() {
        a = 100;
        b = 200;
        c = a / b;
        System.out.println("Quotient is: " + c);
    }

}

class C extends B {
    void rem() {
        a = 100;
        b = 200;
        c = a % b;
        System.out.println("Remainder is: " + c);
    }
}

public class Inheritance {
    public static void main(String[] args) {

        C obj = new C();
        obj.add();
        obj.sub();
        obj.mul();
        obj.div();
        obj.rem();

    }
}
