package ru.netology;

import org.testng.annotations.Test;
import ru.netology.unit.BonusService;

import static org.testng.Assert.assertEquals;

public class BonusServiceTest {
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
        int expected = 1100;
        int amount = 0;

        int actual = service.remain(amount);

        assertEquals(expected, actual);
    }
}
