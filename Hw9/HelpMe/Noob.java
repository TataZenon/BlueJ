package HelpMe;
public class Noob
{
    public String name;
    public int level;
    public Noob(){
        name = ""; 
        level = 0;
    }
    public Noob(String a, int b){
        name = a;
        level = b;
    }
    public Noob(Noob n){
        name = n.name;
        level = n.level;
    }
    public static void findNoob(Noob n[], String s){
        System.out.println("!!Find noob name 'TazzaNeNon'!!");
        for(int i = 0 ; i < n.length ; i++){
            if(n[i].name.equals(s)){
                System.out.println("Name: "+n[i].name + " //Level: "+n[i].level);
            }
            else if(i == n.length -1){
                System.out.println("No noob");
                System.out.println("Default "+ s );
                n[i].level = 0 ;
            }
        }
    }
    public static void findGroupOfNoob(Noob[] n,int x){
        System.out.println("=====================");
        System.out.println("Find group of noob level 75");
        for(int i = 0; i < n.length; i++){
            if(n[i].level == x){
                System.out.println("Name: "+n[i].name+"//Level: "+n[i].level);
            }
        }
    }
}
