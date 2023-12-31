package Sprint1.Pepparkaksdemo;

public class Pepparkaka extends Godsak {

    private String form = "gris";
    protected boolean gräddad;

    protected boolean glaserad = false;

    public String demoString = "pepparkaka";

    public void glasera(){
        glaserad = true;
    }

    public boolean getGlaserad(){
        return glaserad;
    }

    public String whoAmI(){
        return "pepparkaka";
    }

    @Override
    public int getSugarContent() {
        return 50;
    }

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
