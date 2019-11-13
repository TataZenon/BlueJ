/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
 

/**
 *
 * @author Pc
 */
import java.util.Scanner;
public class MainGreeting {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Charrac obj = new Charrac();
        System.out.println ("Welcome to the world of Pet");
        System.out.println ("In this world we not spend much time to phone");
        System.out.println ("So you shouldn't spend time with your phone too much and let your Pet healthy");
        System.out.println ("=============================");
        System.out.println ("So....What your name?");
        obj.setName(sc.next());
        System.out.println ("=============================");
        System.out.println ("So you're "+ obj.getName());
        System.out.println ("Choose your pet wisely and don't forget to adjust the time.");
        System.out.println ("=============================");
        System.out.println ("What's your pet's name?");
        obj.setPname(sc.next());
        System.out.println ("Your pet name is " +obj.getpName());
        System.out.println ("last but not least, Choose you pet's Gender.");
        System.out.println ("=============================");
        System.out.println ("And finally, set your time please");
        //time
        System.out.println ("=============================");
        System.out.println ("Well, I hope you'll spend time with your phone less than now, Please enjoy!");
    }
    
}
