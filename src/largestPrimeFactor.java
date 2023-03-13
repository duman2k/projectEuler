//Простые делители числа 13195 - это 5, 7, 13 и 29.
//
//Каков самый большой делитель числа 600851475143, являющийся простым числом?

public class largestPrimeFactor {
    public static void main(String[] args) {
        double number = 600851475143.0;
        double sqrtOfNum = Math.sqrt(number);

        for (long i = 2L; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                if (isPrimeFactor(i)) {
                    System.out.println(i + " ");
                }
            }
        }
    }

    public static boolean isPrimeFactor(long number) {
        int count = 0;

        for (long i = 1L; i < number; i++) {
            if (number % i == 0) {
                count++;
            }
            if (count > 1)
                return false;
        }

        return true;
    }
}
