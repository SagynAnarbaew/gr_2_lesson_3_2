public class Main {
    public static  void main(String[] args){
        Boss boss = new Boss();
        boss.setHealth(700);
        boss.setDamage(50);
        boss.setProtection("physical");
        System.out.println("Boss health: " + boss.getHealth() + " " + "Boss damage: " + boss.getDamage() + " " + "bossAttackType: " + boss.getProtection());
    }
}
