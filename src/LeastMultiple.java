//Задача 5
//Наименьшее кратное
//2520 - самое маленькое число, которое делится без остатка на все числа от 1 до 10.
//
//Какое самое маленькое число делится нацело на все числа от 1 до 20?
public class LeastMultiple {
    public static void main(String[] args) {
        int number = 1;
        boolean bool = true;
        while (bool) {
            for (int i = 2; i < 21; i++) {
                if (number % i != 0) {
                    break;
                }
                if (i == 20 && number % i == 0) {
                    System.out.println(number);
                    bool = false;
                }
            }
            number++;
        }
    }
}
