package Sprint2.Övnuppg8Distans;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ÖvnUppg8 {

    String path = "src/Sprint2/Övnuppg8Distans/temp.txt";

    public double findHighestTemp(List<Double> tempList){
        double highest = -Double.MAX_VALUE;
        for(int i = 0; i < tempList.size(); i++){
            if(tempList.get(i) > highest){
                highest = tempList.get(i);
            }
        }
        return highest;
    }

    public double findLowestTemp(List<Double> tempList){
        double lowest = Double.MAX_VALUE;
        for(int i = 0; i < tempList.size(); i++){
            if(tempList.get(i) < lowest){
                lowest = tempList.get(i);
            }
        }
        return lowest;
    }

    public double findAverageTemp(List<Double> tempList){
        double sum = 0;
        for(int i = 0; i < tempList.size(); i++){
            sum += tempList.get(i);
        }
        return sum/tempList.size();
    }

    public double parseStringToDouble(String s){
        //13,3 -> 13.3
        String temp = s.replace(',', '.');
        return Double.parseDouble(temp);
    }

    public List<Double> parseFileToList(String path){
        List<Double> temp = new ArrayList<>();
        String tempStr;
        try (BufferedReader buf = new BufferedReader(new FileReader(path))){

            while((tempStr = buf.readLine()) != null){
                temp.add(parseStringToDouble(tempStr));
            }

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        return temp;
    }

    public void runProgram(){
        List<Double> temp = parseFileToList(path);
        System.out.println(findHighestTemp(temp));
        System.out.println(findLowestTemp(temp));
        System.out.println(findAverageTemp(temp));
    }

    public static void main(String[] args) {
        ÖvnUppg8 öu = new ÖvnUppg8();
        öu.runProgram();
    }


}
