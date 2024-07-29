// Online Java Compiler
// Use this editor to write, compile and run your Java code online

import javax.swing.JOptionPane;

public class Array{
    public static void main(String args[]){
        //creating an array
        int marks[] = new int[50];
        int numbers[]={1,2,3};
        int moreNumbers[]={4,5,6};
        String fruits[]={"apple","mango","orange"};
        System.out.println(marks[0]);
        System.out.println(numbers[0]);
        System.out.println(moreNumbers[0]);
        System.out.println(fruits[0]);
        String input = JOptionPane.showInputDialog("Enter the size of the board (n):");
        System.out.println(input);

    }
}