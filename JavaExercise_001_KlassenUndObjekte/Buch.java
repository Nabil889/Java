public class Buch{
    private String title;
    private String author;
    private int seitenanzahl;
    private double preis;

    public void setTitle(String title){
        this.title = title;
    }
    public void setAuthor(String author){
        this.author = author;
    }
    public void setSeitenanzahl(int seitenanzahl){
        this.seitenanzahl = seitenanzahl;
    }
    public void setPreis(double preis){
        this.preis = preis;
    }
    public String getTitle(){
        return title;
    }
    public String getAuthor(){
        return author;
    }
    public int getSeitenanzahl(){
        return seitenanzahl;
    }
    public double getPreis(){
        return preis;
    }
}