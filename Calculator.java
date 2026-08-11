public class Calculator {

    public int add(int a, int b) {
        System.out.println("Performing Addition");
        return a + b;
    }
     public int add2(int a, int b) {
        return a + b;
    }

    public static void main(String[] args) {
        Calculator calc = new Calculator();
        System.out.println(calc.add(10, 20));
    }
}