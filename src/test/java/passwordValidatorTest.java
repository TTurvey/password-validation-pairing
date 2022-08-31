import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


class PasswordValidatorTest {

    @BeforeEach
    void setUp() {

    }

    @Test
    void empty_string_returns_false() {
        assertFalse( new PasswordValidator("").validate() );
    }

    @Test
    void test_for_over_eight_characters() {
        assertTrue( new PasswordValidator("123456789").moreThanEight() );
    }

    @Test
    void test_for_containing_a_capital_letter() {
        assertTrue( new PasswordValidator("A").capitalLetter() );
    }

    @Test
    void test_for_containing_a_lowercase_letter() {
        assertTrue( new PasswordValidator("a").lowerCaseLetter() );
    }

    @Test
    void test_for_containing_a_number() {
        assertTrue( new PasswordValidator("1").containsNumber() );
    }

    @Test
    void test_for_containing_an_underscore() {
        assertTrue( new PasswordValidator("_").containsNumber() );
    }




}