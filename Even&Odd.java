//even or odd
import java.util.*;
public class JavaBasics{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        if(number%2==0){
            System.out.println("no is even");
        }else{
            System.out.println("no is odd");
        }
    }
}
