package rules;

import java.math.BigDecimal;

public class RulesImpl implements Rules {

    public BigDecimal priceWithoutDiscounts(BigDecimal butterPrice, BigDecimal milkPrice, BigDecimal breadPrice,
                                            Integer butterCount, Integer milkCount, Integer breadCount) {

        BigDecimal sum = butterPrice.multiply(BigDecimal.valueOf(butterCount)).add(milkPrice.multiply(BigDecimal.valueOf(milkCount))).add(breadPrice.multiply(BigDecimal.valueOf(breadCount)));

        return sum;
    }


    public BigDecimal priceAfterRule2ButterAndBreadHalfPrice(BigDecimal sum, BigDecimal breadPrice, Integer butterCount, Integer breadCount) {

        while (butterCount >= 2 && breadCount >= 1) {
            sum = sum.subtract(breadPrice.divide(BigDecimal.valueOf(2)));

            butterCount -= 2;
            breadCount -= 1;
        }

        return sum;
    }


    public BigDecimal priceAfterRule3Milks4thFree(BigDecimal sum, BigDecimal milkPrice, Integer milkCount) {
        if (milkCount >= 4) {
            sum = sum.subtract(BigDecimal.valueOf(milkCount).divide(BigDecimal.valueOf(4)).multiply(milkPrice));
        }

        return sum;
    }
}
