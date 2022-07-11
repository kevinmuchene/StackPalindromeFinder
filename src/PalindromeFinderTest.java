import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PalindromeFinderTest {



    @Test
    void singleCharacterPalindrome() {

        PalindromeFinder palindromeFinder = new PalindromeFinder("j");
        assertTrue(palindromeFinder.isPalindrome());
    }

    @Test
    void multipleWords() {
        PalindromeFinder palindromeFinder = new PalindromeFinder("Able was I ere I saw Elba");
        assertTrue(palindromeFinder.isPalindrome());
    }

    @Test
    void multipleCharacters() {
        PalindromeFinder palindromeFinder = new PalindromeFinder("Kayak");
        assertTrue(palindromeFinder.isPalindrome());
    }

    @Test
    void differentCases() {
        PalindromeFinder palindromeFinder = new PalindromeFinder("Kayak in Kayaka");
        assertFalse(palindromeFinder.isPalindrome());
    }

    @Test
    void evenLengthString() {
        PalindromeFinder palindromeFinder = new PalindromeFinder("Rotavator");
        assertTrue(palindromeFinder.isPalindrome());
    }

    @Test
    void oddLengthString() {
        PalindromeFinder palindromeFinder = new PalindromeFinder("Solos");
        assertTrue(palindromeFinder.isPalindrome());
    }

    @Test
    void emptyString() {
        PalindromeFinder palindromeFinder = new PalindromeFinder("");
        assertTrue(palindromeFinder.isPalindrome());
    }

    @Test
    void longestPalindrome() {
        PalindromeFinder palindromeFinder = new PalindromeFinder("saippuakivikauppias");
        assertTrue(palindromeFinder.isPalindrome());
    }

}