import java.util.Scanner;

public class SimpleTemperatureConverter {

    
    public static double cToF(double celsius) {
        return (celsius * 9/5) + 32;
    }

    
    public static double cToK(double celsius) {
        return celsius + 273.15;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Enter temperature in Celsius: ");
        double celsius = scanner.nextDouble();

        
        double fahrenheit = cToF(celsius);
        double kelvin = cToK(celsius);

        
        System.out.println("Temperature in Farhenheit is :"+fahrenheit);
        System.out.println("Temperature in Kelvin is :"+kelvin);

        scanner.close();
    }
}
