
public abstract class Spell {
    private final String name;
    private int damage;
    public Spell(){
        this.name = "";
        this.damage = 0;
    }
    public Spell(String name){
        this.name = name;
        this.damage = 0;
    }
    public String getName(){
        return name;
    }
    public void setDamage(int damage){
        this.damage = damage;
    }
    public int getDamage(){
        return damage;
    }
}
