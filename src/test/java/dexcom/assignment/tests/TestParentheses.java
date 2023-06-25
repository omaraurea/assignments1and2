package dexcom.assignment.tests;

import dexcom.assignment.Parentheses;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestParentheses {
    @Test
    public void testPassingBalanced(){
        testParentheses("((({{{[[[]]]}}})))",true);
    }
    @Test
    public void testPassingNotBalanced(){
        testParentheses("((()()()))(()",false);
    }
    private void testParentheses(String string,Boolean expectedValue){
        Boolean expValue = expectedValue;
        assertEquals(expValue, Parentheses.isBalanced(string));
    }
}
