package org.example.seminar3.hw1;

import org.example.seminar3.hw1.model.Product;

import java.util.ArrayList;
import java.util.List;

/**
 * Дан массив записей: наименование товара, цена, сорт. Найти наибольшую цену товаров 1го или 2го сорта среди товаров, название которых содержит «высший».
 */
public class Ex1 {
    public static void main(String[] args) {
        Product product1 = new Product("высший огурец", 35, 1);
        Product product2 = new Product("апельсин", 50, 3);
        Product product3 = new Product("высший помидор", 45, 2);
        Product product4 = new Product("банан", 20, 3);

        List<Product> listProduct = new ArrayList<>();
        listProduct.add(product1);
        listProduct.add(product2);
        listProduct.add(product3);
        listProduct.add(product4);

        List<Integer> prices = new ArrayList<>();

        for (Product product : listProduct) {
            if (product.getSort() == 1 || product.getSort() == 2) {
                if (product.getName().contains("высший")) {
                    prices.add(product.getPrice());
                }
            }
        }
        System.out.println(MaxPrice(prices));

    }

    /**
     * @param prices коллекция цен на товары
     * @return максимальная цена
     */
    private static Integer MaxPrice(List<Integer> prices) {
        int max = 0;
        for (int i = 0; i < prices.size(); i++) {
            if (prices.get(i) > max) {
                max = prices.get(i);
            }
        }
        return max;
    }
}
