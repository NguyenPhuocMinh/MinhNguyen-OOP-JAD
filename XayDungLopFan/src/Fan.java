public class Fan {
    public static final int SLOW = 1;
    public static final int MEDIUM = 2;
    public static final int FAST = 3;
    private int speed = SLOW;
    private boolean on = false;
    private double radius = 5;
    private String color = "blue";

    public Fan(int speed, boolean on, double radius, String color) {
        this.speed = speed;
        this.on = on;
        this.radius = radius;
        this.color = color;
    }

    public int getSpeed() {
        return this.speed;
    }

    public boolean isOn() {
        return this.on;
    }

    public double getRadius() {
        return this.radius;
    }

    public String getColor() {
        return this.color;
    }

    public void setRadius(double newRadius) {
        this.radius = newRadius;
    }

    public void setColor(String newColor) {
        this.color = newColor;
    }

    public void setSpeed(int newSpeed) {
        this.speed = newSpeed;
    }

    public void turnOn() {
        this.on = true;
    }

    public void turnOff() {
        this.on = false;
    }

    public String toString() {
        if(this.on){
            return ("Speed is : " + this.speed + " ,color is : " + this.color + " ,radius is : " + this.radius + " ,fan is on");
        } else {
            return ("Speed is : " + this.speed + " ,color is : " + this.color + " ,radius is : " + this.radius + " ,fan is off");
        }
    }
}
