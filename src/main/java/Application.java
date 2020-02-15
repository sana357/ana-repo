import java.math.BigDecimal;

public class Application {

    public static void main(String[] args) {

        System.out.println("start");


        Basket basket = new Basket(1, 1, 1);
        basket.countBasedOnRules();
        BigDecimal sum = basket.getSum();
        double v = basket.getSum().doubleValue();
        System.out.println(basket.getSum().doubleValue());


        Basket basket2 = new Basket(2, 0, 2);
        basket2.countBasedOnRules();
        System.out.println(basket2.getSum().doubleValue());


        Basket basket3 = new Basket(0, 4, 0);
        basket3.countBasedOnRules();
        System.out.println(basket3.getSum().doubleValue());


        Basket basket4 = new Basket(2, 8, 1);
        basket4.countBasedOnRules();
        System.out.println(basket4.getSum().doubleValue());



    }
}
