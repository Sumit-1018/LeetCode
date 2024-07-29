public class print_largest_string_lexographically {
    public static void main(String[] args) {
        String arr[] = {"apple", "orange", "mango"};

        System.out.println(largest_string_lexographically(arr));
    }
    public static String largest_string_lexographically(String[] arr) {
        int x=1;
        int max=0;
        while(x<arr.length){
            if(arr[max].compareTo(arr[x])<0){
                max=x;
            }
            x++;
        }
        return arr[max];
        
    }
}
