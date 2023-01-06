package Super2.OOPImitationSuperHeroReassignment;

public class MyProgram {
    public static void main(String[] args) {
        SpiderMan spiderMan = new SpiderMan("red", "black", "piu piu");
        IronMan ironMan = new IronMan("black", "silver", "steelFist");

        // spiderMan.setSuit("red");
        //   spiderMan.setTights("black");
        System.out.println("spiderMan - " + spiderMan);
        System.out.println();
        System.out.print("Use Special Power - ");
        spiderMan.useSpecialPower();
        System.out.print("Get dressed - ");
        spiderMan.putOnSuit();

        System.out.println();

        System.out.println(ironMan);
        System.out.println();
        System.out.print("IronMan  - ");
        ironMan.putOnSuit();
        System.out.print("Special Power -");
        ironMan.SpecailPowerSteelFist();


    }
}
