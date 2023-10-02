package Sprint1.BilregisterDistansDemo;

public class Bilägare extends Person {


    public Bilägare(String name, String ssn, int age) {
        super(name, ssn, age);
    }

    public Bilägare() {
    }

    @Override
    public void whoAmI(){
        System.out.println("Bilägare");
    }

    @Override
    public String gillarStoraBilar(){
        return "fr bilägare";
    }
}
