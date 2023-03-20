//Задача 12
//Треугольное число с большим количеством делителей
//Последовательность треугольных чисел образуется путем сложения натуральных чисел. К примеру, 7-е треугольное число равно 1 + 2 + 3 + 4 + 5 + 6 + 7 = 28. Первые десять треугольных чисел:
//
//1, 3, 6, 10, 15, 21, 28, 36, 45, 55, ...
//
//Перечислим делители первых семи треугольных чисел:
//
// 1: 1
// 3: 1, 3
// 6: 1, 2, 3, 6
//10: 1, 2, 5, 10
//15: 1, 3, 5, 15
//21: 1, 3, 7, 21
//28: 1, 2, 4, 7, 14, 28
//Как мы видим, 28 - первое треугольное число, у которого более пяти делителей.
//
//Каково первое треугольное число, у которого более пятисот делителей?

public class TriangularNumber {
    public static void main(String[] args) {
        long start = System.currentTimeMillis();

        int triangle = 0;
        int count = 0;
        boolean bool = true;

        for (int i = 1; bool; i++) {
            triangle += i;
            if (numberOfDivisors(triangle) > 500) bool = false;
        }

        System.out.println(triangle);

        long time = System.currentTimeMillis() - start;
        System.out.println(time);
    }

    public static int numberOfDivisors (int number) {
        int count = 0;

        for (int i = 1; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                count++;
            }
        }

        return count * 2;
    }
}

