package edu.remad.chapter9.item60;

import java.math.BigDecimal;

/**
 * Shows exact big decimal.
 * @author Remy Meier
 */
public class ExactBigDecimalDriver {

    /**
     * Constructs new {@link ExactBigDecimalDriver}.
     */
    public ExactBigDecimalDriver() {
        main(new String[5]);
    }

    public static void main(String[] args) {
        final BigDecimal TEN_CENTS = new BigDecimal("0.10");

        int itemsBought = 0;
        BigDecimal funds = new BigDecimal("1.00");
        for(BigDecimal price = TEN_CENTS; funds.compareTo(price) >= 0; price = price.add(TEN_CENTS)) {
            funds = funds.subtract(price);
            itemsBought++;
        }
        System.out.println(itemsBought + " items bought.");
        System.out.println("Money left over: $" + funds);
    }
}
