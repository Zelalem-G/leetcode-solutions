import java.util.*;

class Solution {
    public int calPoints(String[] ops) {
        Stack<Integer> stack = new Stack<>();

        for (String op : ops) {
            switch (op) {
                case "C":
                    if (!stack.isEmpty()) {
                        stack.pop();  
                    }
                    break;
                case "D":
                    if (!stack.isEmpty()) {
                        stack.push(stack.peek() * 2);  
                    }
                    break;
                case "+":
                    if (stack.size() >= 2) {
                        int last = stack.pop();
                        int secondLast = stack.peek();
                        int sum = last + secondLast;
                        stack.push(last);  
                        stack.push(sum);   
                    } else if (stack.size() == 1) { 
                        stack.push(stack.peek()); 
                    }
                    break;
                default:
                    stack.push(Integer.parseInt(op)); 
            }
        }

        int total = 0;
        for (int score : stack) {
            total += score;
        }

        return total;
    }
}

