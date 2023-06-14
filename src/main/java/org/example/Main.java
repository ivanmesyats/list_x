package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        /*3.Задано список цілих чисел та число X. Не використовуючи допоміжних
об'єктів і не змінюючи розмір списку, переставити елементи списку так,
щоб спочатку йшли числа, що не перевищують X, а потім числа, більші за X.*/

        int x = 5;
        boolean alreadyPrinted = false;
        ArrayList<Integer> numbers = new ArrayList<Integer>(Arrays.asList(5, 2, 4, 3, 5, 7, 9, 8, 10, 18));

        Collections.sort(numbers);
        System.out.println(numbers);


        for (int var : numbers) {

            if (var > x && !alreadyPrinted) {
                alreadyPrinted = true;
                System.out.println(x);
            }
            System.out.println(var);

        }

        if (!alreadyPrinted) {

            System.out.println(x);

        }
    }
    }
