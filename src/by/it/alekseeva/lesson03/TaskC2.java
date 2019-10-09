package by.it.alekseeva.lesson03;

import java.util.Scanner;

/*
    Сумма цифр четырехзначного числа

    Реализуйте метод sumDigitsInNumber(int number).
    Метод на вход принимает целое четырехзначное число.
    Нужно посчитать сумму цифр этого числа, и вернуть эту сумму.

    Пример:
    Метод sumDigitsInNumber вызывается с параметром 5467.

    Пример вывода:
    22

    Требования:
    1. В методе sumDigitsInNumber не могут быть использованы никакие дополнительные классы.
    2. Метод sumDigitsInNumber(int) должен быть не приватным и статическим.
    3. Метод sumDigitsInNumber должен возвращать значение типа int.
    4. Метод sumDigitsInNumber не должен ничего выводить на экран.
    5. Метод sumDigitsInNumber должен правильно возвращать сумму всех цифр в числе number.
*/
public class TaskC2 {
       public static void main(String[] args) {
           Scanner sc = new Scanner(System.in);
           int N = sc.nextInt();
           System.out.println(sumDigitsInNumber(N));
       }

    private static int sumDigitsInNumber(int N) {

        int sum = 0;
        int CD;
        CD = N %10;
        sum = sum + CD;
        N = N/10;

        CD = N %10;
        sum = sum + CD;
        N = N/10;

        CD = N %10;
        sum = sum + CD;
        N = N/10;

        sum = sum + N;
           return sum;
    }


}
