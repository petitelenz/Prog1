package com.itschool;
/* импорт сканера */
import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        // создаем новый объект класса Scaner - "inputNumb"
        Scanner inputNumb = new Scanner(System.in);

        // объявляем переменные
        int a;
        int n;
        
        // просим пользователя ввести числа для возведения в степень
        System.out.println("Здравствуйте! Для начала возведём любое указанное Вами число в любую указанную Вами степень");
        System.out.println("Введите, пожалуйста, число.");
        a = inputNumb.nextInt();

        System.out.println("Введите, пожалуйста, степень.");
        n = inputNumb.nextInt();
        double result = pow(a,n);

        // выводим результат
        System.out.println("Ваш результат:" + result);

    }

    // для вычислений
    private static double pow(int a, int n) {
        return Math.pow(a, n);
    }

    public static void equalation() {
        // объявляем переменные a, b, c и дискриминант D
        double a;
        double b;
        double c;
        double D;

        // попросим пользователя ввести данные
        System.out.println("А теперь решим квадратное уравнение.");
        System.out.println("Пожалуйста, введите a, b и с, чтобы получить результат.");

        // создаем новый объект класса Scaner - "inputNumbers"
        Scanner inputNumbers = new Scanner(System.in);

        // считываем переменные, которые вводит пользователь
        a = inputNumbers.nextDouble();
        b = inputNumbers.nextDouble();
        c = inputNumbers.nextDouble();


        // высчитываем результат в зависимости от полученной информации
        double r = 2;
        D = Math.pow(b,r) - 4 * a * c;
        if (D > 0) {
            double x1;
            double x2;
            x1 = (-b - Math.sqrt(D)) / (a * 2);
            x2 = (-b - Math.sqrt(D)) / (a * 2);
            System.out.println("Ваши корни уравнения:" + x1 + x2);
        }

        else if (D == 0) {
            double x;
            x = -b / (a * 2);
            System.out.println("Ваш корень уравнения:" + x);
        }

        else {
            System.out.println("Это уравнение не имеет решений! :)");
        }
    }

}
