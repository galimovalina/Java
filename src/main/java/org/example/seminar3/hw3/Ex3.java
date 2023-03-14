package org.example.seminar3.hw3;

import org.example.seminar3.hw2.model.Product;
import org.example.seminar3.hw3.model.Book;

import java.util.ArrayList;
import java.util.List;

import static java.lang.Math.sqrt;

/**
 * Сведения о книге состоят из названия, фамилии автора, цены, года издания и количества страниц. Найти названия книг,
 * в которых простое количество страниц, фамилия автора содержит «А» и год издания после 2010 г, включительно.
 */
public class Ex3 {
    public static void main(String[] args) {
        Book book1 = new Book("Зима", "Петров", 500, 2008, 47);
        Book book2 = new Book("Весна", "Иванов", 250, 2010, 43);
        Book book3 = new Book("Лето", "Михалков", 300, 2011, 25);
        Book book4 = new Book("Осень", "Смирнов", 135, 2012, 67);
        Book book5 = new Book("Понедельник", "Андропов", 440, 2014, 79);

        List<Book> listBook = new ArrayList<>();
        listBook.add(book1);
        listBook.add(book2);
        listBook.add(book3);
        listBook.add(book4);
        listBook.add(book5);


        for (Book book : listBook) {
            if (isPrime(book.getPages()) && book.getAuthor().toLowerCase().contains("а") && book.getYear() >= 2010) {
                System.out.println(book.getName());
            }
        }
    }

    /**
     * @param pages число страниц
     * @return является ли количество страниц простым числом
     */
    private static boolean isPrime(int pages) {
        if (pages < 2) {
            return false;
        }
        double s = sqrt(pages);
        for (int i = 2; i <= s; i++) {
            if (pages % i == 0) {
                return false;
            }
        }
        return true;
    }


}
