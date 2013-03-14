/**
 * Created with IntelliJ IDEA.
 * User: Administrator
 * Date: 14/03/13
 * Time: 08:48
 * To change this template use File | Settings | File Templates.
 */

import junit.framework.TestCase;


public class CartTest extends TestCase {
    private Cart cart;

    public void setUp() throws Exception {
            cart=new Cart();
    }

    public void testTwoForThePriceOfOne() {
        cart.addItem(new ShopItem("Teddy Bear", 23.0));
        cart.addItem(new ShopItem("Teddy Bear", 23.0));
        assertEquals(cart.getPrice(), 23.0, 0.001);
    }

    public void testPriceOfDistinct() {
        cart.addItem(new ShopItem("Teddy Bear", 23.0));
        cart.addItem(new ShopItem("Train Set", 49.99));
        assertEquals(cart.getPrice(), 72.99, 0.001);
    }

    public void testThreeItems() {
        cart.addItem(new ShopItem("Teddy Bear", 23.0));
        cart.addItem(new ShopItem("Teddy Bear", 23.0));
        cart.addItem(new ShopItem("Teddy Bear", 23.0));
        cart.addItem(new ShopItem("Teddy Bear", 23.0));
        cart.addItem(new ShopItem("Teddy Bear", 23.0));
        assertEquals(cart.getPrice(), 69.0, 0.001);
    }

    public void testRemovals() {
        cart.addItem(new ShopItem("Teddy Bear", 23.0));
        cart.addItem(new ShopItem("Teddy Bear", 23.0));
        cart.addItem(new ShopItem("Teddy Bear", 23.0));
        cart.addItem(new ShopItem("Teddy Bear", 23.0));
        cart.addItem(new ShopItem("Teddy Bear", 23.0));
        cart.removeItem(new ShopItem("Teddy Bear", 23.0));
        cart.removeItem(new ShopItem("Teddy Bear", 23.0));
        assertEquals(cart.getPrice(), 46.0, 0.001);
    }
}
