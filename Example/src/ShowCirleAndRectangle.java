public class ShowCirleAndRectangle {
    public static void main(String[] args) {
        Circle1 circle1 = new Circle1(1);
        circle1.setColor("White");
        circle1.setFilled("Black");
        System.out.println("A Circle " + circle1.toString());
        System.out.println("The radius " + circle1.getRadius());
        System.out.println("The Area " + circle1.getArea());
        System.out.println("The Perimeter " + circle1.getPerimeter());
        Rectangle rectangle = new Rectangle(2,2);
        System.out.println("A Rectange " + rectangle.toString());
        System.out.println("The Area " + rectangle.getArea());
        System.out.println("The perimeter " + rectangle.getPerimeter());
    }
}
