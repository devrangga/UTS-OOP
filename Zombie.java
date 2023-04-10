package Nomor3;

public class Zombie extends enemy{
//    constructor
    public Zombie(String name,int hp,int attackDamage){
        super(name,hp,attackDamage);
    }
//    method
    public String walk(){
        return "Zombie walk";
    }
}
