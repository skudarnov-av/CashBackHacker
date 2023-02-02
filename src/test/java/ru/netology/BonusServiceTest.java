package ru.netology;

import org.junit.jupiter.api.Test;
import ru.netology.unit.BonusService;

import static org.junit.jupiter.api.Assertions.*;

class BonusServiceTest {

    @Test
    void remainTest1() {
        BonusService service = new BonusService();
        int expected = 900;
        int amount = 100;

        int actual = service.remain(amount);

        assertEquals(expected, actual);
    }

    void remainTest2() {
        BonusService service = new BonusService();
        int expected = 500;
        int amount = 500;

        int actual = service.remain(amount);

        assertEquals(expected, actual);
    }

    void remainTest3() {
        BonusService service = new BonusService();
        int expected = 100;
        int amount = 900;

        int actual = service.remain(amount);

        assertEquals(expected, actual);
    }
    void remainTest4() {
        BonusService service = new BonusService();
        int expected = 1000;
        int amount = 0;

        int actual = service.remain(amount);

        assertEquals(expected, actual);
    }

}

