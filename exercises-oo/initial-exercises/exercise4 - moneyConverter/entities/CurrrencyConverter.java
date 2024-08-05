package entities;

public class CurrrencyConverter {

    public final double dollar = 5.60;
    public double dBuy;

    public double realConverter() {
        return dBuy * dollar;
    }

    public double finalValor() {
        return realConverter() + (realConverter() * 0.06);
    }
}
