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
                if (isPalindrome(numberToDigits(number))) {
                    if (biggestPalindrome < number) {
                        biggestPalindrome = number;
                    }
                    //System.out.println(i + " * " + j + " = " + number);
                }
            }
        }
        System.out.println(biggestPalindrome);
    }

    //Функция возвращает массив с цифрами числа
    public static ArrayList<Integer> numberToDigits (int number) {
        ArrayList<Integer> digits = new ArrayList();

        int smallDivider = 1;
        int bigDivider = 10;
        int digit;

        while (number > bigDivider / 10) {
            digit = (number % bigDivider) / smallDivider;
            digits.add(digit);

            smallDivider *= 10;
            bigDivider *= 10;
        }

        return digits;
    }
    //Функция проверяет является ли число палиндромом и возвращает true либо false
    public static boolean isPalindrome(ArrayList<Integer> number) {
        int size = number.size();

        for (int i = 0; i < size/2; i++) {
            if (number.get(i) != number.get(size - 1 - i)) {
                return false;
            }
        }

        return true;
    }
}
