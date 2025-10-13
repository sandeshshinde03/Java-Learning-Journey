import java.util.Scanner;

public class AreaVolume {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Area of rectangle
        System.out.print("Enter length of rectangle: ");
        double length = sc.nextDouble();
        System.out.print("Enter width of rectangle: ");
        double width = sc.nextDouble();
        System.out.println("Area of rectangle: " + (length * width));

        // Volume of cuboid
        System.out.print("Enter height of cuboid: ");
        double height = sc.nextDouble();
        System.out.println("Volume of cuboid: " + (length * width * height));

        sc.close();
    }
}
