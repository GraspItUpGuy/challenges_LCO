import java.util.Scanner;

public class problem1 {
    static Scanner input = new Scanner(System.in);
    public static  void main(String[] args){
        System.out.println("Enter number : ");
        int num = input.nextInt();
        System.out.println("Multiplication table for " + num + " is : ");
        for(int i=1; i<=10; i++){
            System.out.println(num + "  x  " + i + "  =  " + num*i );
        }
    }
}
