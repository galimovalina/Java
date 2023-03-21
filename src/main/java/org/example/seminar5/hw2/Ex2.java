package org.example.seminar5.hw2;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * Подсчитать количество искомого слова, через map (наполнением значение, где искомое слово будет являться ключом), вносить все слова не нужно
 */
public class Ex2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = "Россия идет вперед всей планеты. Планета — это не Россия.";
        String findWord = scanner.nextLine().toLowerCase();
        System.out.println("Слово "+findWord+" встретилось "+countWord(str,findWord)+" раз(а)");
    }

    /**
     *
     * @param str Строка для поиска слова
     * @param findWord Слово, которое нужно найти в строке
     * @return Кол-во искомого слова в строке
     */
    private static Integer countWord(String str, String findWord) {
        String[] s = str.toLowerCase().replaceAll("[.—,]", "").replaceAll("  "," ").split(" ");
        Map<String,Integer> myMap=new HashMap<>();
        myMap.put(findWord,0);
        for (int i = 0; i < s.length; i++) {
            if(s[i].equals(findWord)){
                myMap.put(findWord, myMap.get(findWord)+1);
            }
        }
        return myMap.get(findWord);
    }
}
