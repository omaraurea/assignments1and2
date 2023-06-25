package dexcom.assignment;

import java.util.Stack;

public class Parentheses
{
    public static Boolean isBalanced(String string){

        if (string.length()%2 != 0){
            return false;
        }

        char[] str = string.toCharArray();

        Stack<Character> isValid = new Stack<Character>();
        char toValidate;

        for (char c: str) {
            if (c == '{' || c == '[' || c == '(') {
                isValid.push(c);
            } else {
                if (!isValid.isEmpty()) {
                    toValidate = isValid.pop();
                    if (c == '}' && toValidate != '{') {
                        return false;
                    } else if (c == ']' && toValidate != '[') {
                        return false;
                    } else if (c == ')' && toValidate != '(') {
                        return false;
                    }
                } else {
                    return false;
                }
            }
        }

        if (!isValid.isEmpty()) {
            return false;
        }

        return true;
    }
}
