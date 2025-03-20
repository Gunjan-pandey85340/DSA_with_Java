import java.util.*;
public class problem1 {
    public static void pushBottom(Stack<Integer> st,int data){
        if(st.isEmpty()){
            st.push(data);
            return;
        }
        int top = st.pop();
        pushBottom(st, data);
        st.push(top);
    }
    public static String reverseString(String str) {
        Stack<Character> s = new Stack<>();
        int idx = 0;
        while(idx < str.length()){
            s.push(str.charAt(idx));
            idx++;
        }
        StringBuilder res = new StringBuilder("");
        while (!s.isEmpty()) {
            char curr = s.pop();
            res.append(curr);
            
        }
        return res.toString();
    }
    // public static void main(String[] args) { //problem1
    //     Stack<Integer> st = new Stack<>();
    //     st.push(1);
    //     st.push(2);
    //     st.push(3);
    //     pushBottom(st , 4);
    //     while (!st.isEmpty()) {
    //         System.out.println(st.pop());
            
    //     }
    // }
    public static void main(String[] args) {
        String str = "abcd";
        String res = reverseString(str);
        System.out.println(res);
    }
}
