//There are 4 modifiers : public,private protected and default
class students{
    private int roll;
    private String name;

    void setname(String n){
        name=n;
    }
    String getname(){
        return name;
    }
    void setroll(int n){
        roll=n;
    }
    int getroll(){
        return roll;
    }
}

public class Modifiers{

    public static void main(String[] args){
            students s1= new students();
            s1.setname("muskan");
            s1.setroll(25);
            System.out.println(s1.getname());
            System.out.println(s1.getroll());
}
}