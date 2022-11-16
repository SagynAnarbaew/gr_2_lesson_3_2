
public class Hero {
    private int health;

    private String superpower;

    private int damage;

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public String getSuperpower() {
        return superpower;
    }

    public void setSuperpower(String superpower) {
        this.superpower = superpower;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public Hero (int health, String superpower, int damage){
        System.out.print(this);
        this.health =health;
        this.superpower = superpower;
        this.damage = damage;

    }


    public Hero ( int health,int damage){
        System.out.print(this);
        this.damage= damage;
        this.health= health;
    }
}
