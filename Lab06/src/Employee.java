
public class Employee {
    private static String nationality = "Thai";
    private String name;
    private Wallet wallet;
    private int energy;
    public static void setNationality(String nationality){
        Employee.nationality = nationality;
    }
    public void setName(String name){
        this.name = name;
    }
    public void setWallet(Wallet wallet){
        this.wallet = wallet;
    }
    public void setEnergy(int energy){
        this.energy = energy;
    }
    public static String getNationality(){
        return nationality;
    }
    public String getName(){
        return name;
    }
    public Wallet getWallet(){
        return wallet;
    }
    public int getEnergy(){
        return energy;
    }
    public void eat(Food f){
        this.energy += f.getEnergy();
    }
    public boolean buyFood(Seller s){
        Food food = s.sell(this);
        if(food != null){
            this.eat(food);
            return true;
        }
        else{
            return false;
        }
    }
    public boolean equals(Employee e){
        return this.name.equals(e.getName());
    }
    @Override
    public String toString(){
        String text = "My name is "+name+".\nI have "+energy+" energy left.\n"
                + "I have a balance of "+wallet.getBalance()+" baht.";
        return text;
    }
}
