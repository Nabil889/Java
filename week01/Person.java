public class Person{
    private String vorname = "Tobias";
    private String name = "Meier";
    private int alter = 37;

    public void setVorname (String vorname){
        this.vorname = vorname;
    }
     
    public void setName (String name){
        this.name = name;
    }

    public void setAlter (int alter){
        this.alter = alter;
    }

    public String getVorname(){
        return vorname;
    }

    public String getName(){
        return name;
    }

    public int getAlter(){
        return alter;
    }
}