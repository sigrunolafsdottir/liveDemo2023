package Sprint1.Bilregister;

public class Person {

    private String namn;
    private String adress;
    private int ålder;


    public String getNamn(){
        return namn;
    }

    public void setNamn(String namn) {
        this.namn = namn;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public int getÅlder() {
        return ålder;
    }

    public void setÅlder(int ålder) {
        this.ålder = ålder;
    }
}
