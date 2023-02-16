package Wk1;

import java.util.*;
public class Ex19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double val = sc.nextDouble(), vat = 0.07;
        val += val * vat;
        System.out.println(val);
    }
}
