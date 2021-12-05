package ibf2021.d1;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue()
    {
        Cart cart = new Cart();
        cart.addItems("Apple");
        assertTrue(cart.getItem(1).equals("Apple"));
    }
}
