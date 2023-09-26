package Sprint1.Pepparkaksdemo;

public class Pepparkaka {

    private String form = "gris";
    private boolean gräddad;

    public Pepparkaka(String fr, boolean gr){
        form=fr;
        gräddad=gr;
    }

    public Pepparkaka(){}

    public Pepparkaka(String form) {
        this.form=form;
    }

    public String getForm(){
        return form;
    }

    public void setForm(String fr){
        form=fr;
    }

    public void setGraddad(boolean gr){
        gräddad=gr;
    }

}
