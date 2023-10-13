package Sprint2.Övnuppg8Distans;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ÖvnUppg8Test {

    List<Double> tempList = Arrays.asList(3.5, 2.5, 3.0, 1.0, 5.0);
    ÖvnUppg8 öu = new ÖvnUppg8();

    @Test
    public void findHighestTemp(){
        assertEquals(öu.findHighestTemp(tempList), 5.0);
    }

    @Test
    public void findLowestTemp(){
        assertEquals(öu.findLowestTemp(tempList), 1.0);
    }

    @Test
    public void findAverageTemp(){
        assertEquals(öu.findAverageTemp(tempList), 3.0);
    }

    @Test
    public void parseStringToDouble(){
        String s1 = "13,3";
        assertEquals(öu.parseStringToDouble(s1), 13.3);
    }

    @Test
    public void parseFileToList(){
        //inparameter: pathen till min fil
        //utdata, en lista av doubles
        //13,3
        //14,5
        //17,5
        String path = "test/Sprint2/Övnuppg8Distans/temp.txt";
        List<Double> actualTestList = öu.parseFileToList(path);

        assertEquals(actualTestList.size(), 30);
        assertEquals(actualTestList.get(0), 13.3);
        assertEquals(actualTestList.get(1), 14.5);
        assertEquals(actualTestList.get(2), 17.5);
    }

}