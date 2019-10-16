package by.it.alekseeva.lesson05;
/*
Создайте 5 различных строк в списке ArrayList:

1. Создайте список строк.
2. Добавьте в него 5 различных строк.
3. Выведите его размер на экран.
4. Используя цикл выведите его содержимое на экран, каждое значение с новой строки.

*/


import java.util.ArrayList;

public class TaskB1 {
    public static void main(String[] args) {
        ArrayList<String> array = new ArrayList<>();
        array.add("Образовательный");
        array.add("центр");
        array.add("парка");
        array.add("высоких");
        array.add("технологий");
        System.out.println(array.size());

        for (int i = 0; i <5; i++) {
            System.out.println(array.get(i));
        }


    }

}
