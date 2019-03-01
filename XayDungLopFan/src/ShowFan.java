public class ShowFan {
    public static void main(String[] args) {
        Fan fan1 = new Fan(Fan.FAST,true,10,"yellow");

        System.out.println("Information fan1 = " + fan1.toString());

        Fan fan2 = new Fan(Fan.MEDIUM,false,5,"blue");
        System.out.println("Information fan2 = " + fan2.toString());
    }
}
