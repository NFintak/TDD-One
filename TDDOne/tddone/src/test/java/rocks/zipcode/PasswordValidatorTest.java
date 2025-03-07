package rocks.zipcode;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


// Student should write this test class
public class PasswordValidatorTest {
    // TODO: Write tests for the PasswordValidator class
    // Test cases should include:
    // - Valid passwords
    @Test
    void validPasswordTest() {
        PasswordValidator passwordTest = new PasswordValidator();
        assertTrue(passwordTest.isValid("Spr385%f"));
        assertTrue(passwordTest.isValid("pl4oCat#wtDMf7myb0op"));
        assertFalse(passwordTest.isValid("342905293"));
        assertFalse(passwordTest.isValid("42 * 83"));
    }

    // - Passwords that are too short or too long
    @Test
    void passwordTooShortTest() {
        PasswordValidator passwordTest = new PasswordValidator();
        assertTrue(passwordTest.isValid("1tTr|i7jfci@l5nefr"));
        assertFalse(passwordTest.isValid("Pick1e$"));
    }

    @Test
   void passwordTooLongTest() {
        PasswordValidator passwordTest = new PasswordValidator();
        assertTrue(passwordTest.isValid("It7a^P?wIt50wo4"));
        assertFalse(passwordTest.isValid("j5ukir#CuwnIfp61nn@cAilT7i@"));
    }

    // - Passwords missing uppercase, lowercase, digits, or special chars
    @Test
    void passwordMissingUpperTest() {
        PasswordValidator passwordTest = new PasswordValidator();
        assertTrue(passwordTest.isValid("5adIaNfy;wPfu;wj7bf"));
        assertFalse(passwordTest.isValid("igma|ra5d||wbn@hm"));
    }

    @Test
    void passwordMissingLowerTest() {
        PasswordValidator passwordTest = new PasswordValidator();
        assertTrue(passwordTest.isValid("n5aWSh^^da7(G@ec"));
        assertFalse(passwordTest.isValid("N5@WS#^^D@7CG@3("));

    }

    @Test
    void passwordMissingDigitTest() {
        PasswordValidator passwordTest = new PasswordValidator();
        assertTrue(passwordTest.isValid("4t@kLoai5b;fb7f"));
        assertFalse(passwordTest.isValid("tOn;fp+Dp@t;Skm"));
    }

    @Test
    void passwordMissingSpecialCharTest() {
        PasswordValidator passwordTest = new PasswordValidator();
        assertTrue(passwordTest.isValid(""));
        assertFalse(passwordTest.isValid(""));
    }

    // - Edge cases like null or empty strings
    @Test
    void isPasswordNullTest() {
        PasswordValidator passwordTest = new PasswordValidator();
        assertTrue(passwordTest.isValid("7hi5Str;ng#asW0rd5"));
        assertFalse(passwordTest.isValid(null));
    }

    @Test
    void isPasswordEmptyTest() {
        PasswordValidator passwordTest = new PasswordValidator();
        assertTrue(passwordTest.isValid("t#iS57r;ng#a5wOrds"));
        assertFalse(passwordTest.isValid(""));
    }

}
