package rocks.zipcode;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;


// Student should write this test class

class ShoppingCartTest {
    // TODO: Write tests for the ShoppingCart class
    ShoppingCart shoppingCart;
    ShoppingCart fullCart;
    ShoppingCart.Item item1;
    ShoppingCart.Item item2;
    ShoppingCart.Item item3;
    ShoppingCart.Item item4;

    @BeforeEach
    void setUp() {
        //given this info
        shoppingCart = new ShoppingCart(0.09);
        fullCart = new ShoppingCart(0.09);
        item1 = new ShoppingCart.Item("Orange", 1.75, 5);
        item2 = new ShoppingCart.Item("Apple", 1.50, 5);
        item3 = new ShoppingCart.Item("Can", 1.99, 4);
        item4 = new ShoppingCart.Item("Peach", 1.75, 1);
    }
    // Make sure to test all functionality including:
    // - Adding and removing items
    @Test
    public void test1AddItem() {
        //when
        shoppingCart.addItem(item1);
        //then
        assertEquals(item1, shoppingCart.getItem(0));
    }

    @Test
    public void test2AddItem() {
        //when
        shoppingCart.addItem(item1);
        shoppingCart.addItem(item2);
        //then
        assertEquals(item2, shoppingCart.getItem(1));
    }

    @Test
    public void test3AddItem() {
        //when
        shoppingCart.addItem(item3);
        shoppingCart.addItem(item3);
        //then
        assertEquals(item3, shoppingCart.getItem(1));
        //when
        shoppingCart.addItem(item1);
        //then
        assertEquals(item1, shoppingCart.getItem(2));
    }

    @Test
    public void test1RemoveItem() {
        //given
        fullCart.addItem(item1);
        fullCart.addItem(item2);
        fullCart.addItem(item3);
        //when
        fullCart.removeItem(item2);
        //then
        assertEquals(item3, fullCart.getItem(1));
    }

    @Test
    public void test2RemoveItem() {
        //given

        //when

        //then

    }

    @Test
    public void test3RemoveItem() {

    }

    // - Calculating subtotal, tax, and total
    //info for subtotal needed -
    @Test
    public void test1SubTotal() {

    }

    @Test
    public void test2SubTotal() {

    }

    @Test
    public void test3SubTotal() {

    }

    // - Edge cases like an empty cart
    //check bankaccount tests for formatting, check shoppingcart for specific exception details
    @Test
    public void test1emptyCart() {

    }


    // - Invalid inputs (e.g., negative prices, zero quantity)
    //check bankaccount tests for formatting, check shoppingcart for specific exception details




}
