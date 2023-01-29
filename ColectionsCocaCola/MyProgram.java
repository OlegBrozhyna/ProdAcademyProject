package ColectionsCocaCola;

public class MyProgram {
    public static void main(String[] args) {

        CocaColaMashine cocaColaMashine = new CocaColaMashine(20);
        
        Poeople poeople = new Poeople("Leonard");
        poeople.clone();
        System.out.println(poeople);

        for (int i = 0; i < 20; i++) {
            cocaColaMashine.putCocaCola(new DoubleCocaCola());
        }
        cocaColaMashine.addPeopleToQueue(new Poeople("Leonard"));
        cocaColaMashine.addPeopleToQueue(new Poeople("Sheldon"));
        cocaColaMashine.addPeopleToQueue(new Poeople("Volovitc"));
        cocaColaMashine.addPeopleToQueue(new Poeople("Kutrapalli"));
        cocaColaMashine.addPeopleToQueue(new Poeople("Penny"));


        cocaColaMashine.giveDoubleCocaColaFirstPeopleInQueue();
        cocaColaMashine.showPeople();



    }
}
