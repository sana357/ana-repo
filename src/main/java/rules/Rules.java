package rules;

import java.math.BigDecimal;

public interface Rules {

    BigDecimal priceWithoutDiscounts(BigDecimal butterPrice, BigDecimal milkPrice, BigDecimal breadPrice,
                                     Integer butterCount, Integer milkCount, Integer breadCount);

    BigDecimal priceAfterRule2ButtersAndBreadHalfPrice(BigDecimal sum, BigDecimal breadPrice, Integer butterCount, Integer breadCount);

    BigDecimal priceAfterRule3Milks4thFree(BigDecimal sum, BigDecimal milkPrice, Integer milkCount);

}
