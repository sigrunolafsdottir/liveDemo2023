package Sprint1.BilregisterDistansDemo;

public class Körkortskontrollant  extends Person {


    public Körkortskontrollant(String name, String ssn, int age) {
        super(name, ssn, age);
    }

    public Körkortskontrollant() {
    }

    @Override
    public void whoAmI(){
        System.out.println("Körkortskontrollant");
    }

    @Override
    public String gillarStoraBilar(){
        return "fr körkortskontrollanten";
    }
}
