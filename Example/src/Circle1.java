public class Circle1 extends Geometric {
    private double radius;

    public Circle1(){}

    public Circle1(double radius){
        this.radius = radius;
    }

    public Circle1(double radius, String color, String filled){
        this.radius = radius;
        setColor(color);
        setFilled(filled);
    }

    public double getRadius(){
        return this.radius;
    }

    public void setRadius(double newRadius){
        this.radius = newRadius;
    }

    public double getArea(){
        return radius * radius * Math.PI;
    }

    public double getPerimeter(){
        return 2 * radius * Math.PI;
    }

    public double diaMeter(){
        return 2 * radius;
    }

    public void printCircle1(){
        System.out.println("The " + getColor() + " circle is created with the radius is " + radius);
    }
}
