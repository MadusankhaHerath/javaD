import java.util.Stack;

class bracketcheck{
    public static boolean isbalance(String str){
        Stack<Character> st = new Stack<>();

        for( char ch : str.toCharArray()){
            if (ch =='(' || ch =='{' || ch == '['){
            st.push(ch);
            }

            else if(ch ==')' || ch =='}' || ch == ']'){
                if(st.isEmpty()) return false;

                char top = st.pop();
                if(!match(top,ch)) return false;
            }
        }
        return st.isEmpty();
    }

    private static boolean match(char open ,char close){
        return (open =='(' && close ==')' ||
                open =='{' && close =='}' ||
                open =='[' && close ==']'    );
    }
    public static void main(String[] args) {
        String input = "({[[]})";
        if(isbalance(input)){
            System.out.println("balance");
        }
        else if(!isbalance(input)){
            System.out.println("notbalance");
        }
        
    }

}