
package Wk3;

import java.util.*;
public class Ex8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please insert a number : ");
        int x = sc.nextInt();
        for(int i=1; i<= x; i++){
            if(i%5 != 0){
                System.out.print("|");
            }else{
                System.out.print("/");
            }
        }
    }
}
