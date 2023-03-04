
public class Player {
    private final String name;
    private final int attackDamage = 2;
    private Houses houses;
    private int hp = 20;
    private int mana = 50;
    public Player(String name){
        this.name = name;
    }
    public Player(String name, int hp){
        this.name = name;
        this.hp = hp;
    }
    public String getName(){
        return name;
    }
    public int getHP(){
        return hp;
    }
    public void setHP(int hp){
        if(hp > 0 && hp < 20){
            this.hp = hp;
        }
        else if(hp >= 20){
            this.hp = 20;
        }
        else if(hp <= 0){
            this.hp = 0;
        }
    }
    public int getAttackDamage(){
        return attackDamage;
    }
    public int getMana(){
        return mana;
    }
    public void setMana(int mana){
        if(mana > 0 && mana < 50){
            this.mana = mana;
        }
        else if(mana >= 50){
            this.mana = 50;
        }
        else if(mana <= 0){
            this.mana = 0;
        }
    }
    public Houses getHouses(){
        return houses;
    }
    public void setHouses(Houses houses){
        this.houses = houses;
    }
    @Override
    public String toString(){
        return "[Player] : " + name + " HP: " + hp + " Mana: " + mana + " || " +  houses;
    }
    public boolean equals(Player player){
        return houses.equals(player.houses) && name.equals(player.name);
    }
    public void attack(Player target, Spell spell){
        if(getHouses() instanceof Hufflepuff){
            ((Hufflepuff)houses).attackSpell(this, target, spell);
        }
        else if(getHouses() instanceof Gryffindor){
            ((Gryffindor)houses).attackSpell(this, target, spell);
        }
        if(target.getHP() == 0){
            System.out.println("[DEAD]: " + target.getName() + " was killed by " + getName());
        }
    }
    public void protectFromPlayer(Player target){
        if (getHouses() instanceof Gryffindor) {
            ((Gryffindor)houses).defense(this, target);
        } else if (getHouses() instanceof Hufflepuff) {
            ((Hufflepuff)houses).defense(this, target);
        }        
    }
}
