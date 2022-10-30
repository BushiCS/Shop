package org.example;

import java.util.Map;

public class Basket {

    private final Purchase[] purchases;

    public Basket(int productCount) {
        this.purchases = new Purchase[productCount];
    }

    public void addPurchase(String title, int count) {
        for (int i = 0; i < purchases.length; i++) {
            if (purchases[i] == null) {
                purchases[i] = new Purchase(title, count);
                return;
            }
            if (purchases[i].product.equals(title)) {
                purchases[i].count += count;
                return;
            }
        }
    }

    public long sum(Map<String, Integer> prices) {
        long sum = 0;
        System.out.println("КОРЗИНА: ");
        for (Purchase purchase : purchases) {
            if (purchase == null) {
                continue;
            }
            System.out.println("\t" + purchase.product + " " + purchase.count + " шт. в сумме " + (purchase.count * prices.get(purchase.product)) + " руб.");
            sum += (long) purchase.count * prices.get(purchase.product);
        }
        System.out.println("ИТОГО: " + sum);
        return sum;
    }
}
