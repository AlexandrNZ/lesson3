package org.example;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        int size = 10; // кол-во элементов списка

        // заполнение списка произвольными числами
        for (int i = 0; i < size; i++) {
            int number = (int)(Math.random() * 100); // случайные числа от 0 до 99
            numbers.add(number);
        }

        // вывод списка до удаления чётных чисел
        System.out.println("Список до удаления чётных чисел:");
        System.out.println(numbers);

        // удаление чётных чисел
        for (int i = 0; i < numbers.size(); i++) {
            if (numbers.get(i) % 2 == 0) {
                numbers.remove(i);
                i--; // уменьшаем индекс, чтобы не пропустить следующий элемент после удаления
            }
        }

        // вывод списка после удаления чётных чисел
        System.out.println("Список после удаления чётных чисел:");
        System.out.println(numbers);

        // поиск минимального и максимального значения
        int min = numbers.get(0);
        int max = numbers.get(0);
        for (int i = 1; i < numbers.size(); i++) {
            if (numbers.get(i) < min) {
                min = numbers.get(i);
            }
            if (numbers.get(i) > max) {
                max = numbers.get(i);
            }
        }

        // вывод минимального и максимального значения
        System.out.println("Минимальное значение: " + min);
        System.out.println("Максимальное значение: " + max);

        // поиск среднего значения
        int sum = 0;
        for (int i = 0; i < numbers.size(); i++) {
            sum += numbers.get(i);
        }
        double average = (double)sum / numbers.size();

        // вывод среднего значения.
        System.out.println("Среднее значение: " + average);
    }
}