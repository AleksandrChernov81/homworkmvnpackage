package ru.netology.nomworkmvnpackge.nomworkmvnpackgemvn.services;

public class VacationService {
    public int calculate(int income, int expenses, int treshold) {
        int count = 0; // счётчик месяцев отдыха
        int money = 0; // количество денег на счету
        for (int month = 0; month < 12; month++) {
            if (money >= treshold) { // можем ли отдыхать?
                count++; // увеличиваем счётчик месяцев отдыха
                money = (money - expenses) / 3;

            } else {
                money = money + income - expenses;
            }
        }
        return count;
    }
}