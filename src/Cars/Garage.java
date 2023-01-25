package Cars;

public class Garage {
    public static void main(String[] args) {
        Coupe myCar = new Coupe();
        myCar.setColor("Green");
        System.out.println(
        String.format("Car colour is %s and has %d doors",myCar.getColor(),myCar.getDoors())
        );
        myCar.mileage = 2;
    }
}
