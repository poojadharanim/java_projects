class Solution {
    public boolean isValid(String s) {
     Stack<Character> stack = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);   // THIS is like 'ch' in Python

            // If opening bracket, push
            if (ch == '(' || ch == '[' || ch == '{') {
                stack.push(ch);
            }
            // Else it's a closing bracket
            else {
                if (stack.isEmpty()) {
                    return false;
                }

                char top = stack.pop();

                if ((ch == ')' && top != '(') ||
                    (ch == ']' && top != '[') ||
                    (ch == '}' && top != '{')) {
                    return false;
                }
            }
        }

        return stack.isEmpty();    
    }
}
