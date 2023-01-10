package Program1;

public class WaterBottlesCalculate {
    public static void main(String[] args) {
        int waterNum = 99;
        String word = "bottles";
        while (waterNum > 0) {
            if (waterNum == 1) {
                word = "botle";
            }
            System.out.println(waterNum + " " + word + " of water on the wall");
            System.out.println(waterNum + " " + word + " of water ");
            System.out.println("Take down ");
            System.out.println(" Please it around ");

            waterNum = waterNum - 1;

            if (waterNum > 0) {

                System.out.println(waterNum + " " + word + "of water on the wall");
            } else {
            }
            System.out.println(" No more bottles of water on the wall");

        }

    }
}