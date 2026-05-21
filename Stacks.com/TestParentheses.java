import java.util.Stack;
public class TestParentheses {
    // This method checks if the parentheses in the given expression are balanced using a stack like {, }, (, ), [, ]
    public static String isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for (char c : s.toCharArray()) {
            if(c=='('){
                stack.push(')');
            } else if(c=='{'){
                stack.push('}');
            } else if(c=='['){
                stack.push(']');
            } else if(stack.isEmpty() || stack.pop() != c){
                return "No";
            }
        }
        return "Yes";

    }
    public static void main(String[] args) {
        String str="({[)})";
        //Output as yes or no
        String result = isValid(str);
        if(result.equals("Yes")){
            System.out.println(str+" is a valid parentheses expression.");
        } else {
            System.out.println(str+" is not a valid parentheses expression.");
        }
    }
}