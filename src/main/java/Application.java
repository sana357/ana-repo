import java.util.logging.Logger;


public class Application {
    private static final Logger LOGGER = Logger.getLogger(Application.class.getName());

    static {
        System.setProperty("java.util.logging.SimpleFormatter.format", "%5$s %n");
    }

    public static void main(String[] args) {

        Basket basket = new Basket(1, 1, 1);
        basket.countBasedOnRules();


        Basket basket2 = new Basket(2, 0, 2);
        basket2.countBasedOnRules();

        Basket basket3 = new Basket(0, 4, 0);
        basket3.countBasedOnRules();

        Basket basket4 = new Basket(2, 8, 1);
        basket4.countBasedOnRules();


    }
}
