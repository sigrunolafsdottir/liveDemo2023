package Sprint1.BilregisterDistansDemo;

public class Lastbilschaufför extends Person {


    public Lastbilschaufför(String name, String ssn, int age) {
        super(name, ssn, age);
    }

    public Lastbilschaufför() {
    }

    @Override
    public void whoAmI(){
        System.out.println("Lastbilschaufför");
    }


    @Override
    public String gillarStoraBilar(){
        return "fr lastbilschauffören";
    }

}
