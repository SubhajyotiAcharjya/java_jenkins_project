public class TemperatureConverter {

    // Celsius to Fahrenheit
    static void celsiusToFahrenheit(double celsius) {
        double fahrenheit = (celsius * 9/5) + 32;
        System.out.println(celsius + "°C is equal to " + fahrenheit + "°F");
    }

    // Celsius to Kelvin
    static void celsiusToKelvin(double celsius) {
        double kelvin = celsius + 273.15;
        System.out.println(celsius + "°C is equal to " + kelvin + "K");
    }

    // Fahrenheit to Celsius
    static void fahrenheitToCelsius(double fahrenheit) {
        double celsius = (fahrenheit - 32) * 5/9;
        System.out.println(fahrenheit + "°F is equal to " + celsius + "°C");
    }

    // Fahrenheit to Kelvin
    static void fahrenheitToKelvin(double fahrenheit) {
        double kelvin = (fahrenheit - 32) * 5/9 + 273.15;
        System.out.println(fahrenheit + "°F is equal to " + kelvin + "K");
    }

    // Kelvin to Celsius
    static void kelvinToCelsius(double kelvin) {
        double celsius = kelvin - 273.15;
        System.out.println(kelvin + "K is equal to " + celsius + "°C");
    }

    // Kelvin to Fahrenheit
    static void kelvinToFahrenheit(double kelvin) {
        double fahrenheit = (kelvin - 273.15) * 9/5 + 32;
        System.out.println(kelvin + "K is equal to " + fahrenheit + "°F");
    }

    // Main method
    public static void main(String[] args) {
        double tempInCelsius = 25.0;
        double tempInFahrenheit = 77.0;
        double tempInKelvin = 300.0;

        celsiusToFahrenheit(tempInCelsius);
        celsiusToKelvin(tempInCelsius);
        fahrenheitToCelsius(tempInFahrenheit);
        fahrenheitToKelvin(tempInFahrenheit);
        kelvinToCelsius(tempInKelvin);
        kelvinToFahrenheit(tempInKelvin);
    }
}
