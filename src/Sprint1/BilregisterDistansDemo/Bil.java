package Sprint1.BilregisterDistansDemo;


import lombok.Data;

@Data
public class Bil {

    private String regnr;
    private String märke;
    private String modell;

    private Bilägare ägare;

    public Bil(String regnr, String märke, String modell, Bilägare ägare) {
        this.regnr = regnr;
        this.märke = märke;
        this.modell = modell;
        this.ägare = ägare;
    }

    public Bil(String regnr, String märke, String modell){
        this.regnr=regnr;
        this.märke=märke;
        this.modell=modell;
    }

    public Bil(){}

    public void såld(Bilägare nyeägaren){
        ägare=nyeägaren;
    }

}
