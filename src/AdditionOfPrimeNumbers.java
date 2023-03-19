//Задача 10
//Сложение простых чисел
//Сумма простых чисел меньше 10 равна 2 + 3 + 5 + 7 = 17.
//
//Найдите сумму всех простых чисел меньше двух миллионов.

public class AdditionOfPrimeNumbers {
    public static void main(String[] args) {
        long sum = 2;
        for (int i = 3; i < 2000000; i+=2) {
            if (isPrimeNumber(i)) sum += i;
        }
        System.out.println(sum);
    }


    public static boolean isPrimeNumber(int number) {
        int count = 0;
        double sqrtOfNum = Math.sqrt(number);
        for (int i = 1; i <= sqrtOfNum; i+=2) {
            if (number % i == 0) count++;
            if (count > 1) return false;
        }
        return true;
    }
}