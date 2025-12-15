public class MultipleExceptionDemo {
    public static void main(String[] args) {
        try {
            int arr[] = new int[5];
            arr[10] = 30;
        } catch (ArithmeticException e) {
            System.out.println("Arithmetic Exception");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array Index Out of Bounds");
        } catch (Exception e) {
            System.out.println("General Exception");
        }
    }
}
