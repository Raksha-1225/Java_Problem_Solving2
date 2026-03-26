class Vehicle{
    String brand;
    String model;
    int year;
    Vehicle(String brand,String model,int year){
        this.brand=brand;
        this.model=model;
        this.year=year;
    }
    void display(){
        System.out.print("Brand:"+brand+" Model:"+model+" Year:"+year);
    
    }

}
class Car extends Vehicle{
    int doors;
    int fuelEff;
    Car(String b,String m,int y,int doors,int fuelEff){
        super(b,m,y);
        this.doors=doors;
        this.fuelEff=fuelEff;
    }
    void display(){
        super.display();
        System.out.print(" Doors:"+doors+" Fuel Efficiency:"+fuelEff);
        System.out.println();
    }

}
class Truck extends Vehicle{
    int loadCapacity;
    Truck(String b,String m,int y,int loadCapacity){
        super(b,m,y);
        this.loadCapacity=loadCapacity;
    }
    void display(){
        super.display();
        System.out.print(" LoadCapacity: "+loadCapacity);
        System.out.println();
    }

}
class Bike extends Vehicle{
    String type;
    Bike(String b,String m,int y,String type){
        super(b,m,y);
        this.type=type;
    }
    void display(){
        super.display();
        System.out.print(" Type:"+type);
        System.out.println();
    }

}
public class TransportCompany {
    public static void main(String args[]){
        Car c=new Car("Maruthi","112",2020,4,16);
        Truck t=new Truck("Mahentra","312",2021,20);
        Bike b=new Bike("Royal Enfield","32",2025,"common");
        c.display();
        t.display();
        b.display();
    }
    
}
