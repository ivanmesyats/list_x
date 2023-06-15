package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        /*3.Задано список цілих чисел та число X. Не використовуючи допоміжних
об'єктів і не змінюючи розмір списку, переставити елементи списку так,
щоб спочатку йшли числа, що не перевищують X, а потім числа, більші за X.*/

        int x = 13;
        int tmp = 0;
        ArrayList<Integer> numbers = new ArrayList<Integer>(Arrays.asList(5, 20, 25, 21, 5, 11, 9, 8, 10, 18));

        System.out.println(numbers);

        for (int i = 0; i < numbers.size(); i++) {
            boolean ok = true;
            for (int j = i + 1; j < numbers.size(); j++) {

                if (numbers.get(j) < x) {

                    ok = false;
                    break;

                }
            }

            if (ok) break;

            if (numbers.get(i) < x) {
                tmp = numbers.get(i);
                numbers.remove(i);
                numbers.add(0, tmp);
                continue;
            }

            if (numbers.get(i) >= x) {
                tmp = numbers.get(i);
                numbers.remove(i);
                numbers.add(tmp);
                i--;
            }


        }
        System.out.println(numbers);
    }
}

