package stringrecursion;

import org.junit.Test;

import static junit.framework.TestCase.assertFalse;
import static junit.framework.TestCase.assertTrue;
import static junit.framework.TestCase.assertEquals;

public class StringRecursionTestSuite {
    @Test
    public void testReverseString() {
        assertEquals("olleh", StringRecursionMethods.reverseString("hello"));
        assertEquals("abcde", StringRecursionMethods.reverseString("edcba"));
        assertEquals("", StringRecursionMethods.reverseString(""));
        assertEquals("a", StringRecursionMethods.reverseString("a"));
    }

    @Test
    public void testIsPalindrome() {
        assertTrue(StringRecursionMethods.isPalindrome("racecar"));
        assertTrue(StringRecursionMethods.isPalindrome("ILOVECSE131131ESCEVOLI"));
        assertFalse(StringRecursionMethods.isPalindrome("hello"));
        assertFalse(StringRecursionMethods.isPalindrome("noLemonnomelon"));
    }

    @Test
    public void testCountOccurrences() {
        assertEquals(2, StringRecursionMethods.countOccurrences("programming", 'm'));
        assertEquals(3, StringRecursionMethods.countOccurrences("banana", 'a'));
        assertEquals(0, StringRecursionMethods.countOccurrences("hello", 'z'));
        assertEquals(0, StringRecursionMethods.countOccurrences("", 'a'));
    }
}
