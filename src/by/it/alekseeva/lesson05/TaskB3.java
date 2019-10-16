package by.it.alekseeva.lesson05;

/*
Минимум и максимум
1. Создать массив m на 10 целых чисел.
2. Ввести в него значения с клавиатуры.
3. Отсортируйте массив любым способом
4. Выполните вычисление новых (после сортировки) индексов первого и последнего элемента
исходного массива и выведите их в виде:
Index of first element=???
Index of last element=???

Например, для такого ввода
123 99 88 77 66 5 4 3 0 2

ожидается такой вывод:
Index of first element=9
Index of last element=1

*/

import java.util.Scanner;

public class TaskB3 {
    public static void main(String[] args) {
        int m[] = new int[10];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 10; i++) {
            m[i] = sc.nextInt();
        }
        int first, last;
        first = m[0];
        last = m[9];
        int a, b, t;
        int size;
        size = 10;
        for (a =1; a < size; a++) {
            for (b=size-1; b>=a; b--) {
                if (m[b-1] > m[b]) {
                    t = m[b-1];
                    m[b-1] = m[b];
                    m[b] = t;
                }
            }

        }

        }
        }

