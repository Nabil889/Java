package exercise1;

public class Main{
    public static void main(String[] args){
    /*  Auto Auto1 = new Auto();
        Auto1.setMarke("VW");
        Auto1.setPs(150);
        Auto1.setPreis(25000.0);

        System.out.println("Hier ist ein Auto der Marke " + Auto1.getMarke() + " hat " + 
                            Auto1.getPs() + " und kostet " + Auto1.getPreis());



        Person p1 = new Person();
        p1.setName("Michael");
        p1.setAlter(42);
        p1.setEmail("Michael@gmail.com");

        System.out.println("Mein name ist " + p1.getName() + " ich bin " + p1.getAlter() + 
                            " und meine email adresse ist " + p1.getEmail());
    
        Buch Buch1 = new Buch();
        Buch1.setTitle("Java-Lernen");
        Buch1.setAuthor("Max Müller");
        Buch1.setSeitenanzahl(350);
        Buch1.setPreis(29.99);

        System.out.println("Buchname: " + Buch1.getTitle() + " Author: " + Buch1.getAuthor() + 
                            " Seitenanzahl: " + Buch1.getSeitenanzahl() + " Preis: " + Buch1.getPreis());
    */
        Handy handy1 = new Handy();
        handy1.setMarke("Samsung");
        handy1.setModell("Galaxy S23");
        handy1.setSpeicher(256);
        handy1.setPreis(899.99);

        System.out.println("Marke: " + handy1.getMarke() + 
                            " Modell: " + handy1.getModell() + 
                            " Speicher: " + handy1.getSpeicher() + " GB" + 
                            " Preis: " + handy1.getPreis() + " €");
    }
}