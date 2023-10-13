package Sprint2.uppg6LiveDistans;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ÖvnUppg6 {

    List<Integer> denominations = Arrays.asList(1000, 500, 200, 100, 50, 20, 10, 5, 2, 1);

    public int getChange(int price, int payed){
        return payed-price;
    }

    public int howManyOfACertainDenominationFitInChange(int denomination, int change){
        return change/denomination;
    }

    public List<Integer> doCalculation(int change){
        List<Integer> moneyBack = new ArrayList<>();

        for (int i = 0; i < denominations.size(); i++){
            int howMany = howManyOfACertainDenominationFitInChange(denominations.get(i), change);
            moneyBack.add(howMany);
            change = change - howMany*denominations.get(i);
        }
        return moneyBack;
    }


}
