package org.example;

/**
 * Демонстрація пріоритетів.
 * Створити 2 класи PriorityRunner та PriorityThread.
 * Запустити 3 потоки із пріоритетами (min, max, norm).
 * За допомогою циклу for виведемо на екран значення від 1 до 50 і вкажемо, який саме потік цю операцію робить.
 */
public class Main {
    public static void main(String[] args) {
        Thread max = new Thread();
        Thread min = new Thread();
        Thread norm = new Thread();
        max.start();
        min.start();
        norm.start();
    }
}
