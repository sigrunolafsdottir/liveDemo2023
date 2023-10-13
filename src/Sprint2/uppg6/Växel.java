package Sprint2.uppg6;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Växel {

    List<Integer> denimonations = Arrays.asList(1000, 500, 200, 100, 50, 20, 10, 5, 2, 1);

    //skriver in pris
    //skriver in totalbelopp

    public int getChange(int payed, int price){
        return payed-price;
    }

    public int howManyUnitsOfDenomination(int denomination, int change){
        return change/denomination;
    }

    public int removeAccountedMoney(int denomination, int change){
        return change - howManyUnitsOfDenomination(denomination, change)*denomination;
    }

    public List<Integer> getChangeList(int price, int payed){
        int change = getChange(payed, price);
        List<Integer> res = new ArrayList<>();
        for (int i = 0; i < denimonations.size(); i++){
            System.out.println(howManyUnitsOfDenomination(denimonations.get(i), change));
            res.add(howManyUnitsOfDenomination(denimonations.get(i), change));
            change = removeAccountedMoney(denimonations.get(i), change);
        }
        return res;
    }
}
