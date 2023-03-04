
public class Pigeous extends Bird{
    public Pigeous(){
        super("", 0);
        setPower(150);
    }
    public Pigeous(String name, int age){
        super(name, age);
        setPower(150);
    }
    @Override
    public void eat(Food f){
        setPower(f.getPower() * 2 + getPower());
    }
    @Override
    public void fly(){
        System.out.println(getName()+" fly fly ....");
    }
    @Override
    public void wingAttack(Animal a){
        a.setPower(a.getPower() - 5);
    }
    public void wingAttack(Animal a, int times){
        for(int i = 1; i <= times; i++){
            this.wingAttack(a);
        }
    }
}
