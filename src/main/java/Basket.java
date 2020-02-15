
import rules.Rules;
import rules.RulesImpl;
import java.math.BigDecimal;

class Basket {

    private final BigDecimal butterPrice = BigDecimal.valueOf(0.80);
    private final BigDecimal milkPrice = BigDecimal.valueOf(1.15);
    private final BigDecimal breadPrice = BigDecimal.valueOf(1.00);

    private Integer butterCount;
    private Integer milkCount;
    private Integer breadCount;
    private BigDecimal sum;


    Basket (Integer butterCount, Integer milkCount, Integer breadCount) {
        this.butterCount = butterCount;
        this.milkCount = milkCount;
        this.breadCount = breadCount;
    }

    BigDecimal getSum() {
        return sum.setScale(2);
    }

    private void setSum(BigDecimal sum) {
        this.sum = sum;
    }


    void countBasedOnRules() {
        Rules rules = new RulesImpl();
        setSum(rules.priceWithoutDiscounts(this.butterPrice, this.milkPrice, this.breadPrice, this.butterCount, this.milkCount, this.breadCount));
        setSum(rules.priceAfterRule2ButterAndBreadHalfPrice(this.sum, this.breadPrice, this.butterCount, this.breadCount));
        setSum(rules.priceAfterRule3Milks4thFree(this.sum, this.milkPrice, this.milkCount));
    }

}

