
package Wk3;

import java.util.*;
public class Ex7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int odd=0, even=0, x;
        do{
            x = sc.nextInt();
            if (x%2 == 0){
                even += 1;  
            }else if(x==-1){
                break;
            }else{
                odd += 1;
            }
        }while(x!=-1);
        System.out.println("Odd number = "+odd+ " and Even number = "+even);
    }
}
