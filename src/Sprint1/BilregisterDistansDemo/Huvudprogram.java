package Sprint1.BilregisterDistansDemo;

public class Huvudprogram {

    Bil b = new Bil("qwe123", "saab", "99");
    Bil b2 = new Bil();

    BilRecord br = new BilRecord("rty456", "Volvo", "740");

    public static void main(String[] args) {

        Huvudprogram h = new Huvudprogram();

        System.out.println(h.b.getRegnr());

        h.b.setModell("900");
        System.out.println(h.b.getModell());

        System.out.println(h.br.modell());

        Bilägare bengt = new Bilägare();

        bengt.whoAmI();

        Person p = new Bilägare();
        Person p2 = new Körkortskontrollant();
        Person p3 = new Lastbilschaufför();
        p.whoAmI();
        p2.whoAmI();
        p3.whoAmI();

        System.out.println(p.gillarStoraBilar());
        System.out.println(p2.gillarStoraBilar());
        System.out.println(p3.gillarStoraBilar());



    }


}
