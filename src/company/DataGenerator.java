package company;

import company.balance.Balance;
import company.balance.CustomerBalance;
import company.balance.GiftCardBalance;
import company.category.Category;
import company.category.Electronic;
import company.category.Furniture;
import company.category.SkinCare;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class DataGenerator {

    public static void createCustomer(){

        Address address1Customer1 = new Address("7925","Jones Branch Dr","Suite 3300","22102","VA");
        Address address2Customer1 = new Address("825","GeorgeTown Pky","Suite 5355","22036","VA");
        Address address1Customer2 = new Address("5924","Lee Hwy","House","22044","VA");

        List<Address> customer1AddressList= new ArrayList<>();

        customer1AddressList.add(address1Customer1);
        customer1AddressList.add(address2Customer1);

        Customer customer1= new Customer(UUID.randomUUID(),"Lorraine", "lcannom@uwo.ca", customer1AddressList);
        Customer customer2=new Customer(UUID.randomUUID(),"Ramazan", "rcetintas@uwo.ca");

        StaticConstants.CUSTOMER_LIST.add(customer1);
        StaticConstants.CUSTOMER_LIST.add(customer2);


    }

    public static void createCategory(){

        Category category1= new Electronic(UUID.randomUUID(), "Electronic");
        Category category2=new Furniture(UUID.randomUUID(), "Furniture");
        Category category3=new SkinCare(UUID.randomUUID(), "SkinCare");

        StaticConstants.CATEGORY_LIST.add(category1);
        StaticConstants.CATEGORY_LIST.add(category2);
        StaticConstants.CATEGORY_LIST.add(category3);


    }

    public static void createProduct(){
        Product product1= new Product(UUID.randomUUID(), "iPhone", 1230.33, 8, 8, StaticConstants.CATEGORY_LIST.get(0).getId());
        Product product2= new Product(UUID.randomUUID(), "XBOX", 885.45, 15, 15, StaticConstants.CATEGORY_LIST.get(0).getId());
        Product product3= new Product(UUID.randomUUID(), "Table", 999.00, 25, 25, StaticConstants.CATEGORY_LIST.get(1).getId());
        Product product4=new Product(UUID.randomUUID(),"Milk", 4.89, 200, 200, UUID.randomUUID());

        StaticConstants.PRODUCT_LIST.add(product1);
        StaticConstants.PRODUCT_LIST.add(product2);
        StaticConstants.PRODUCT_LIST.add(product3);
        StaticConstants.PRODUCT_LIST.add(product4);


    }

    public static void createBalance(){
        Balance customerBalance= new CustomerBalance(StaticConstants.CUSTOMER_LIST.get(0).getId(),450.00);
        Balance giftCardBalance= new GiftCardBalance(StaticConstants.CUSTOMER_LIST.get(1).getId(), 500.00);

        StaticConstants.CUSTOMER_BALANCE_LIST.add(customerBalance);
        StaticConstants.GIFT_CARD_BALANCE_LIST.add(giftCardBalance);

    }


}
