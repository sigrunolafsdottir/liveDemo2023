package Sprint2.Bilutskrift;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BilUtskriftsprogrammetTest {

    BilUtskriftsprogrammet bup;

    @BeforeEach
    void setUp() {
        bup = new BilUtskriftsprogrammet();
    }


    @Test
    public void calculateMileageForAYear(){
        double oldMileage = 500.0;
        double newMileage = 2000.0;
        double actualVal = bup.calculateMileageForAYear(newMileage, oldMileage);
        double expectedVal = newMileage-oldMileage;

        assertEquals(actualVal, expectedVal, 0.00001);

    }

    @Test
    public void calculateGasUsageInAverage(){
        double mileage = 1500.0;
        double gasUsedUp = 5000.0;
        double actualVal = bup.calculateGasUsageInAverage(mileage, gasUsedUp);
        double expectedVal = gasUsedUp/mileage;   //3.33333333

        assertEquals(actualVal, expectedVal, 0.00001);

    }

    @Test
    public void doPrintOut(){
        Double parameter = 1500.0;
        String prompt = "Antal körda mil";
        String actualVal = bup.doPrintout(prompt, parameter);
        String expectedVal = prompt+": "+parameter.toString();   //3.33333333

        assertEquals(actualVal, expectedVal);

    }


}