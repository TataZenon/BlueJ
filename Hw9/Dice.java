public class Dice{
    private int face;
    private int value;
    
    public Dice(){
        this.face = 6;
        this.value = 1;
    }
    public Dice(int f){
        this.face = f;
        this.value = 1;
    }
    public Dice(int f, int v){
        this.face = f;
        this.value = v;
    }
    public void roll(){
        int rollv = 1 + (int)(Math.random() * this.face);
        this.value = rollv;
    }
    public void setValue(int v){
        this.value = v;
    }
    public int getFace(){
        return this.face;
    }
    public int getValue(){
        return this.value;
    }
}
