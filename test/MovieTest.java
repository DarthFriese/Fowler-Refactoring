import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Alexander Friese on 30.04.2016.
 */
public class MovieTest {

    @Test
    public void getPriceCode() throws Exception {
        Movie myMovie = new Movie("Title",1);
        Assert.assertEquals(1,myMovie.getPriceCode());
    }

    @Test
    public void setPriceCode() throws Exception {
        Movie myMovie = new Movie("Title",1);
        myMovie.setPriceCode(2);
        Assert.assertEquals(2, myMovie.getPriceCode());
    }

    @Test
    public void getTitle() throws Exception {
        Movie myMovie = new Movie("Title",1);
        Assert.assertEquals("Title", myMovie.getTitle());
    }

}