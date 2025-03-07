package rocks.zipcode;

/** 
 * EXERCISE 3: Calculator
 * 
 * Implement a Calculator class that can perform various mathematical operations
 * and passes all the tests.
 */

// Student must implement this class
public class Calculator {
    // TODO: Implement the following methods to make the tests pass
    
    public int add(int a, int b) {
        // Your implementation here
        return a + b;
        //return 0;
    }
    
    public int subtract(int a, int b) {
        // Your implementation here
        return a - b;
        //return 0;
    }
    
    public int multiply(int a, int b) {
        // Your implementation here
        return a * b;
        //return 0;
    }
    
    public double divide(int a, int b) {
        // Your implementation here
        if (b == 0) {
            throw new ArithmeticException("Cannot divide by zero");
        }
        return ((double)a / b); //need to add exception for /0 error
        //return 0.0;
    }
    
    public double power(int base, int exponent) {
        // Your implementation here
        return Math.pow((double) base, (double) exponent);
        //return 0.0;
    }
}

