//Задача 16
//Сумма цифр степени
//215 = 32768, сумма цифр этого числа равна 3 + 2 + 7 + 6 + 8 = 26.
//
//Какова сумма цифр числа 2^1000?

import java.math.BigInteger;

public class Task16 {
    public static void main(String[] args) {
        BigInteger result = BigInteger.valueOf(1);
        BigInteger num = BigInteger.valueOf(2);
        int pow = 1000;

        for (long i = 1; i <= pow; i++) {
            result = result.multiply(num);
        }
        System.out.println(num +" в " + pow +  " степени: " + result);

        char[] array = result.toString().toCharArray();
        long sum = 0;

        for (char c : array) {
            sum += c - 48;
        }

        System.out.println("Сумма цифр = " + sum);
    }
}
