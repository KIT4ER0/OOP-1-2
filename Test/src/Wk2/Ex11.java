
package Wk2;

import java.util.*;
public class Ex11 {
    public static void main(String[] args) {
        Scanner sc1 = new Scanner(System.in);
        Scanner sc2 = new Scanner(System.in);
        String name;
        double weight, salary = 0;
        int age, numDay1, numDay2;
        System.out.print("Please insert your name : ");
        name = sc2.nextLine();
        System.out.print("Please insert your age : ");
        age = sc1.nextInt();
        System.out.print("PLease insert number of working days : ");
        numDay1 = sc1.nextInt();
        System.out.print("PLease insert number of absent days : ");
        numDay2 = sc1.nextInt();
        System.out.print("Please insert your body weight : ");
        weight = sc1.nextDouble();
        if ((age >= 21) & (age <= 30)){
            salary = (numDay1 * 300) - (numDay2 * 50);
        } else if ((age >= 31) & (age <= 40)){
            salary = (numDay1 * 500) - (numDay2 * 50);
        } else if ((age >= 41) & (age <= 50)){
            salary = (numDay1 * 1000) - (numDay2 * 25);
        } else if ((age >= 51) & (age <= 60)){
            salary = (numDay1 * 3000);
        }
        System.out.println("Hi, "+name);
        System.out.println("Your salary is "+salary+ " Bath");
        if ((weight >= 10) & (weight <= 60)){
            salary = salary + 5000;
        } else if ((weight >= 61) & (weight <= 90)){
            salary = salary + (5000 - ((weight - 60) * 10));
        }
        System.out.println("Your salary and bonus is "+salary+ " Bath");
    }
}
