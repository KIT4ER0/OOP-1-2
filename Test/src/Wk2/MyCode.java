
package Wk2;


public class MyCode {
    public static void main(String[] args) {
        int num1 = 5;
        int num2 = 10;
        if (((++num1+10) > 0) && (6+(--num2) > 10)) {
            System.out.println("(1)Num1 is "+num1+ " Num2 is "+num2);
        } else {
            System.out.println("(2)Num1 is "+num1+ " Num2 is "+num2);
        }
        System.out.print("End");
    }
}
