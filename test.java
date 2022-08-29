import java.io.*;
import java.util.*;
public class test {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your string");
        String s = sc.nextLine();
        System.out.println("Enter the time you want to delete it in ");
        int t = sc.nextInt();
        System.out.println();


        System.out.print(s);


        for(int i=0;i<s.length();i++){
            try {
                Thread.sleep((t*1000)/s.length());
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.print("\b");
        }

    }
}
