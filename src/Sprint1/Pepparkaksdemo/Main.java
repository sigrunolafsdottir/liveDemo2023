package Sprint1.Pepparkaksdemo;

public class Main {


    public static void main(String[] args) {

        Pepparkaka p1=new Pepparkaka();

        Pepparkaka p2=new Pepparkaka("gubbe", true);

        Pepparkaka p3=new Pepparkaka("gumma");

        System.out.println(p1.getForm());
        System.out.println(p2.getForm());
        System.out.println(p3.getForm());
    }
}