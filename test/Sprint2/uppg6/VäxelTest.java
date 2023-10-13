package Sprint2.uppg6;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class VäxelTest {

    int price=235;
    int payed= 1034;
    Växel v = new Växel();

    @Test
    public void getChange(){
        int expected = payed-price;
        int actual = v.getChange(payed, price);
        assertEquals(expected, actual);
    }

    @Test
    public void checkDenominations(){
        List<Integer> expectedDenimonations = Arrays.asList(1000, 500, 200, 100, 50, 20, 10, 5, 2, 1);
        List<Integer> actualDenimonations = v.denimonations;
        assertEquals(expectedDenimonations.size(), actualDenimonations.size());
        for (int i = 0; i < expectedDenimonations.size(); i++){
            assertEquals(expectedDenimonations.get(i), actualDenimonations.get(i));
        }
    }

    @Test
    public void howManyUnitsOfDenomination(){
        int denomination = 1000;
        int change1 = 1034;
        int change2 = 5034;
        int change3 = 34;

        assertEquals(1, v.howManyUnitsOfDenomination(denomination, change1));
        assertEquals(5, v.howManyUnitsOfDenomination(denomination, change2));
        assertEquals(0, v.howManyUnitsOfDenomination(denomination, change3));
    }

    @Test
    public void removeAccountedMoney(){
        int denomination1 = 1000;
        int change1 = 1034;
        int change2 = 5034;
        int change3 = 34;

        assertEquals(34, v.removeAccountedMoney(denomination1, change1));
        assertEquals(34, v.removeAccountedMoney(denomination1, change2));
        assertEquals(34, v.removeAccountedMoney(denomination1, change3));
    }

    @Test
    public void getChangeList(){

      //  int price=235;
      //  int payed= 1034;
        //change 799
        List<Integer> expected = Arrays.asList(0, 1, 1, 0, 1, 2, 0, 1, 2, 0);
        List<Integer> actual = v.getChangeList(price, payed);
        System.out.println(actual);

        assertEquals(expected.size(), actual.size());
        for (int i = 0; i < expected.size(); i++){
            System.out.println(expected.get(i)+" "+actual.get(i));
            assertEquals(expected.get(i), actual.get(i));
        }
    }

}