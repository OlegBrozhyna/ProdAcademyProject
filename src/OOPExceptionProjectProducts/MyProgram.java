package OOPExceptionProjetProducts;

public class MyProgram {
    public static void main(String[] args) {
        Product product1 =new Product("Aplle",1,2);
        Product product2 = new Product("Orange", 2,1);
        Product product3 = new Product("Ananas",3,0);
        System.out.println(product1);
        System.out.println();


        Order order = new Order();
        order.addProduct(product1);
        order.addProduct(product2);
        order.addProduct(product3);

        System.out.println(order);
        System.out.println();

        try {
            Product product4 =order.seachProductById(1);
            System.out.println(product4);
        } catch (ProductNotFounException e) {
            throw new RuntimeException(e);
        }
        System.out.println();
        System.out.println(order.removeProductById(1));
        System.out.println(order);

    }
}
