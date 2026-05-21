public class Stack {
    
    public static void main(String[] args) {
        java.util.Stack<Integer> st=new java.util.Stack<>();
        st.push(67);
        st.push(56);
        st.push(45);
        st.push(34);    
        st.push(23);
        st.push(12);

        System.out.println(st);
        System.out.println(st.peek());
        System.out.println(st.search(45));
        System.out.println(st.isEmpty());
        st.pop();
        System.out.println(st);
    }
}
