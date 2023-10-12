package Sprint2.uppg8LivePP;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Temperaturer {

    //List<Double> temps = new ArrayList<>();

    public double findHighest(List<Double> tempList){
        double res = -Double.MAX_VALUE;
        for(int i = 0; i < tempList.size(); i++){
            if (tempList.get(i) > res) res = tempList.get(i);
        }
        return res;
    }

    public double findLowest(List<Double> tempList){
        double res = Double.MAX_VALUE;
        for(int i = 0; i < tempList.size(); i++){
            if (tempList.get(i) < res) res = tempList.get(i);
        }
        return res;
    }

    public double findAverage(List<Double> tempList){
        double sum = 0;
        for(int i = 0; i < tempList.size(); i++){
            sum += tempList.get(i);
        }
        return sum/tempList.size();
    }

    public double parseData(String data) {
        return Double.parseDouble(data.replace(',', '.'));
    }

    public List<Double> createList(String file){

        String temp;
        List<Double> temps = new ArrayList<>();
        try(BufferedReader b = new BufferedReader(new FileReader(file))) {
            while ((temp =b.readLine()) != null){
                temps.add(parseData(temp));
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
            //throw new RuntimeException(e);
        } catch (IOException e) {
            e.printStackTrace();
            //throw new RuntimeException(e);
        }
        return temps;
    }



    public static void main(String[] args) {
        Temperaturer t = new Temperaturer();
        List<Double> d = t.createList("src/Sprint2/uppg8LivePP/temp.txt");
        System.out.println(t.findHighest(d));
        System.out.println(t.findLowest(d));
        System.out.println(t.findAverage(d));
    }


}
