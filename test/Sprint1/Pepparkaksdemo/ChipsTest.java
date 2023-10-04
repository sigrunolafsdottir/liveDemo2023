package Sprint1.Pepparkaksdemo;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ChipsTest {

    Chips chips = new Chips();
    Chips saltyChips = new Chips(true);
    Chips notSaltyChips = new Chips(false);

    @Test
    void getSugarContent() {
        int expectedSugarContent = 0;
        int actualSugarContent = chips.getSugarContent();

        Assertions.assertEquals(expectedSugarContent, actualSugarContent);

    }

    @Test
    void getSaltyTest(){
        boolean expectedSalty = true;
        boolean expectedErrorValue = false;
        boolean actualSalty = chips.getSalty();

        Assertions.assertEquals(expectedSalty, actualSalty);
        Assertions.assertNotEquals(expectedErrorValue, actualSalty);

        boolean expectedSaltySetInContstructor = true;
        boolean actualSaltySetInContstructor = saltyChips.getSalty();

        Assertions.assertEquals(expectedSaltySetInContstructor, actualSaltySetInContstructor);

        boolean expectedNotSaltySetInContstructor = false;
        boolean actualNotSaltySetInContstructor = notSaltyChips.getSalty();

        Assertions.assertEquals(expectedNotSaltySetInContstructor, actualNotSaltySetInContstructor);

    }

    @Test
    void setSaltyTest(){
        boolean oldValue = true;
        boolean newValue = false;
        Chips testChips = new Chips(oldValue);

        testChips.setSalty(newValue);

        boolean expectedValue = newValue;
        boolean expectedErrorValue = oldValue;
        boolean actualValue = testChips.getSalty();

        Assertions.assertEquals(expectedValue, actualValue);
        Assertions.assertNotEquals(expectedErrorValue, actualValue);

    }
}