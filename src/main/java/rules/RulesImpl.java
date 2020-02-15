package rules;

import java.math.BigDecimal;
import java.util.logging.Logger;

public class RulesImpl implements Rules {
    private static final Logger LOGGER = Logger.getLogger(RulesImpl.class.getName());

    public BigDecimal priceWithoutDiscounts(BigDecimal butterPrice, BigDecimal milkPrice, BigDecimal breadPrice,
                                            Integer butterCount, Integer milkCount, Integer breadCount) {

        BigDecimal sum = butterPrice.multiply(BigDecimal.valueOf(butterCount)).add(milkPrice.multiply(BigDecimal.valueOf(milkCount))).add(breadPrice.multiply(BigDecimal.valueOf(breadCount)));

        LOGGER.info("Sum before discounts = " + sum);
        return sum;
    }


    public BigDecimal priceAfterRule2ButtersAndBreadHalfPrice(BigDecimal sum, BigDecimal breadPrice, Integer butterCount, Integer breadCount) {

        while (butterCount >= 2 && breadCount >= 1) {
            sum = sum.subtract(breadPrice.divide(BigDecimal.valueOf(2)));

            butterCount -= 2;
            breadCount -= 1;
        }
        LOGGER.info("Sum after rule 2 butters and bread half price = " + sum);
        return sum;
    }


    public BigDecimal priceAfterRule3Milks4thFree(BigDecimal sum, BigDecimal milkPrice, Integer milkCount) {
        if (milkCount >= 4) {
            sum = sum.subtract(BigDecimal.valueOf(milkCount).divide(BigDecimal.valueOf(4)).multiply(milkPrice));
        }
        LOGGER.info("Sum after rule 3 milks and 4th free  = " + sum);
        LOGGER.info("-------------------------------------") ;
        return sum;
    }
}
