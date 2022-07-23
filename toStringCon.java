public class toStringCon {
    public static void main(String[] args) {
        Integer num = 2560;
        System.out.println(num);
        Integer sNum = Integer.valueOf(num.toString().charAt(0));
        Integer mul = sNum * 5;
        System.out.println(mul);
    }
}
