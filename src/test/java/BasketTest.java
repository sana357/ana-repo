import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class BasketTest {

    @Test
    public void noRules_should_just_sum_price() {

        Basket basket = new Basket(1,1,1);
        basket.countBasedOnRules();

        assertThat(basket.getSum().doubleValue()).isEqualTo(2.95);
    }


    @Test
    public void basket_2butter_1bread() {

        Basket basket = new Basket(2,0,2);
        basket.countBasedOnRules();

        assertThat(basket.getSum().doubleValue()).isEqualTo(3.10);
    }


    @Test
    public void basket_4milks() {

        Basket basket = new Basket(0,4,0);
        basket.countBasedOnRules();

        assertThat(basket.getSum().doubleValue()).isEqualTo(3.45);
    }


    @Test
    public void basket_3_discounts() {

        Basket basket = new Basket(2,8,1);
        basket.countBasedOnRules();

        assertThat(basket.getSum().doubleValue()).isEqualTo(9.00);
    }

    @Test
    public void basket_3_discounts_random() {

        Basket basket = new Basket(2,8,1);
        basket.countBasedOnRules();

        assertThat(basket.getSum().doubleValue()).isNotEqualTo(5.00);
    }

}
