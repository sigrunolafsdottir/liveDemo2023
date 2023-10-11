package Sprint2.Bilutskrift;

import Sprint1.BilregisterDistansDemo.Bil;

import javax.swing.*;
import java.sql.SQLOutput;
import java.util.Scanner;

public class BilUtskriftsprogrammet {

    Scanner sc = new Scanner(System.in);

    public double calculateMileageForAYear(double newMileage, double oldMileage){
        return newMileage-oldMileage;
    }

    public double calculateGasUsageInAverage(double mileage, double gasUsedUp){
        return gasUsedUp/mileage;
    }

    public String doPrintout(String prompt, Double parameter){
        return prompt+": "+parameter.toString();
    }

    public Double getParameterFromUser(String prompt){
        return Double.parseDouble(JOptionPane.showInputDialog(null, prompt));
    }

    public Double getParameterWithScanner(String prompt){

        System.out.println(prompt);
        Double d = -1.0;
        if (sc.hasNextDouble()){
            d = sc.nextDouble();
        }
        return d;
    }


    public static void main(String[] args) {
        //Indata till programmet ska vara dagens mätarställning,
        // mätarställningen för ett år sedan samt antal liter bensin som förbrukats under året.
        BilUtskriftsprogrammet bup = new BilUtskriftsprogrammet();
        //Double mileageToday = bup.getParameterFromUser("Dagens mätarställning: ");
        //Double mileageOneYearAgo = bup.getParameterFromUser("Mätarställning för ett år sen: ");
        //Double gasUsage = bup.getParameterFromUser("FÖrbrukad bensin under året: ");

        Double mileageToday = bup.getParameterWithScanner("Dagens mätarställning: ");
        Double mileageOneYearAgo = bup.getParameterWithScanner("Mätarställning för ett år sen: ");
        Double gasUsage = bup.getParameterWithScanner("FÖrbrukad bensin under året: ");

       // Antal körda mil: 1487.0
       // Antal liter bensin:  1235.4
       // Förbrukning per mil: 0.83

        double mileageThisYear = bup.calculateMileageForAYear(mileageToday, mileageOneYearAgo);
        double averageGasUsage = bup.calculateGasUsageInAverage(mileageThisYear, gasUsage);

        System.out.println(bup.doPrintout("Antal körda mil", mileageThisYear));
        System.out.println(bup.doPrintout("Antal liter bensin", gasUsage));
        System.out.println(bup.doPrintout("Förbrukning per mil", averageGasUsage));
    }

}
