package app;

import discountCondition.CozDiscountCondition;
import discountCondition.DiscountCondition;
import discountCondition.KidDiscountCondition;
import discountPolicy.FixedAmountDiscountPolicy;
import discountPolicy.FixedRateDiscountPolicy;
import discount.*;

public class Order {
    private Cart cart;

    private Discount discount;


    public Order(Cart cart, Discount discount){
        this.cart = cart;
        this.discount   = discount;
    }

    public void makeOrder(){

        discount.checkAllDiscountConditions();

        int sumPrice = cart.calculateTotalPrice();
        int finalPrice = discount.discount(sumPrice);



        System.out.println("[ð¢] ì£¼ë¬¸ì´ ìë£ëììµëë¤. ");
        System.out.println("[ð¢] ì£¼ë¬¸ ë´ì­ì ë¤ìê³¼ ê°ìµëë¤. ");
        System.out.println("-".repeat(60));

        cart.printCartItemDetails();

        System.out.println("-".repeat(60));
        System.out.printf("ê¸ì¡ í©ê³       : %dì\n",sumPrice);
        System.out.printf("í ì¸ ê¸ì¡       : %dì\n",finalPrice-sumPrice);
        System.out.printf("ìµì¢ ê¸ì¡       : %dì\n",finalPrice);
    }


}
