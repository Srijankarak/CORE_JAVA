import java.lang.*;
import java.util.*;

public class ReadKeyBoard_Radix{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        sc.useRadix(2);//setting radix to binary
        int x=sc.nextInt();
        sc.useRadix(8);//setting radix to octal
        int y=sc.nextInt(); 
        sc.useRadix(16);//setting radix to hexadecimal

        int z=sc.nextInt();
        System.out.println("Values are: ");
        System.out.println("x (binary): "+x);
        System.out.println("y (octal): "+y);
        System.out.println("z (hexadecimal): "+z);
        sc.close();
    }
}