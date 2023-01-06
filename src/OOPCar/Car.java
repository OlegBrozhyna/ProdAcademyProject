package OOPCar;

public class Car {
    private String color;
     private double weight;

    private int year;
   private double velosity=50;

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public double getVelosity() {
        return velosity;
    }

    public void setVelosity(double velosity) {
        this.velosity = velosity;
    }

    public Car(String color, double weight, int year) {
        this.color = color;
        this.weight = weight;
        this.year = year;


    }

    public Car() {
    }

    public void beep (){
         System.out.println("BEEEP BEEEP ");

     }
   public   void acelerations (double a){

     }
    public void decelerations (double b){
         if (velosity -b >0) velosity=velosity-b;

     }

    @Override
    public String toString() {
        return "Car{" +
                "color='" + color + '\'' +
                ", weight=" + weight +
                ", year=" + year +
                ", velosity=" + velosity +
                '}';
    }
}