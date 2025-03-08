package rocks.zipcode;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;


// Student should write this test class

class ShoppingCartTest {
    // TODO: Write tests for the ShoppingCart class
    ShoppingCart shoppingCart;
    ShoppingCart.Item item1;
    ShoppingCart.Item item2;

    @BeforeEach
    void setUp() {
        //given this info
        shoppingCart = new ShoppingCart(0.09);
        item1 = new ShoppingCart.Item("Orange", 1.75, 1);
        item2 = new ShoppingCart.Item("Apple", 1.50, 1);
    }
    // Make sure to test all functionality including:
    // - Adding and removing items
    @Test
    public void test1AddItem() {
        //when
        shoppingCart.addItem(item1);
        //then
        assertEquals(item1, shoppingCart.getItem(0));
        assertEquals(1, shoppingCart.getItemCount());
    }

    @Test
    public void test2AddItem() {
        //when
        shoppingCart.addItem(item1);
        shoppingCart.addItem(item2);
        //then
        assertEquals(item2, shoppingCart.getItem(1));
        assertEquals(2, shoppingCart.getItemCount());
    }

    @Test
    public void test3AddItem() {
        //when
        shoppingCart.addItem(item1);
        shoppingCart.addItem(item1);
        shoppingCart.addItem(item2);
        //then
        assertEquals(item1, shoppingCart.getItem(1));
        assertEquals(3, shoppingCart.getItemCount());
    }

    @Test
    public void test1RemoveItem() {
        //given
        shoppingCart.addItem(item1);
        shoppingCart.addItem(item2);
        shoppingCart.addItem(item1);
        //when
        shoppingCart.removeItem(item1);
        //then
        assertEquals(item2, shoppingCart.getItem(0));
        assertEquals(2, shoppingCart.getItemCount());
    }

    @Test
    public void test2RemoveItem() {
        //given
        shoppingCart.addItem(item1);
        shoppingCart.addItem(item2);
        shoppingCart.addItem(item1);
        shoppingCart.addItem(item2);
        //when
        shoppingCart.removeItem(item1);
        //then
        assertEquals(3, shoppingCart.getItemCount());
    }

    @Test
    public void test3RemoveItem() {
        //given
        shoppingCart.addItem(item1);
        //when
        shoppingCart.removeItem(item1);
        //then
        assertEquals(0, shoppingCart.getItemCount());
    }

    // - Calculating subtotal, tax, and total
    //info for subtotal needed -
    @Test
    public void test1SubTotal() {
        //given
        shoppingCart.addItem(item1);
        //when
        shoppingCart.getTotal();
        //then
        assertEquals(1.75, shoppingCart.getSubtotal(), 0.001);
        assertEquals(0.16, shoppingCart.getTaxAmount(), 0.01);
        assertEquals(1.91, shoppingCart.getTotal(), 0.01);
    }

    @Test
    public void test2SubTotal() {
        //given
        shoppingCart.addItem(item1);
        shoppingCart.addItem(item2);
        //when
        shoppingCart.getTotal();
        //then
        assertEquals(3.25, shoppingCart.getSubtotal(), 0.001);
        assertEquals(0.29, shoppingCart.getTaxAmount(), 0.01);
        assertEquals(3.54, shoppingCart.getTotal(), 0.01);
    }

    @Test
    public void test3SubTotal() {
        //given
        item1.setQuantity(2);
        item2.setQuantity(2);
        shoppingCart.addItem(item1);
        shoppingCart.addItem(item2);
        //when
        shoppingCart.getTotal();
        //then
        assertEquals(6.50, shoppingCart.getSubtotal(), 0.001);
        assertEquals(0.58, shoppingCart.getTaxAmount(), 0.01);
        assertEquals(7.08, shoppingCart.getTotal(), 0.01);
    }

    // - Edge cases like an empty cart
    @Test
    public void test1emptyCart() {
        //given
        item1.setQuantity(3);
        shoppingCart.addItem(item1);
        //when
        shoppingCart.clearCart();
        //then
        assertEquals(0, shoppingCart.getItemCount());
        assertEquals(0.00, shoppingCart.getTotal());
    }


    // - Invalid inputs (e.g., negative prices, zero quantity)
    @Test
    public void testNegativePrice() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            ShoppingCart.Item item3 = new ShoppingCart.Item("Soda", -0.50, 1);
        });

        String expectedMessage = "Price cannot be negative";
        String actualMessage = exception.getMessage();

        assertTrue(actualMessage.contains(expectedMessage));
    }

    @Test
    public void testNegativeQuantity() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            ShoppingCart.Item item = new ShoppingCart.Item("Soda", 2.00, 0);
        });

        String expectedMessage = "Quantity must be positive";
        String actualMessage = exception.getMessage();

        assertTrue(actualMessage.contains(expectedMessage));
    }

    @Test
    public void testSetQuantityZero() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            item1.setQuantity(0);
        });

        String expectedMessage = "Quantity must be positive";
        String actualMessage = exception.getMessage();

        assertTrue(actualMessage.contains(expectedMessage));
    }
}
