public class Arithmetic {
    public static void main(String[] args) {
        try {
            int x = 2 / 0;
        } catch (ArithmeticException e) {
            System.out.println("Cannot divide by zero");
        }

        double y = 2.0 / 0;
        System.out.println("Result: " + y);
    }
}

