package Volume;

public class Liter {

    public double literToMilliliter(double liter) {
        return liter * 1000;
    }

    public double literToCubicMeter(double liter) {
        return liter / 1000;
    }

    public double literToCubicFoot(double liter) {
        return liter / 28.317;
    }

    public double literToCubicInch(double liter) {
        return liter * 61.024;
    }

}
