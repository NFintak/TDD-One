package rocks.zipcode;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;


// Student should write this test class

class ShoppingCartTest {
    // TODO: Write tests for the ShoppingCart class
    private ShoppingCart shoppingCart;
    private ShoppingCart.Item item1;
    private ShoppingCart.Item item2;
    private ShoppingCart.Item item3;
    private ShoppingCart.Item item4;

    @BeforeEach
    void setUp() {
        //given this info
        shoppingCart = new ShoppingCart(0.09);
        item1 = new ShoppingCart.Item("Orange", 1.75, 5);
        item2 = new ShoppingCart.Item("Apple", 1.50, 5);
        item3 = new ShoppingCart.Item("Can", 1.99, 4);
        item4 = new ShoppingCart.Item("Peach", 1.75, 0);
    }
    // Make sure to test all functionality including:
    // - Adding and removing items
    @Test
    public void test1AddItem() {
        //when
        shoppingCart.addItem(item1);
        //then
        assertEquals();
    }

    @Test
    public void test2AddItem() {
        //when
        shoppingCart.addItem(item1);
        shoppingCart.addItem(item2);
        //then
        assertEquals();
    }

    @Test
    public void test3AddItem() {
        //when
        shoppingCart.addItem(item4);
        shoppingCart.addItem(item3);
        //then
        assertEquals();
        //when
        shoppingCart.addItem(item1);
        //then
        assertEquals();
    }

    @Test
    public void test1RemoveItem() {

    }

    @Test
    public void test2RemoveItem() {

    }

    @Test
    public void test3RemoveItem() {

    }

    // - Calculating subtotal, tax, and total
    //info for subtotal needed -




    // - Edge cases like an empty cart
    //check bankaccount tests for formatting, check shoppingcart for specific exception details
    @Test
    public void test1emptyCart() {

    }


    // - Invalid inputs (e.g., negative prices, zero quantity)
    //check bankaccount tests for formatting, check shoppingcart for specific exception details




}
