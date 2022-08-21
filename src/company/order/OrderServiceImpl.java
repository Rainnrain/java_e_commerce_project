package company.order;

import company.Cart;
import company.discount.Discount;

import java.util.Scanner;
import java.util.UUID;

import static company.StaticConstants.DISCOUNT_LIST;


public class OrderServiceImpl implements OrderService{
    @Override
    public String placeOrder(Cart cart) {
        double amountAfterDiscount= cart.calculateCartTotalAmount();


        if( cart.getDiscountId()!=null){

            try{
                Discount discount= findDiscountById(cart.getDiscountId());
            }catch( Exception e){
                System.out.println(e.getMessage());
            }

        }

        Scanner scanner = new Scanner(System.in);
        System.out.println("Which payment option would you like to choose?" +
                "Type 1: customer balance" +
                "Type 2: Mixed( Gift card and customer balance");

        int paymentType= scanner.nextInt();
        boolean checkoutResult=false;

        switch(paymentType){

            case 1:
                CheckoutService customerBalanceCheckoutService = new

        }


    }

    private Discount findDiscountById(UUID discountId) throws Exception{
        for(Discount discount : DISCOUNT_LIST){
            if(discount.getId().toString().equals(discountId.toString())){
                return discount;
            }
        }
        throw new Exception("Discount couldn't be found");
    }
}
