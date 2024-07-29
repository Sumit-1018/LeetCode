import java.util.*;

public class Strings {
    public static void main(String[] args) {
    //     char ch[] = {'a', 'b', 'c', 'd'};
    //     String str1 = "abcd";
    //     String str2 = new String("xyz");
        Scanner scanner = new Scanner(System.in);
        scanner.close();
        String firstName="Sumit";
        String lastName="Gupta";
        String fullName=firstName+" "+lastName; 
        System.out.println(fullName);

        for(int i=0;i<fullName.length();i++) {
            System.out.println(fullName.charAt(i));
        
}
}
}