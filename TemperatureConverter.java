import java.util.*;

public class TemperatureConverter 
{
    // Method to convert Fahrenheit to Celsius
    public static double fahrenheitToCelsius(double fahrenheit) 
    {
        return (fahrenheit - 32) / 1.8;
    }

    // Method to convert Celsius to Fahrenheit
    public static double celsiusToFahrenheit(double celsius) {
        return (celsius * 1.8) + 32;
    }

    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Temperature Converter");
        System.out.println("1. Convert Fahrenheit to Celsius");
        System.out.println("2. Convert Celsius to Fahrenheit");
        System.out.print("Choose an option (1 or 2): ");
        int option = sc.nextInt();

        double temperature;
        double convertedTemperature;

        switch (option) {
            case 1:
                System.out.print("Enter temperature in Fahrenheit: ");
                temperature = sc.nextDouble();
                convertedTemperature = fahrenheitToCelsius(temperature);
                System.out.println(temperature + " Fahrenheit is " + convertedTemperature + " Celsius");
                break;
            case 2:
                System.out.print("Enter temperature in Celsius: ");
                temperature = sc.nextDouble();
                convertedTemperature = celsiusToFahrenheit(temperature);
                System.out.println(temperature  + " Celsius is " + convertedTemperature + " Fahrenheit");
                break;
            default:
                System.out.println("Invalid option selected.");
        }
    }
}
