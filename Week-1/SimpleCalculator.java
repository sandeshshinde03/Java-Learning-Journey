public class SimpleCalculator {
    public static void main(String[] args) {
        int num1 = 15; 
        int num2 = 4;

        int sum = num1 + num2;
        System.out.println("Addition: " + sum);

        int difference = num1 - num2;
        System.out.println("Subtraction: " + difference);

        int product = num1 * num2;
        System.out.println("Multiplication: " + product);

        int quotient = num1 / num2; 
        System.out.println("Division: " + quotient);

        int remainder = num1 % num2;
        System.out.println("Modulus: " + remainder);
    }
}
