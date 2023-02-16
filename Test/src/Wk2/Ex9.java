
package Wk2;

import java.util.*;
public class Ex9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double money = sc.nextDouble(), tax;
        if(money > 50000){
            tax = money * 0.1;
        } else {
            tax = money * 0.05;
        }
        System.out.println(tax);
    }
}
