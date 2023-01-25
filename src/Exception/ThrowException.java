package Exception;

public class ThrowException {

    static double hours;
    static double payRate;

    public static double calculatePay(double hours,double payRate) {
        if(hours > 40){
            throw new IllegalArgumentException("Should be less than 40 hours");
        }
        return hours * payRate;
    }
}
