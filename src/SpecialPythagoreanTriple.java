//Задача 9
//Особая тройка Пифагора
//Тройка Пифагора - три натуральных числа a < b < c, для которых выполняется равенство
//
//a2 + b2 = c2
//Например, 32 + 42 = 9 + 16 = 25 = 52.
//
//Существует только одна тройка Пифагора, для которой a + b + c = 1000.
//Найдите произведение abc.

public class SpecialPythagoreanTriple {
    public static void main(String[] args) {
        for (int i = 1; i < 500; i++) {
            for (int j = i + 1; j < 500; j++) {
                for (int k = j + 1; k < 500; k++) {
                    if ((i + j + k == 1000) && (i * i + j * j == k * k)) {
                        System.out.println(i + " * " + j + " * " + k + " = " + i * j * k);
                        break;
                    }
                }
            }
        }
    }
}
