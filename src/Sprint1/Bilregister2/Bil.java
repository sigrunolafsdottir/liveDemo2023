package Sprint1.Bilregister2;

import Sprint1.Pepparkaksdemo.Pepparkaka;

public class Bil {

    private String renNr;
    private String märke;

    private String modell;

    private Bilägare ägare;

    public Bilägare getÄgare() {
        return ägare;
    }

    public void setÄgare(Bilägare ägare) {
        this.ägare = ägare;
    }

    public void såld(Bilägare nyeägaren) {
        this.ägare = nyeägaren;
    }


    public String getRenNr() {
        Bilägare bilis = new Bilägare();

        return renNr;

    }

    public void setRenNr(String renNr) {
        this.renNr = renNr;

    }

    public String getMärke() {
        return märke;
    }

    public void setMärke(String märke) {
        this.märke = märke;
    }

    public String getModell() {
        return modell;
    }

    public void setModell(String modell) {
        this.modell = modell;
    }

    public String käkaPepparkaka(){
        Pepparkaka p = new Pepparkaka();
        return p.getForm();
    }


}
