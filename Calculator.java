public class Calculator {
    // Method with 2 int parameters
    public int add(int a, int b) {
        System.out.println("Adding two integers: " + a + " + " + b);
        return a + b;
    }
    // Method with 3 int parameters
    public int add(int a, int b, int c) {
        System.out.println("Adding three integers: " + a + " + " + b + " + " + c);
        return a + b + c;
    }
    // Method with 2 double parameters
    public double add(double a, double b) {
        System.out.println("Adding two doubles: " + a + " + " + b);
        return a + b;
    }
    // Method with different parameter order
    public String add(String str, int num) {
        System.out.println("Concatenating string and number: " + str + " + " + num);
        return str + num;
    }
    public String add(int num, String str) {
        System.out.println("Concatenating number and string: " + num + " + " + str);
        return num + str;
    }
}
