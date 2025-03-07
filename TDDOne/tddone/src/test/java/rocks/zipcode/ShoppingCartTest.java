package rocks.zipcode;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import static org.junit.jupiter.api.Assertions.*;


// Student should write this test class

class ShoppingCartTest {
    // TODO: Write tests for the ShoppingCart class
    private ShoppingCart shoppingCart;
    private ShoppingCart.Item item1;
    private ShoppingCart.Item item2;
    private ShoppingCart.Item item3;

    @BeforeEach
    void setUp() {
        item1 = new ShoppingCart.Item("Oranges", 1.75, 5);
        item2 = new ShoppingCart.Item("Apples", 1.50, 5);
        item3 = new ShoppingCart.Item("Cans", 2.00, 10);
        shoppingCart = new ShoppingCart(0.09);

    }
    // Make sure to test all functionality including:
    // - Adding and removing items
    @Test
    void test1AddItem() {

    }

    @Test
    void test2AddItem() {

    }

    @Test
    void test3AddItem() {

    }

    @Test
    void test4AddItem() {

    }

    @Test
    void test1RemoveItem() {

    }
    @Test
    void test2RemoveItem() {

    }

    // - Calculating subtotal, tax, and total
    //info for subtotal needed -




    // - Edge cases like an empty cart
    //check bankaccount tests for formatting, check shoppingcart for specific exception details



    // - Invalid inputs (e.g., negative prices, zero quantity)
    //check bankaccount tests for formatting, check shoppingcart for specific exception details




}
