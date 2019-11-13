import java.util.Scanner;
public class HW4
{
   public static void main(String arg[]){
       Scanner sc = new Scanner(System.in);
       int n[] = new int[7];
       int sum = 0;
       System.out.println("number : ");
       for(int i=0;i<7;i++){
           n[i] = sc.nextInt();
           sum =n[i];
        }
       System.out.println("Average number : " + sum/7); 
    }
}