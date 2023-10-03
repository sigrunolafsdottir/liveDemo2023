package Sprint1.EnumDemo;

public enum RomerskaSiffror {
    I(1, "ett"), V(5, "fem"), X(10, "tio"), C(100, "hundra"),
    M(1000, "tusen"), L(50, "femtio");

    public int numericVal;
    public String stringVal;

    private RomerskaSiffror(int i, String s){
        numericVal=i;
        stringVal=s;
    }

}
