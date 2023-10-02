package Sprint1.Frågedemo;

import javax.swing.tree.AbstractLayoutCache;
import java.util.ArrayList;
import java.util.List;

public class FrågeDemoKlass {

    String name = "olle";
    List<String> listan = new ArrayList<>();
    //listan.add("hej"); nej, vi kan inte anropa metoder utanför funktionerna

    public FrågeDemoKlass(){
        System.out.println(name);
        listan.add("hej");
        //konstruktor, anropas när new körs
        //bra att lägga main-koden här, för att komma ut ur den statiska kontexten

        //fylla på lista




    }

    public static void main(String[] args) {
          //String namn = JOptionPane bla bla bla, tar in ett namn
        //så här ska man INTE göra, detta är hårdkodning
        //if (namn.equals("Olof")) bla bla bla
        //else if(namn.equals("igge"))   bla bla bla


        //nästa fråga besvaras
        FrågeDemoKlass fk = new FrågeDemoKlass();
        //System.out.println(name);  //aj aj kommer inte åt name pga static
        System.out.println(fk.name);
    }
}
