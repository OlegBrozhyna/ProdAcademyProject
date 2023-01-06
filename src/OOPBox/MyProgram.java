package OOPBox;

import java.util.Arrays;

public class MyProgram {
    public static void main(String[] args) {
        Box box1 = new Box();
      //  box1.wight = 2;
      //  box1.lenght = 4;
      //  box1.height = 2;
        box1.setWight(2);
        box1.setLenght(4);
        box1.setHeight(2);

        Box box2 = new Box(2, 2, 2);

        Box box3 = new Box(1, 2, 3);


        System.out.println(" Box1 value = " + box1.getValue());
        System.out.println(" Box2 value = " + box2.getValue());
        System.out.println(box1);
        System.out.println(box2);

        Box[] boxes = new Box[]{box1, box2, box3};
        System.out.println(boxes);

        Box maxBox = getMaxBox(boxes);

        System.out.println(maxBox);


    }

    public static Box getMaxBox(Box[] boxes) {
        Box maxBox = boxes[0];
        for (Box box : boxes) {
            if (maxBox.getValue() > maxBox.getValue()) {
                maxBox = box;

            }
        }
        return maxBox;
    }
}

