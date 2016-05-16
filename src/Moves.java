public class Moves{
  private int dam; //how much damage is dealt
  private int uses; //how many times it can be used
  private int num; //position in moveList for the pokemon
  private String type; //attack type
  //http://bulbapedia.bulbagarden.net/wiki/Damage#Damage_formula
  public Moves(){
    dam = 0;
    uses = 0;
    num = 0;
    type = "";
  }
  public Moves(int d, int u, int n, String t){
    dam = d;
    uses = u;
    num = n;
    type = t;
  }

  public int getDam(){
    return dam;
  }
  public int getUses(){
    return uses;
  }
  public int getNum(){
    return num;
  }
  public String getType(){
    return type;
  }
  public double generateModifier(boolean stab, int ){ //Method in progress
    double rand = Math.random();
    if (stab = true){
      double modifier = 1.5 *
    }
    else if(stab = false)
  }

  public int generateDamage(int base, int level, int attack, int defense, double modifier){
    int damage = Math.round(((2 * level) / 250) * (attack / defense) * base + 2);
    return damage;
  }
}
