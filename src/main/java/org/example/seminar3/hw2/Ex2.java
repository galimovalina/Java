package org.example.seminar3.hw2;

import org.example.seminar3.hw2.model.Product;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Scanner;

/**
 * Сведения о товаре состоят из наименования, страны-производителя, веса, цены, сорта. Получить наименования товаров заданного сорта с наименьшей ценой.
 */
public class Ex2 {
    public static void main(String[] args) {
        Product product1 = new Product("яблоко", "Россия", 2, 33, 2);
        Product product2 = new Product("помидор", "Армения", 3, 45, 1);
        Product product3 = new Product("мандарин", "Грузия", 2, 25, 2);
        Product product4 = new Product("огурец", "Беларусь", 4, 55, 3);
        Product product5 = new Product("апельсин", "США", 1, 25, 2);
        Product product6 = new Product("яблоко", "Россия", 2, 35, 2);

        List<Product> listProduct = new ArrayList<>();
        listProduct.add(product1);
        listProduct.add(product2);
        listProduct.add(product3);
        listProduct.add(product4);
        listProduct.add(product5);
        listProduct.add(product6);

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите сорт: ");
        int findSort = scanner.nextInt();

        List<Product> rightSort = new ArrayList<>();

        for (Product product : listProduct) {
            if (product.getSort() == findSort) {
                rightSort.add(product);   //лист с продуктами искомого сорта
            }
        }
        for (Product product : rightSort) {
            if (product.getPrice().equals(MinPrice(rightSort))) {
                System.out.println(product.getName());
            }
        }
    }

    /**
     * @param rightSort лист с продуктами
     * @return минимальная цена продуктов в листе
     */
    private static Integer MinPrice(List<Product> rightSort) {
        int min = 100000;
        for (Product product : rightSort) {
            if (product.getPrice() < min) {
                min = product.getPrice();
            }
        }
        return min;
    }
}
