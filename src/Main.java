import javax.swing.*;
import java.util.Arrays;
import java.util.Scanner;
import java.time.Year;

public class Main {
    public static void main(String[] args) {
        // Press Alt+Enter with your caret at the highlighted text to see how
        // IntelliJ IDEA suggests fixing it.
        System.out.println("Домашнее задание №4");
        System.out.println("Условные операторы. Урок 1");
        //Задание 1
        task1();
        System.out.println(".....");
        //Задание 2
        task2();
        System.out.println(".....");
        //Задание 3
        task3();
        System.out.println(".....");
        //Задание 4
        task4();
        System.out.println(".....");
        //Задание 5
        task5();
        System.out.println("_________");
        System.out.println("Домашка закончилась. Всем спасибо, все свободны.");
    }

    private static void task5() {
        System.out.println("Задание 5");
        //Инициализация
        int sezon;
        String printsezon = "Месяц введен не корректно";
        int monthNumber = Integer.parseInt(JOptionPane.showInputDialog(null,
                "Введите номер месяца для определения сезона:"));
        //Решение
        sezon = (monthNumber) / 3;
        //Вывод
        switch (sezon) {
            case 0, 4:
                printsezon = "Зима";
                break;
            case 1:
                printsezon = "Весна";
                break;
            case 2:
                printsezon = "Лето";
                break;
            case 3:
                printsezon = "Осень";
        }
        System.out.println("Потребуется дней: " + printsezon);
    }

    private static void task4() {
        System.out.println("Задание 4");
        //Инициализация
        int deliveryDey = 1;
        String deliveryMessag = "Потребуется дней: ";
        int deliveryDistance = Integer.parseInt(JOptionPane.showInputDialog(null,
                "Введите расстояние от офиса до клиента:"));
        //Решение
        if (deliveryDistance > 20 ) deliveryDey += 1;
        if (deliveryDistance > 60 ) deliveryDey += 1;
        if (deliveryDistance > 100 ) deliveryDey = 0;
        deliveryMessag = deliveryMessag + ((deliveryDey!=0) ? deliveryDey : "Доставка не предусмотренна");
        //Вывод
        System.out.println(deliveryMessag);
    }

    private static void task3() {
        System.out.println("Задание 3");
        //Инициализация
        Year year; // Задаем интересующий нас год
        year = Year.of(Integer.parseInt((JOptionPane.showInputDialog(null, "Задаем интересующий нас год:"))));
        //Решение и Вывод
        if (year.isLeap()) System.out.println(year + " год является високосным");
            else System.out.println(year + " не является високосным годом");
    }

    private static void task2() {
        System.out.println("Задание 2");
        //Инициализация
        int clientDeviceYear = 2015;
        int clientOS = -1;
        // Запрашиваем у пользователя операционную систему и год выпуска
        //System.out.println("Какая у вас операционная система?");
        String os = JOptionPane.showInputDialog(null, "Введите название вашей операционной системы:");
        int year = Integer.parseInt(JOptionPane.showInputDialog(null, "Введите год выпуска вашего телефона:"));
        //Решение
        // Определяем, какая операционная система установлена
        if (os.equals("iOS") && year<=clientDeviceYear) clientOS = 0; // Переменная clientOS равна 0, так как это iOS старая
            else if (os.equals("iOS")) clientOS = 2; //iOS новая
        if (os.equals("Android") && year<=clientDeviceYear) clientOS = 1;   // Переменная clientOS равна 1, так как это Android старая
            else if (os.equals("Android")) clientOS = 3; // Android - новая
        //Вывод
        switch (clientOS) {
            case 0 -> System.out.println(
                    "Установите облегченную версию приложения для iOS по ссылке");
            case 1 -> System.out.println(
                    "Установите облегченную версию приложения для Android по ссылке");
            case 2 -> System.out.println(
                    "Установите версию приложения для iOS по ссылке");
            case 3 -> System.out.println(
                    "Установите версию приложения для Android по ссылке");
            default -> System.out.println(
                    "Для Вашей OS: \"" + os + "\" "+year+" глда выпуска - установка приложения не предусмотрена");
        }
    }

    private static void task1() {
        System.out.println("Задание 1");
        //Инициализация
        int clientOS = -1;
        // Запрашиваем у пользователя операционную систему
        System.out.println("Какая у вас операционная система?");
        String os = JOptionPane.showInputDialog(null, "Введите название вашей операционной системы:");
        //Решение
        // Определяем, какая операционная система установлена
        if (os.equals("iOS")) clientOS = 0; // Переменная clientOS равна 0, так как это iOS
            else if (os.equals("Android")) clientOS = 1;   // Переменная clientOS равна 1, так как это Android
        //Вывод
        switch (clientOS) {
            case 0 -> System.out.println(
                    "Установите версию приложения для iOS по ссылке");
            case 1 -> System.out.println(
                    "Установите версию приложения для Android по ссылке");
            default -> System.out.println(
                    "Для Вашей OS: \"" + os + "\" установка приложения не предусмотрена");
        }
    }
}