package ColectionsFrameworkStack;

public class MyStackMain {
    public static void main(String[] args) {
        SimpleStac simpleStac = new SimpleStac(10);
        simpleStac.push(10);
        simpleStac.push(20);
        simpleStac.push(30);
        simpleStac.push(40);
        System.out.println(simpleStac.pop());
        System.out.println(simpleStac.peek());
        System.out.println(simpleStac.isEmpty());
        while (!simpleStac.isEmpty()) {
            long popElement = simpleStac.pop();
            System.out.println(popElement + " ");
        }
        {

        }

    }


}

