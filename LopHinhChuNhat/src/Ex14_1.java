import java.util.Scanner;

public class Ex14_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input width : ");
        double width = sc.nextDouble();
        System.out.print("Input height : ");
        double height = sc.nextDouble();

        Rectangle rectangle = new Rectangle(width, height);

        System.out.println("Your Rectangle \n"+ rectangle.display());
        System.out.println("Perimeter of the Rectangle: "+ rectangle.getPerimeter());
        System.out.println("Area of the Rectangle: "+ rectangle.getArea());
    }
}
