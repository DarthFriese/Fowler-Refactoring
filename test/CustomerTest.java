import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Alexander Friese on 30.04.2016.
 */
public class CustomerTest {
    @Test
    public void addRental() throws Exception {
        Customer myCustomer = new Customer("Customer Name");
        Movie myMovie = new Movie("Movie Title",1);
        Rental myRental = new Rental(myMovie,1);
        myCustomer.addRental(myRental);
    }

    @Test
    public void getName() throws Exception {
        Customer myCustomer = new Customer("Customer Name");
        Assert.assertEquals("Customer Name", myCustomer.getName());
    }

    @Test
    public void statement() throws Exception {

    }

}