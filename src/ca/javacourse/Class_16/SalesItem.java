package ca.javacourse.Class_16;

import java.math.BigDecimal;

public class SalesItem {

    public SalesItem(int sku, String name, BigDecimal price, int soh)
    {
        this.sku = sku;
        this.name = name;
        this.price = price;
        this.stockOnHand = soh;

    }

    public int sku;
    public String name;
    public BigDecimal price;
    public int stockOnHand;
}
