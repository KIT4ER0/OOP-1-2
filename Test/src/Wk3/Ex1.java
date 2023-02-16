
package Wk3;

import java.util.*;
public class Ex1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("กรุณาระบุความสูงตึก : ");
        int height = sc.nextInt();
        for (int i=1; i<=height; i++){
            for (int j=1; j<=5; j++){
                if (j!=5){
                System.out.print("#-");
            }else{System.out.print("#");}
        }
        System.out.println();
    }
}
}

