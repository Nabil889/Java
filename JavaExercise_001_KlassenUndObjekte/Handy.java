public class Handy{
    private String marke;
    private String modell;
    private int speicher;
    private double preis;

    public void setMarke(String marke){
        this.marke = marke;
    }
    public void setModell(String modell){
        this.modell = modell;
    }
    public void setSpeicher(int speicher){
        this.speicher = speicher;
    }
    public void setPreis(double preis){
        this.preis = preis;
    }
    public String getMarke(){
        return marke;
    }
    public String getModell(){
        return modell;
    }
    public int getSpeicher(){
        return speicher;
    }
    public double getPreis(){
        return preis;
    }
}