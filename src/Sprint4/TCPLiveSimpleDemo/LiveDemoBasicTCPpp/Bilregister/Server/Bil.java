package Sprint4.TCPLiveSimpleDemo.LiveDemoBasicTCPpp.Bilregister.Server;

public class Bil {

    private String regnr;
    private String farg;
    private String modell;

    public Bil() {}

    public Bil(String regnr, String farg, String modell) {
        this.regnr = regnr;
        this.farg = farg;
        this.modell = modell;
    }

    public String getRegnr() {
        return regnr;
    }

    public void setRegnr(String regnr) {
        this.regnr = regnr;
    }

    public String getFarg() {
        return farg;
    }

    public void setFarg(String farg) {
        this.farg = farg;
    }

    public String getModell() {
        return modell;
    }

    public void setModell(String modell) {
        this.modell = modell;
    }

    @Override
    public String toString() {
        return "Bil{" +
                "regnr='" + regnr + '\'' +
                ", farg='" + farg + '\'' +
                ", modell='" + modell + '\'' +
                '}';
    }
}
