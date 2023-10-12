package Sprint2.uppg8LivePP;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class TemperaturerTest {

    List<Double> tempList= Arrays.asList(2.5, 3.5, 4.0, 5.0, 2.0, 1.0);
    Temperaturer t=new Temperaturer();


    @Test
    public void findHighestTest(){
        double expected = 5.0;
        double actual = t.findHighest(tempList);

        assertEquals(expected, actual);
    }

    @Test
    public void findLowestest(){
        double expected = 1.0;
        double actual = t.findLowest(tempList);

        assertEquals(expected, actual);
    }

    @Test
    public void findAverage(){
        double expected = 3.0;
        double actual = t.findAverage(tempList);

        assertEquals(expected, actual, 0.000001);
    }

    @Test
    public void parseDataTest(){
        String data = "23,4";
        double expected = 23.4;
        double actual = t.parseData(data);

        assertEquals(expected, actual, 0.000001);
    }

    @Test
    public void readFromFileCreateList(){

        String file = "test/Sprint2/uppg8LivePP/temp.txt";
        List<Double> tempList= Arrays.asList(13.3, 14.5, 17.5, 12.8, 11.0);

        List<Double> actual = t.createList(file);

        assertEquals(tempList.size(), actual.size());
        for(int i = 0; i < actual.size(); i++){
            assertEquals(tempList.get(i), actual.get(i));
        }
    }


}