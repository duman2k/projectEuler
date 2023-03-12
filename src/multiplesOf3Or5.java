// 1-задача проекта Эйлера
//
//Если выписать все натуральные числа меньше 10, кратные 3 или 5,
//то получим 3, 5, 6 и 9. Сумма этих чисел равна 23.
//
//Найдите сумму всех чисел меньше 1000, кратных 3 или 5.

public class multiplesOf3Or5 {
    public static void main(String[] args) {
        int sum = 0;
        int maxInt = 1000;
        for (int i = 1; i < maxInt; i++) {
            if (i % 3 == 0 || i % 5 == 0){
                sum += i;
            }
        }
        System.out.print(sum);
    }
}
