
package Wk2;

import java.util.*;
public class Ex10 {
    public static void main(String[] args) {
        Scanner sc1 = new Scanner(System.in);
        Scanner sc2 = new Scanner(System.in);
        double money, ans = 0;
        char type;
        System.out.print("Input your money : ");
        money = sc1.nextDouble();
        System.out.print("Input your accout type(Please type A B C or X in uppercase) : ");
        type = sc2.next().charAt(0);
        /*if ((type == 'A') | (type == 'C')){
            ans = money + (money * 0.015);
        } else if (type == 'B'){
            ans = money + (money * 0.02);
        } else if (type == 'X'){
            ans = money + (money * 0.05);
        }*/
        switch(type){
            case 'A': case 'C':
                ans = money + (money * 0.015);
                break;
            case 'B':
                ans = money + (money * 0.02);
                break;
            case 'X':
                ans = money + (money * 0.05);
                break;
        }
        System.out.println("Your Total money in one year = "+ans);
    }
}
