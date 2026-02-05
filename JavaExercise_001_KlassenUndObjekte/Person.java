public class Person{
    private String name;
    private int alter;
    private String email;

    public void setName(String name){
        this.name = name;
    }
    public void setAlter(int alter){
        this.alter = alter;
    }
    public void setEmail(String email){
        this.email = email;
    }
    public String getName(){
        return name;
    }
    public int getAlter(){
        return alter;
    }
    public String getEmail(){
        return email;
    }
}