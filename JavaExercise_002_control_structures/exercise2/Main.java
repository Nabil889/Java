package exercise2;

public class Main{
    public static void main(String[] args){
        Auto a1 = new Auto();
        a1.setMarke("BMW");
        a1.setGeschwindigkeit(130);

        if(a1.getGeschwindigkeit() > 120){
            System.out.println("Du hast einen " + a1.getMarke() + " mit " + a1.getGeschwindigkeit() + 
                                " PS und fährst zu schnell");
        } else {
            System.out.println("Du hast einen " + a1.getMarke() + " mit " + a1.getGeschwindigkeit() + 
                                " PS und fährst ganz ok");
        };
    }
}