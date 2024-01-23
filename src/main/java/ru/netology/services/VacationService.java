package ru.netology.services;

public class VacationService {
    public int calculate(int income, int exspenses, int threshold) {
        int months = 0;
        int cach = 0;
        for (int i = 0; i < 12; i++) {
            if (cach >= threshold) {
                months++;
                cach /= 3; // cach = cach / 3
            } else {
                cach += income;
                cach -= exspenses;
            }
        }
        return months;
    }

}
