package Temperature;

public class Celsius {

    public double celsiusToFahrenheit(double celsius) {
        return (celsius * 9 / 5) + 32;
    }

    public double celsiusToKelvin(double celsius) {
        return celsius + 273.15;
    }

}