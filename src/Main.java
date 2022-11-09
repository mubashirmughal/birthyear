// Muhammad Mubashir Mughal C0861455

import java.time.Year;
import java.util.Scanner;


public class Main {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter Age- ");
        int age = sc.nextInt();
        int birthyear = Year.now().getValue();
        System.out.println("Birth year is : " + (birthyear-age));
    }
}