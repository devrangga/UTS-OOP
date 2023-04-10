package Nomor3;

public class enemy {
//    attribute
    private String name;
    private int hp;
    private int attackDamage;
//    constructor
    public enemy(String name, int hp, int attackDamage){
        this.name = name;
        this.hp = hp;
        this.attackDamage = attackDamage;
    }
//    method
    public String attack(){
        return "attack!";
    }

    public static void main(String[] args) {
        Zombie Z = new Zombie("Jombah",100,25);
        System.out.println(Z.attack());
        System.out.println(Z.walk());

        Burung B = new Burung("Manuk",25,5);
        System.out.println(B.attack());
        System.out.println(B.fly());
        System.out.println(B.walk());

        Pocong P = new Pocong("MrP",0,100);
        System.out.println(P.attack());
        System.out.println(P.jump());
    }
}
