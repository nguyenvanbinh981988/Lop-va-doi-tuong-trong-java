public class FanMain {
    public static void main(String[] args) {
        Fan fan1 =new Fan();
        System.out.println(fan1.toString());

        Fan fan2 =new Fan(3,true,10,"yellow");
        System.out.println(fan2.toString());

        Fan fan3 =new Fan(2,true,5,"blue");
        System.out.println(fan3.toString());
    }
}


class Fan{
    private static final int SLOW = 1, MEDIUM = 2, FAST = 3;
    private int speed = 1;
    private boolean turnOnOff = false;
    private double radius = 5.0;
    private String color = "blue";

    public Fan(){
    }

    public Fan(int speed,boolean turnOnOff,double radius,String color){
        this.speed = speed;
        this.turnOnOff = turnOnOff;
        this.radius = radius;
        this.color = color;
    }

    public String toString(){
        if (!turnOnOff){
            return ("color:" + this.color + " Radius: "+ this.radius +", " + "Fan is off");
        } else {
            return ("Speed: "+ this.speed +", color:" + this.color + ", Radius: "+ this.radius +", " + "Fan is on");
        }
    }

}