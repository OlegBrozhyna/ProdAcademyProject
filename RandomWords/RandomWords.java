

public class RandomWords {
    public static void main(String[] args) {
        String[] listOne = {" 24/7 ", " multi-Tier ", " 30 000-foot ", " B-to-B ",
                " win-win ,", " front-end ,", " web=based ,", " pervasive ,", " smart ,",
                " six - sigma ,", " critical-patch ,", " dynamic ,"};
        String[] listTwo = {" empowered ,", " sticky ,", " value-added ,", " oriented ,",
                " centric ,", " distribute ,", " clustered ,", " branded ,", " outside- the-box ,",
                " positioned ,", " networked ,", " focused ,", " leveraged ,", " aligned ,", " targeted ,",
                " shared ,", " cooperative ,", " accelerated ,"};
        String[] listThree = {" process ,", " tipping ,", " point ,", " solution ,", " architecture ,",
                " core competency ,", " strategy ,", " mind-share ,", " portal ,", " space ,", " vision ,",
                " paradigm , ", " mission ,"};


        int oneLength = listOne.length;
        int twoLength = listTwo.length;
        int threeLength = listThree.length;

        int random1 = (int) (Math.random() * oneLength);
        int random2 = (int) (Math.random() * twoLength);
        int random3 = (int) (Math.random() * threeLength);

        String phrase = listOne[random1] + "" + listTwo[random2] + "" + listThree[random3];

        System.out.println("What is need is a : " + phrase);

    }
}
