package Volume;

public class CubicMeter {

    public double cubicMeterToLiter(double cubicMeter) {
        return cubicMeter * 1000;
    }

    public double cubicMeterToCubicFoot(double cubicMeter) {
        return cubicMeter * 35.315;
    }

    public double cubicMeterToUsLiquidGallon(double cubicMeter) {
        return cubicMeter * 264.2;
    }

    public double cubicMeterToCubicInch(double cubicMeter) {
        return cubicMeter * 61020;
    }

}
