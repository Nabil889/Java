public class Main{
    public static void main(String[] args){
        Auto Auto1 = new Auto();
        Auto1.setMarke("VW");
        Auto1.setPs(150);
        Auto1.setPreis(25000.0);

        System.out.println("Hier ist ein Auto der Marke " + Auto1.getMarke() + " hat " + 
                            Auto1.getPs() + " und kostet " + Auto1.getPreis());
    }
}