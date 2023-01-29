package ColectionsCocaCola;

import java.util.ArrayDeque;

public class CocaColaMashine {
    private final int colaConteinerSize;
    ArrayDeque<DoubleCocaCola> colaConteiner = new ArrayDeque<>();
    private int CocacolaContainerSize;
    private ArrayDeque<Poeople> poeopleQueue = new ArrayDeque<>();

    public CocaColaMashine(int cocacolaContainerSize) {
        this.colaConteinerSize = cocacolaContainerSize;
    }

    public void putCocaCola(DoubleCocaCola cocaCola) {
        if (colaConteiner.size() > colaConteinerSize) {
            colaConteiner.add(cocaCola);
        }else {
            System.out.println("CocaCola Mashine is Full !!!" );
        }

    }
    public void addPeopleToQueue (Poeople poeople){
        poeopleQueue.addLast(poeople);
    }
    public void giveDoubleCocaColaFirstPeopleInQueue(){
        if (colaConteiner.size()>0){
            Poeople fistPeopleInQueue = poeopleQueue.pollFirst();
            Poeople clonPeople = (Poeople) fistPeopleInQueue.drink(colaConteiner.pop());
            poeopleQueue.addLast(fistPeopleInQueue);
            poeopleQueue.addLast(clonPeople);
        }
    }
    public void showPeople (){
        for (Poeople poeople: poeopleQueue) {
            System.out.println( poeople + " ");
        }
        System.out.println();
        }
    }

