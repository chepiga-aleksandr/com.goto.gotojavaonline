package Task3;

import java.util.ArrayDeque;

public class Runner {
    public static void main(String[] args) {

        String formula = "825*+132*+4-/";

        ArrayDeque<Integer> stack = new ArrayDeque<>();

        for (int i = 0; i < formula.length(); i++) {

            char element = formula.charAt(i);
            if (Character.isDigit(element)) {

                stack.addFirst(Character.getNumericValue(element));

            } else {

                int a = stack.pollFirst();
                int b = stack.pollFirst();
                int result;

                if (element == '+') {

                    result = a + b;
                    stack.addFirst(result);
                }
                if (element == '-') {

                    result = b - a;
                    stack.addFirst(result);
                }
                if (element == '*') {

                    result = a * b;
                    stack.addFirst(result);
                }
                if (element == '/') {

                    result = b / a;
                    stack.addFirst(result);
                }
            }
        }
        System.out.println(stack.getFirst());
    }
}

