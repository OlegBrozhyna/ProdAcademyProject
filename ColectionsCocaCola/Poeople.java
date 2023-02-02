package ColectionsCocaCola;

public class Poeople implements Cloneable {
    
    public String name;

    public Poeople(String name) {
        this.name = name;


    }

    public String getName() {
        return name;
    }

    public Object drink(DoubleCocaCola cocaCola) {
        cocaCola = null;
        return this.clone();

    }

    @Override
    public String toString() {
        return "Poeople{" +
                "name='" + name + '\'' +
                '}';
    }
    public Poeople clone(){

        try {
            return (Poeople) super.clone();
        } catch (CloneNotSupportedException e) {
            return clone();

        }
    }


    {

    }
}
