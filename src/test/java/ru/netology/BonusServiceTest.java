package ru.netology;

import org.junit.jupiter.api.Test;
import ru.netology.unit.BonusService;

import static org.junit.jupiter.api.Assertions.assertEquals;

class BonusServiceTest {

    @Test
    void remainTest1() {
        BonusService service = new BonusService();
        int expected = 900;
        int amount = 100;

        int actual = service.remain(amount);

        assertEquals(expected, actual);
    }

    @Test
    void remainTest2() {
        BonusService service = new BonusService();
        int expected = 100;
        int amount = 900;

        int actual = service.remain(amount);

        assertEquals(expected, actual);
    }

    @Test
    void remainTest3() {
        BonusService service = new BonusService();
        int expected = 1000;
        int amount = 0;

        int actual = service.remain(amount);

        assertEquals(expected, actual);
    }
}




