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
class Employee extends TeamLeader{
    String name;
    void details(){
        System.out.println("Name: "+name);
    }
}
public class MultilevelInheritance{
    public static void main(String args[]){
    Employee ob=new Employee();
    ob.name="Jake";
    ob.dept="software";
    ob.teamSize=5;
    ob.managingDept();
    ob.leadteam();
    ob.details();
    
    }
    
}
