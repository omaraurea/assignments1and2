package dexcom.assignment.tests;
import org.junit.*;
import dexcom.assignment.Anagram;

import static org.junit.Assert.assertEquals;

public class TestAnagram {
    @Test
    public void testPassingNoAnagram() {
        testAnagram("bad","bad2",false);
    }

    @Test
    public void testPassingAnagrams() {

        testAnagram("Tom Marvolo Riddle","I am Lord Voldemort",true);

    }

    private void testAnagram(String string1, String string2, Boolean expectedValue) {
        Boolean expectedMessage = expectedValue;

        assertEquals(expectedMessage, Anagram.isAnagram(string1,string2));
    }

}