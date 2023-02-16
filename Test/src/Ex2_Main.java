public class Ex2_Main {
    public static void main(String[] args) {
    Ex2_fraction f1 = new Ex2_fraction();
    f1.topN = 2;
    f1.btmN = 5;
    Ex2_fraction f2 = new Ex2_fraction();
    f2.topN = 3;
    f2.btmN = 7;
        System.out.println("before "+f1.toFraction());
        System.out.println("before "+f1.toFloat());
        f1.addFraction(f2);
        System.out.println("after "+f1.toFraction());
        System.out.println("after "+f1.toFloat());
}
}
