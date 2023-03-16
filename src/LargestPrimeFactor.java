//3-задача проекта Эйлера

//Простые делители числа 13195 - это 5, 7, 13 и 29.
//
//Каков самый большой делитель числа 600851475143, являющийся простым числом?

public class LargestPrimeFactor {
    public static void main(String[] args) {
        double number = 600851475143.0;
        double sqrtOfNum = Math.sqrt(number);

        for (long i = 2; i <= sqrtOfNum; i++) {
            if (number % i == 0) {
                if (isPrimeNumber(i)) {
                    System.out.println(i + " ");
                }
            }
        }
    }

    //Простые числа не могут быть четными кроме 2
    //Делители числа не могут больше чем его квадратный корень
    public static boolean isPrimeNumber(long number) {
        int count = 0;
        int sqrtOfNum = (int)Math.sqrt(number);

        for (long i = 1; i <= sqrtOfNum; i++) {
            if (number % i == 0) count++;
            if (count > 1) return false;
        }

        return true;
    }
}
