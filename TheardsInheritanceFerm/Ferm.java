package OOPTheardsInheritanceTestingFerm;

public class Ferm extends Thread {
    @Override
    public void run() {
        super.run();
        System.out.println("Therd run");
    }

    private String eat;
    private String name;
    private String locations;
    private int size;
    private int  age;




    public Ferm (String eat, String name, String locations, int size, int age) {
        this.eat = eat;
        this.name = name;
        this.locations = locations;
        this.size = size;
        this.age = age;

    }
    public void makeNoise(){
        System.out.println( " animal always hudgry " );


    }
    public void setEat(){



    }
    public void setAge(){
        System.out.println( age + " grow old " );

    }
    public void setSize(){

    }
    public void sleep(){
        System.out.println(" Animal sleep " + locations);


    }
    public void name() {
        System.out.println(" My name is " + name );
    }
    @Override
    public String toString() {
        return "Animal{" +
                "eat='" + eat + '\'' +
                ", name='" + name + '\'' +
                ", locations='" + locations + '\'' +
                ", size='" + size + '\'' +
                ", age='" + age + '\'' +
                '}';
    }
}



