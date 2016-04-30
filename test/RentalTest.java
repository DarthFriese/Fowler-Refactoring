import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Alexander Friese on 30.04.2016.
 */
public class RentalTest {


    @Test
    public void getDaysRented() throws Exception {
        Movie myMovie = new Movie("Title",1);
        Rental myRental = new Rental(myMovie,2);
        Assert.assertEquals(2, myRental.getDaysRented());
    }

    @Test
    public void getMovie() throws Exception {
        Movie myMovie = new Movie("Title",1);
        Rental myRental = new Rental(myMovie,2);
        Assert.assertEquals(myMovie,myRental.getMovie());
    }

}