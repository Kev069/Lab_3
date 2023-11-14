package org.example;

import java.util.Scanner;

// Класс для работы с числами Фибоначчи
class FibActions {
    // Метод для вычисления n-го числа Фибоначчи с использованием цикла
    static int computeWithCycle(int n) {
        if (n <= 1) {
            return n;
        }
        int prev = 0;
        int current = 1;
        for (int i = 2; i <= n; i++) {
            int next = prev + current;
            prev = current;
            current = next;
        }
        return current;
    }

    // Метод для вычисления n-го числа Фибоначчи с использованием рекурсии
    static int computeWithRecursion(int n) {
        if (n <= 1) {
            return n;
        } else {
            return computeWithRecursion(n - 1) + computeWithRecursion(n - 2);
        }
    }
}

// Класс для работы с факториалом
class FactActions {
    // Метод для вычисления факториала числа с использованием цикла
    static int computeWithCycle(int n) {
        int factorial = 1;
        for (int i = 1; i <= n; i++) {
            factorial *= i;
        }
        return factorial;
    }

    // Метод для вычисления факториала числа с использованием рекурсии
    static int computeWithRecursion(int n) {
        if (n == 0) {
            return 1; // Факториал 0 равен 1
        } else {
            return n * computeWithRecursion(n - 1);
        }
    }
}

// Класс для работы с суммой цифр числа
class SumDigits {
    static int compute(int n) {
        if (n == 0) {
            return 0;
        }
        return n % 10 + compute(n / 10);
    }
}

// Класс для работы с суммой двух чисел без использования оператора +
class SumNumbers {
    static int compute(int a, int b) {
        if (b == 0) {
            return a;
        } else {
            return compute(a ^ b, (a & b) << 1);
        }
    }
}

public class Main {
    public static void main(String[] args) {
        // Розкоментуйте нижченаведений код, щоб дозволити користувачеві вводити числа

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введіть число n:");
        int n = scanner.nextInt();
        System.out.println("Введіть число a:");
        int a = scanner.nextInt();
        System.out.println("Введіть число b:");
        int b = scanner.nextInt();


        /* Закоментуйте цей код, коли ви розкоментуєте код вище
        int n = 5;
        int a = 3, b = 2; */

        System.out.println("Факториал числа " + n + ": " + FactActions.computeWithCycle(n));
        System.out.println("Число Фибоначчи номер " + n + ": " + FibActions.computeWithCycle(n));
        System.out.println("Сумма цифр числа " + n + ": " + SumDigits.compute(n));
        System.out.println("Сумма чисел " + a + " и " + b + ": " + SumNumbers.compute(a, b));
    }
}
