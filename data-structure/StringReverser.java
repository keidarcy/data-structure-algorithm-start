package com.xyh;

import java.util.Stack;

public class StringReverser {
    public String reverse(String input) {
        if (input == null) {
            throw new IllegalArgumentException();
        }

        // input = "strong"
        Stack<Character> stack = new Stack<>();

//        for (int i = 0; i < input.length(); i++) {
//            stack.push(input.charAt(i));
//        }

        for (char ch : input.toCharArray()) {
            stack.push(ch);
        }

        var reversed = new StringBuffer();
        while(!stack.empty()){
            reversed.append(stack.pop());
        }

        return reversed.toString();
    }
}
