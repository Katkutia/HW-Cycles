package ru.netology.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class VacationServiceTest {

    @Test
    public void test() {
        VacationService service = new VacationService();
        int exspected = 3;
        int actual = service.calculate(10_000, 3_000, 20_000);
        Assertions.assertEquals(exspected, actual);
    }

    @Test
    public void test2() {
        VacationService service = new VacationService();
        int exspected = 2;
        int actual = service.calculate(100_000, 60_000, 150_000);
        Assertions.assertEquals(exspected, actual);
    }
}
