package Omigosh;

public class Motorcycle implements Vehicle {
    protected int wheel;
    protected int seat;
    protected String engine;
    protected double fuel;
    protected double speed;
    public Motorcycle(int wh, int se, String en, double fu, double sp){
        this.wheel = wh; 
        this.seat = se; 
        this.engine = en; 
        this.fuel = fu; 
        this.speed = sp;
    }
    public Motorcycle(Motorcycle m){
        this.wheel = m.wheel; 
        this.seat = m.seat; 
        this.engine = m.engine; 
        this.fuel = m.fuel; 
        this.speed = m.speed;
    }
    public int getWheel(){
        return this.wheel;
    }
    public int getSeat(){
        return this.seat;
    }
    public String getEngine(){
        return this.engine;
    }
    public double getFuel(){
        return this.fuel;
    }
    public void addFuel(double f){
        if(this.fuel + f > 50)
        this.fuel = 50;
        else
        this.fuel += f;
    }
    public double getSpeed(){
        return this.speed;
    }
    public void upSpeed(double x){
        for(int i = 0; i < x ; i++){
            if(this.speed == 140){
                System.out.println("And have reach maximum speed. (140 km/hr)");
            }
            else{
                this.speed++;
            }
        }
    }
    public void downSpeed(double x){
        for(int i = 0; i < x ; i++){
            if(this.speed == 0){
                System.out.println("And have reach minimum speed. (0 km/hr)");
            }
            else{
                this.speed--;
            }
        }
    }
    public void breaK(double x){
        while(this.speed != -1){
            if(this.speed == 0){
                System.out.println("Motorcycle was stopped.");
            }
            else{
                downSpeed(x);
                System.out.println("Speed: " + getSpeed() + " km/hr");
            }
        }
    }
}