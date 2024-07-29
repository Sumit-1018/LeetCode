import java.util.Stack;

class LPU{
    public static boolean isValid(String s){
        Stack<Character> c = new Stack<>();
        for(int i=0;i<s.length();i++){
            char t = s.charAt(i);
            if(t=='(' || t == '{' || t=='['){
                c.push(t);
            }
            else{
                if(c.isEmpty()){
                    return false;
                }
                char top = c.peek();
                // System.out.println(u);
                if(t==top){
                    c.pop();
                }
                else{
                    return false;
                    // c.push(t);
                }
            }
        }   
        if(!c.isEmpty()){
            return false;
        }
        else{
            return true;
        }
    }
    public static void main(String[] args) {
        String str = "(([{}])))[])";
        String st = "(({}))";
        System.out.println(isValid(str));
        System.out.println(isValid(st));
    }
}