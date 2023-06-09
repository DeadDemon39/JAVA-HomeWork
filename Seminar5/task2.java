package Seminar5;

 // Пусть дан список сотрудников:

// Иван Иванов

// Светлана Петрова

// Кристина Белова

// Анна Мусина

// Анна Крутова

// Иван Юрин

// Петр Лыков

// Павел Чернов

// Петр Чернышов

// Мария Федорова

// Марина Светлова

// Мария Савина

// Мария Рыкова

// Марина Лугова

// Анна Владимирова

// Иван Мечников

// Петр Петин

// Иван Ежов

// Написать программу, которая найдёт и выведет повторяющиеся имена с количеством повторений. Отсортировать по убыванию популярности.


import java.util.HashMap;
import java.util.Map;


public class task2 {
    public static void main(String[] args) {
        
        String[] nameWorkers = {"Иван", "Петр", "Антон", "Сергей", "Иван",
                "Антон", "Иван", "Антон", "Иван", "Петр", "Антон", "Сергей", "Антон", "Антон"};
        HashMap<String, Integer> workers = new HashMap<>();
        for (String i : nameWorkers) {
            int newValue = workers.getOrDefault(i, 0) + 1;
            workers.put(i, newValue);
        }
        System.out.println(workers);

        workers.entrySet().stream()
                .sorted(Map.Entry.<String, Integer>comparingByValue().reversed())
                .forEach(System.out::println);
    }
    
}
