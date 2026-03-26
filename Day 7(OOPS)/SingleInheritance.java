
class Manager{
    String dept;
    void managingDept(){
        System.out.println("dept"+dept);
    }
}
class TeamLeader extends Manager{
    int teamSize;
    void leadteam(){
        System.out.println("lead team of:"+teamSize);
    }
}
public class SingleInheritance {
    public static void main(String args[]){
    TeamLeader ob=new TeamLeader();
    ob.dept="software";
    ob.teamSize=5;
    ob.managingDept();
    ob.leadteam();
    
    }
    
}
