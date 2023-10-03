package Sprint1.EnumDemo;

import java.time.Month;

public class Huvudprogram {

    public static void main(String[] args) {

        for (RomerskaSiffror r : RomerskaSiffror.values()){
            System.out.println(r + " "+r.numericVal+" "+r.stringVal);
        }

        Month m = Month.JANUARY;

    }
}
