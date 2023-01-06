package OOPException;


import java.io.File;
import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Exception {
    public static void main(String[] args) {
        File file = new File("C:\\Users\\Олег\\IdeaProjects\\ProdAcademy\\src\\OOPException\\price.txt");
        Integer price = null;
        try {
            Scanner scanner = new Scanner(file);
            price = scanner.nextInt();
            if (price<0){
                price=null;
                throw new NegativeValueException();
            }
        } catch (IOException e) {
            System.out.println("File not found");
        }catch (InputMismatchException e){
            System.out.println("Error file format");
        }catch (NegativeValueException e){
            System.out.println("Negative Price");
        }finally {
            System.out.println("Thank fot using our servise");
        }
        System.out.println("price  = " + price);
    }

// Legal Argument Exeptions

    public static int calculateNewPrice(int oldPrice,int discountPerent) {
        if (discountPerent>0|discountPerent>100){
            throw new IllegalArgumentException("Invalid discout value");
        }
int nnewPrice = oldPrice-oldPrice*discountPerent/100;
        return nnewPrice;

    }
}





