package Super2.OOPImitationSuperHeroReassignment;


public class IronMan extends SuperHero {
    private String specailPowerSteelFist;

    public IronMan(String suit, String tights, String specialPower, String specailPowerSteelFist) {
        super(suit, tights, specialPower);
        this.specailPowerSteelFist = specailPowerSteelFist;
    }

    public String getSpecailPowerSteelFist() {
        return specailPowerSteelFist;

    }

    public void setSpecailPowerSteelFist(String specailPowerSteelFist) {
        this.specailPowerSteelFist = specailPowerSteelFist;
    }

    public IronMan(String suit, String tights, String specialPower) {
        super(suit, tights, specialPower);


    }

    public void SpecailPowerSteelFist() {
        System.out.println("SteelFist");

    }
    @Override
    public String toString() {
        return "IronMan{" +
                "specailPowerSteelFist=  '" + specailPowerSteelFist + " Suit='" + getSuit() + "tights= '" + getTights() + '\'' +
                '}';
    }
}
