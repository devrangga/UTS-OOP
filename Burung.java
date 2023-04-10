package Nomor3;

public class Burung extends enemy{
    //    constructor
    public Burung(String name,int hp,int attackDamage){
        super(name,hp,attackDamage);
    }
    //    method
    public String fly(){
        return "Manuk fly";
    }
    public String walk(){
        return "Manuk walk";
    }
}
