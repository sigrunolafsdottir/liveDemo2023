package Sprint4.TCPLiveSimpleDemo.LiveDemoBasicTCPpp.Bilregister.Server;

import java.util.ArrayList;
import java.util.List;


//Databassimulering
public class BilDAO {

    List<Bil> allaBilar = new ArrayList<>();

    public BilDAO (){
        Bil b1 = new Bil("ASD123", "blå", "Saab Combi");
        Bil b2 = new Bil("QWE123", "röd", "Toyota Corolla");
        Bil b3 = new Bil("ZXC123", "vit", "Saab 900");
        Bil b4 = new Bil("XCC123", "svart", "Volov 240");

        allaBilar.add(b1);
        allaBilar.add(b2);
        allaBilar.add(b3);
        allaBilar.add(b4);
    }

    public List<Bil> getAllCars(){
        return allaBilar;
    }

    public String searchCar(String regnr){
        for (int i = 0; i < allaBilar.size(); i++){
            if (allaBilar.get(i).getRegnr().equalsIgnoreCase(regnr)){
                return allaBilar.get(i).toString();
            }
        }
        return "";   //hittar inte bilen
    }


}
