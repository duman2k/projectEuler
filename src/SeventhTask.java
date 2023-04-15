//Задача 7
//10001-е простое число
//Выписав первые шесть простых чисел, получим 2, 3, 5, 7, 11 и 13. Очевидно, что 6-е простое число - 13.
//
//Какое число является 10001-м простым числом?
//

public class SeventhTask {
    public static void main(String[] args) {
        int count = 0;
        for (int i = 1; ; i+=2) {
            if (isPrimeNumber(i)) {
                count++;
            }
            if (count == 10001) {
                System.out.println(i);
                break;
            }
        }
    }

    //Простые числа не могут быть четными кроме 2
    //Делители числа не могут больше чем его квадратный корень
    public static boolean isPrimeNumber (int number) {
        int count = 0;
        int sqrtOfNum = (int)Math.sqrt(number);

        for (int i = 1; i <= sqrtOfNum; i++) {
            if (number % i == 0) count++;
            if (count > 1) return false;
        }

        return true;
    }
}

