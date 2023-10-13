package Sprint2.uppg6LiveDistans;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ÖvnUppg6Test {

    int price = 45;
    int payed = 1000;
    ÖvnUppg6 ö = new ÖvnUppg6();
    List<Integer> expectedDenominations = Arrays.asList(1000, 500, 200, 100, 50, 20, 10, 5, 2, 1);

    @Test
    public void howMuchChange(){
        assertEquals(ö.getChange(price, payed), payed-price);
    }

    @Test
    public void testDenominations(){
        List<Integer> denominations = ö.denominations;

        assertEquals(denominations.size(), 10);
        for (int i = 0; i < denominations.size(); i++){
            assertEquals(denominations.get(i), expectedDenominations.get(i));
        }
    }

    @Test
    public void howManyOfACertainDenominationFitINChange(){
        int denomination = 100;
        int change = 234;
        assertEquals(ö.howManyOfACertainDenominationFitInChange(denomination, change), 2);
    }

    @Test
    public void doCalculation(){

        //int denomination = 100;
        int change = 234;
        List<Integer> expectedResult = Arrays.asList(0, 0, 1, 0, 0, 1, 1, 0, 2, 0);
        List<Integer> actualResult = ö.doCalculation(change);

        assertEquals(expectedResult.size(), actualResult.size());
        for (int i = 0; i < actualResult.size(); i++){
            assertEquals(actualResult.get(i), expectedResult.get(i));
        }
    }


}