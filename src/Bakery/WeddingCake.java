package Bakery;

public class WeddingCake extends Cake {
    protected int tiers;
    public WeddingCake(){
        setFlavor("Almond");
    }


    public int getTiers() {
        return tiers;
    }

    public void setTiers(int tiers) {
        this.tiers = tiers;
    }


}
