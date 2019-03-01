import java.util.Scanner;

public class Acount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input number a : ");
        double a = sc.nextDouble();
        System.out.print("Input number b : ");
        double b = sc.nextDouble();
        System.out.print("Input number c : ");
        double c = sc.nextDouble();

        QuadraticEquation quadraticEquation = new QuadraticEquation(a, b, c);

        if (quadraticEquation.getDiscriminant() > 0){
            System.out.print("Root r1 = " + quadraticEquation.getRoot1() + " and Root r2 = " + quadraticEquation.getRoot2());
        }else if(quadraticEquation.getDiscriminant() == 0){
            System.out.print("Root kép r = " + quadraticEquation.getRoot());
        }else{
            System.out.print("The equation has no roots");
        }
    }
}
