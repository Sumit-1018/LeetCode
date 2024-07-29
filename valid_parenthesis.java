import java.util.*;
public class valid_parenthesis {
    public static boolean isValid(String str1){
        Stack<Character> s=new Stack<>();
        for(int i=0;i<str1.length();i++){
        if(str1.charAt(i)=='(' || str1.charAt(i)== '{' || str1.charAt(i)== '['){
            s.push(str1.charAt(i));
        }else if(str1.charAt(i)==')' || str1.charAt(i)== '}' || str1.charAt(i)== ']'){
            if(s.empty()){
                return false;
            }
            char c=s.pop();
            if(str1.charAt(i)==')' && c!='('){
                return false;
            }else if(str1.charAt(i)=='}' && c!='{'){
                return false;
            }else if(str1.charAt(i)==']' && c!='['){
                return false;
            }else{
                
            }
        }
        }
        return s.isEmpty();
    }
    
    public static void main(String[] args) {
        String str1="()()[]";
        System.out.println(isValid(str1));
    }
}
