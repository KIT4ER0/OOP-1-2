package Wk1;

import java.util.*;
public class Ex20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double hours, mins, secs;
        System.out.print("Input : Hours : ");
        hours = sc.nextDouble();
        System.out.print("      : Mins  : ");
        mins = sc.nextDouble();
        secs = (hours*Math.pow(60, 2))+(mins*60);
        System.out.println("Output : Secs = "+secs);
    }
}
