//2-задача проекта Эйлера

//Каждый следующий элемент ряда Фибоначчи получается при сложении двух предыдущих.
// Начиная с 1 и 2, первые 10 элементов будут:
//1, 2, 3, 5, 8, 13, 21, 34, 55, 89, ...
//
//Найдите сумму всех четных элементов ряда Фибоначчи, которые не превышают четыре миллиона.

public class evenFibonacciNumbers {
    public static void main(String[] args) {
        int sum = 0;
        int indexZero = 1;
        int indexOne = 1;
        int tmp;

        while (indexOne < 4000000) {
            if (indexOne % 2 == 0) {
                sum += indexOne;
            }
            tmp = indexOne;
            indexOne = indexZero + tmp;
            indexZero = tmp;

            System.out.print(indexZero + " ");
        }
        System.out.println(indexOne);
        System.out.printf("\nsum = " + sum);
    }
}
