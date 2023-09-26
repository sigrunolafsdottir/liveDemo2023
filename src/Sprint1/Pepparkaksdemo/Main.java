package Sprint1.Pepparkaksdemo;

public class Main {

    Pepparkaka p1=new Pepparkaka();
    Pepparkaka p2=new Pepparkaka("gubbe", true);
    Pepparkaka p3=new Pepparkaka("gumma");

  //  Godsak g = new Godsak();   //fel pga Godsak abstract

    Godsak gPepparkaka = new Pepparkaka();
    Godsak gChips = new Chips();
    //Pepparkaka p5 = new Godsak();   //nej nej nej


    public static void main(String[] args) {
        Main m = new Main();
       // System.out.println(m.p1.getForm());
       // System.out.println(m.p2.getForm());
       // System.out.println(m.p3.getForm());

      //  System.out.println(m.p1.demoString);
      //  System.out.println(m.g.demoString);
      //  System.out.println(m.gPepparkaka.demoString);

        System.out.println(m.gPepparkaka.whoAmI());
        System.out.println(m.gChips.whoAmI());
        //System.out.println(m.g.whoAmI());

        System.out.println(m.gPepparkaka.getSugarContent());
        System.out.println(m.gChips.getSugarContent());

    }
}