package OOPBox;

public class Box {
    private int wight;
    private int lenght;

   private int height;

    public int getValue() {
        return wight * lenght * height;

    }

    public int getWight(int i) {
        return wight;
    }

    public void setWight(int wight) {
        this.wight = wight;
    }

    public int getLenght(int i) {
        return lenght;
    }

    public void setLenght(int lenght) {
        this.lenght = lenght;
    }

    public int getHeight(int i) {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public Box(int wight, int lenght, int height) {
        this.wight = wight;
        this.lenght = lenght;
        this.height = height;


    }

    public Box() {
    }

    public String toString() {
        return "Box[ wight = " + wight + ", lenght = " + lenght + ", height = " + height + "]";

    }

    
}
