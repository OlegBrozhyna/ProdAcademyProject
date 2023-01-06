package Super2.OOPImitationSuperHeroReassignment;

public class SuperHero {
    private String suit;
    private String tights;
    private String SpecialPower;

    public String getSuit() {
        return suit;
    }

    public void setSuit(String suit) {
        this.suit = suit;
    }

    public String getTights() {
        return tights;
    }

    public void setTights(String tights) {
        this.tights = tights;
    }

    public String getSpecialPower() {
        return SpecialPower;
    }

    public void setSpecialPower(String specialPower) {
        SpecialPower = specialPower;
    }

    public SuperHero(String suit, String tights, String specialPower) {
        this.suit = suit;
        this.tights = tights;
        SpecialPower = specialPower;
    }

    public void useSpecialPower() {
        System.out.println("piu piu ");

    }

    public void putOnSuit() {
        System.out.println("putOnSuit");
    }


    @Override
    public String toString() {
        return "SuperHero{" +
                "suit='" + suit + '\'' +
                ", tights='" + tights + '\'' +
                ", SpecialPower='" + SpecialPower + '\'' +
                '}';
    }
}

