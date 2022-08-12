package company;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("test");

        DataGenerator.createCustomer();
        DataGenerator.createCategory();
        DataGenerator.createProduct();
//        createBalance();
//        createDiscount();

        Scanner scanner= new Scanner(System.in);

        System.out.println("Select Customer:");

        for(int i=0; i<StaticConstants.CUSTOMER_LIST.size();i++){
            System.out.println("Type: "+ i+ " for customer:"+ StaticConstants.CUSTOMER_LIST.get(i).getUserName());
        }

        Customer customer= StaticConstants.CUSTOMER_LIST.get(scanner.nextInt());

while(true){


    System.out.println("What would you like to do? Just type id for selection");


    for(int i=0; i<prepareMenuOptions().length; i++){
        System.out.println(i+"-"+prepareMenuOptions()[i]);
    }


}




    }


    private static String[] prepareMenuOptions(){
        return new String[]{"List Categories","List Products","List Discount","See Balance","Add Balance",
                "Place an order","See Cart","See order details","See your address","Close App"};
    }

}
