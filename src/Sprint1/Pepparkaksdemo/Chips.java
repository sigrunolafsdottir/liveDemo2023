package Sprint1.Pepparkaksdemo;

public class Chips extends Godsak{

    private boolean salty = true;

    public Chips(boolean salty){
        this.salty=salty;
    }

    public Chips(){}

    public boolean getSalty(){
        return this.salty;
    }

    public void setSalty(boolean salty){
        this.salty=salty;
    }

/*
    public String whoAmI(){
        return "chips";
    }

 */

    @Override
    public int getSugarContent() {
        return 0;
    }
}
