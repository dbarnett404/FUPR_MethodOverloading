public class OverloadingDemo {
    public static void main(String[] args) {
        Calculator calc = new Calculator();        
        System.out.println("Result: " + calc.add(5, 3));           // Calls add(int, int)
        System.out.println("Result: " + calc.add(5, 3, 2));       // Calls add(int, int, int)
        System.out.println("Result: " + calc.add(5.5, 3.2));      // Calls add(double, double)
        System.out.println("Result: " + calc.add("Number: ", 42)); // Calls add(String, int)
        System.out.println("Result: " + calc.add(42, " is the answer")); // Calls add(int, String)
    }
}
