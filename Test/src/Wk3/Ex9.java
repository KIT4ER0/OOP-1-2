
package Wk3;

import java.util.*;
public class Ex9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please insert a number : ");
        int x = sc.nextInt(), check=0;
        for(int i=1; i<=x; i++){
            System.out.print("|");
            check += 1;
            if (check==5){
                System.out.println();
                check -= 5;
            }
        }
    }
}
