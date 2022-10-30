package org.example;

public class Purchase { /** класс Purchase (ПОКУПКА), имеет состояние (название продукта и его кол-во) и может передать данные в корзину */
    protected String product;
    protected int count;


    public Purchase(String product, int count) {
        this.product = product;
        this.count = count;
    }

    public String getProduct() {
        return product;
    }

    public int getCount() {
        return count;
    }
}
