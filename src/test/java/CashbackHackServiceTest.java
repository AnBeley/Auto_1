import org.testng.annotations.Test;
import ru.netology.CashbackHackService;

import static org.testng.AssertJUnit.assertEquals;

public class CashbackHackServiceTest {

    @Test
    public void shouldReturnRemainValue0() {
        CashbackHackService service = new CashbackHackService();
        int amount = 1000;
        int actual = service.remain(amount);
        int expected = 0;
        assertEquals(actual, expected);
    }

    @Test
    public void shouldReturnRemainValue766() {
        CashbackHackService service = new CashbackHackService();
        int amount = 1234;
        int actual = service.remain(amount);
        int expected = 766;
        assertEquals(actual, expected);
    }

    @Test
    public void shouldReturnRemainValue999() {
        CashbackHackService service = new CashbackHackService();
        int amount = 1;
        int actual = service.remain(amount);
        int expected = 999;
        assertEquals(actual, expected);
    }

    @Test
    public void shouldReturnRemainValue1000() {
        CashbackHackService service = new CashbackHackService();
        int amount = 0;
        int actual = service.remain(amount);
        int expected = 1000;
        assertEquals(actual, expected);
    }

    @Test
    public void shouldReturnRemainValue1123() {
        CashbackHackService service = new CashbackHackService();
        int amount = -123;
        int actual = service.remain(amount);
        int expected = 1123;
        assertEquals(actual, expected);
    }
}
