//Задача 4
//Наибольшее произведение-палиндром
//Число-палиндром с обеих сторон (справа налево и слева направо) читается одинаково.
//Самое большое число-палиндром, полученное умножением двух двузначных чисел – 9009 = 91 × 99.
//
//TODO: Найдите самый большой палиндром, полученный умножением двух трехзначных чисел.

import java.util.ArrayList;

public class LargestPalindromeProduct {
    public static void main(String[] args) {
        int number;
        int biggestPalindrome = 0;

        for (int i = 999; i > 99 ; i--) {
            for (int j = i; j > 99; j--) {
                number = i * j;
                if (isPalindrome(number)) {
                    if (biggestPalindrome < number) {
                        biggestPalindrome = number;
                    }
                    System.out.println(i + " * " + j + " = " + number);
                }
            }
        }

        System.out.println(biggestPalindrome);
    }

    //Функция проверяет является ли число палиндромом и возвращает true либо false
    public static boolean isPalindrome(int number) {
        int reversedNum = 0;
        int dublicate = number;

        while (number != 0) {
            reversedNum = reversedNum * 10 + number % 10;
            number /= 10;
        }

        if (dublicate != reversedNum) return false;
        return true;

    }
}
