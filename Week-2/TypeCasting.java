public class TypeCasting {
    public static void main(String[] args) {
        // Implicit casting
        int i = 100;
        double d = i;
        System.out.println("Implicit casting int to double: " + d);

        // Explicit casting
        double x = 9.78;
        int y = (int) x; 
        System.out.println("Explicit casting double to int: " + y);

        // Type promotion in expression
        byte a = 40;
        byte b = 50;
        byte c = (byte) (a + b); // promoted to int first
        System.out.println("Type promotion in expression: " + c);
    }
}
