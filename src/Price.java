/**
 * Created by Alexander Friese on 01.05.2016.
 */
public abstract class Price {
    abstract int getPriceCode();

    public abstract double getCharge(int daysRented);

    public int getFrequentRenterPoints(int daysRented) {
        return 1;
    }
}
