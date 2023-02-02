package ColectionsCocaCola;

public class MyProgram {
    public static void main(String[] args) {

        CocaColaMashine cocaColaMashine = new CocaColaMashine(20);
        
        
        Poeople poeople = new Poeople("Leonard");
        Poeople clonedPeople = poeople.clone();
        

        for (int i = 0; i < 20; i++) {
            cocaColaMashine.putCocaCola(new DoubleCocaCola());
        }
        cocaColaMashine.addPeopleToQueue(new Poeople("Leonard"));
        cocaColaMashine.addPeopleToQueue(new Poeople("Sheldon"));
        cocaColaMashine.addPeopleToQueue(new Poeople("Volovitc"));
        cocaColaMashine.addPeopleToQueue(new Poeople("Kutrapalli"));
        cocaColaMashine.addPeopleToQueue(new Poeople("Penny"));
        
        System.out.println(clonedPeople.clone());
        
        
        clonedPeople.clone();
        clonedPeople.name = "Sheldon";
        System.out.println(clonedPeople);
        clonedPeople.name = "Kutrapalli";
        System.out.println(clonedPeople);
        clonedPeople.name = "Volovitc";
        System.out.println(clonedPeople);
        clonedPeople.name = "Penny";
        System.out.println(clonedPeople);


        cocaColaMashine.giveDoubleCocaColaFirstPeopleInQueue();
        cocaColaMashine.showPeople();



    }
}
