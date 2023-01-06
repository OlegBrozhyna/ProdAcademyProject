package OOPExceptionProjetProducts;

import java.util.Arrays;

public class Order {
    private final Product[] products;

    public Order() {
        super();
        products = new Product[100];


    }

    public Product[] getProducts() {
        return products;
    }
    public void addProduct(Product product){
        for (int i = 0; i < products.length; i++) {
            if (products[i]==null){
                products[i]=product;
                return;
            }
        }
    }
    public Product seachProductById(int id) throws ProductNotFounException{
        for (int i = 0; i < products.length; i++) {
            if (products[i]!=null){
                if (products[i].getId()==id){
                    return products[i];
                }
            }

        }
        throw new ProductNotFounException();

        }
        public boolean removeProductById(int id){
            for (int i = 0; i < products.length; i++) {
                if (products[i]!=null){
                    if (products[i].getId()==id){
                        products[i]=null;
                        return true;
                    }
                }

            }
            return false;
        }
        public int calculateTotalSum(){
        int totalSum = 0;
            for (int i = 0; i < products.length; i++) {
                if (products[i]!=null){
                    totalSum+=products[i].getPrice();
                }

            }
            return totalSum;
        }

    @Override
    public String toString() {
        String result = "Order" + System.lineSeparator();
        for (int i = 0; i < products.length; i++) {
            if (products[i] !=null){
                result +=products[i] + System.lineSeparator();

            }

        }
        return "result {" +
                "total sum ="  + calculateTotalSum() + //+ Arrays.toString(products)
                '}';
    }
}








