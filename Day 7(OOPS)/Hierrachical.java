class Manager{
    String dept;
    void managingDept(){
        System.out.println("Dept: "+dept);
    }
}
class TeamLeader extends Manager{
    int teamSize;
    void leadteam(){
        System.out.println("Lead team of: "+teamSize);
    }
}
class Employee extends Manager{
    String name;
    void details(){
        System.out.println("Name: "+name);
    }
}
public class Hierrachical {
    public static void main(String args[]){
    TeamLeader tl=new TeamLeader();
    Employee ob=new Employee();
    ob.name="Jake";
    ob.dept="software";
    tl.teamSize=5;
    ob.managingDept();
    tl.leadteam();
    ob.details();
    
    }
    
}
