public class Ex3_Main {
    public static void main(String[] args) {
        Ex2_fraction f1 = new Ex2_fraction();
        f1.topN = 1;
        f1.btmN = 3;
        
        Ex2_fraction f2 = new Ex2_fraction();
        f2.topN = 4;
        f2.btmN = 16;
        
        Ex2_fraction f3 = new Ex2_fraction();
        f3.topN = 5;
        f3.btmN = 15;
        
        System.out.println(f1.toFloat());
        System.out.println(f2.toFloat());
        System.out.println(f3.toFloat());
        
        System.out.println("f1 is equal to f2 >> " + f1.myEquals(f2));
        System.out.println("f1 is equal to f3 >> " + f1.myEquals(f3));
        
        System.out.println("Before : " + f2.toFraction());
        f2.LowestTermFrac();
        System.out.println("After : " + f2.toFraction());
}
}