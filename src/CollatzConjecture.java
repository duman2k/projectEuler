//Задача 14
//Самая длинная последовательность Коллатца
//Следующая повторяющаяся последовательность определена для множества натуральных чисел:
//
//n → n/2 (n - четное)
//n → 3n + 1 (n - нечетное)
//
//Используя описанное выше правило и начиная с 13, сгенерируется следующая последовательность:
//13 → 40 → 20 → 10 → 5 → 16 → 8 → 4 → 2 → 1

//Получившаяся последовательность (начиная с 13 и заканчивая 1) содержит 10 элементов.
// Хотя это до сих пор и не доказано (проблема Коллатца (Collatz)), предполагается,
// что все сгенерированные таким образом последовательности оканчиваются на 1.
//
//Какой начальный элемент меньше миллиона генерирует самую длинную последовательность?
//Примечание: Следующие за первым элементы последовательности могут быть больше миллиона.
public class CollatzConjecture {
    public static void main(String[] args) {
        long numsUpTo = 1_000_000L;
        long largestSequence = 0;
        long num = 0;
        //System.out.println(sequenceLength(837799L));
        for (int i = 1; i < numsUpTo; i++) {
            if (largestSequence < sequenceLength(i)) {
                largestSequence = sequenceLength(i);
                num = i;
            }
        }
        System.out.println(num);
        System.out.println(largestSequence);

    }
    public static long sequenceLength (long number) {
        long count = 1L;
        while (number != 1) {
            number = number % 2 == 0 ? number/2 : number * 3 + 1;
            count++;
        }
        return count;
    }
}
