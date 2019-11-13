import java.util.Scanner;
public class HW1K3{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Celcius : ");
        double cel = sc.nextDouble();
        System.out.println("Kelvin : " + (cel + 273.15));
        System.out.println("Fahrenheit : " + ((1.8*cel) + 32) );
    }
}