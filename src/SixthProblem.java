//Задача 6
//Разность между суммой квадратов и квадратом суммы
//Сумма квадратов первых десяти натуральных чисел равна
//
//12 + 22 + ... + 102 = 385
//Квадрат суммы первых десяти натуральных чисел равен
//
//(1 + 2 + ... + 10)2 = 552 = 3025
//Следовательно, разность между суммой квадратов и квадратом суммы первых десяти натуральных чисел составляет 3025 − 385 = 2640.
//
//Найдите разность между суммой квадратов и квадратом суммы первых ста натуральных чисел.

public class SixthProblem {
    public static void main(String[] args) {
        int num = 100;
        int sumOfSquare = 0;
        int squareOfSum = 0;

        int difference;

        for (int i = 1; i <= num; i++) {
            sumOfSquare += i * i;
            squareOfSum += i;
        }

        difference = (squareOfSum * squareOfSum) - sumOfSquare;

        System.out.println(difference);
    }
}
