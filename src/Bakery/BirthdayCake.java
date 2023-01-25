package Bakery;

public class BirthdayCake extends Cake{
    protected int candles;
    public BirthdayCake(){
        setFlavor("Chocolate");
        setPrice(9.99);
    }

    public int getCandles() {
        return candles;
    }

    public void setCandles(int candles) {
        this.candles = candles;
    }




}
