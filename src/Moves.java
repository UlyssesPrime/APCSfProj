public class Moves{
  private int dam; //how much damage is dealt
  private int uses; //how many times it can be used
  private int num; //position in moveList for the pokemon
  private String type; //attack type

  private final String[] attackMessages = {"It's Super Effective!", "It's Not Very Effective.", "It Had No Effect..."};
  private final String[] types = {"Bug", "Dragon", "Electric", "Fighting", "Fire", "Flying", "Ghost", "Grass", "Ground", "Ice", "Normal", "Poison", "Psychic", "Rock", "Water"};

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

  public int generateDamage(int base, int level, int attack, int defense){
    int damage = (((2 * level) / 250) * (attack / defense) * base + 2);
    return damage;
  }

  /* To be used when attacking an enemy's BattleMon */
  public void useMove(BattleMons opp){
    if (this.getType().equals(types[4]) && opp.getType1().equals(types[0]) || opp.getType2().equals(types[0])){
      System.out.println(attackMessages[1]);
      System.out.println();
      opp.takeDam(generateDamage(this.getDam(), opp.getLevel(), opp.getAttack(), opp.getDefense()) * 2);
    }
    else if (this.getType().equals(types[5]) && opp.getType1().equals(types[0]) || opp.getType2().equals(types[0])){
      System.out.println(attackMessages[1]);
      System.out.println();
      opp.takeDam(generateDamage(this.getDam(), opp.getLevel(), opp.getAttack(), opp.getDefense()) * 2);
    }
    else if (this.getType().equals(types[7]) && opp.getType1().equals(types[0]) || opp.getType2().equals(types[0])){
      System.out.println(attackMessages[2]);
      System.out.println();
      opp.takeDam(generateDamage(this.getDam(), opp.getLevel(), opp.getAttack(), opp.getDefense()) / 2);
    }
    else if (this.getType().equals(types[11]) && opp.getType1().equals(types[0]) || opp.getType2().equals(types[0])){
      System.out.println(attackMessages[1]);
      System.out.println();
      opp.takeDam(generateDamage(this.getDam(), opp.getLevel(), opp.getAttack(), opp.getDefense()) * 2);
    }
    else if (this.getType().equals(types[13]) && opp.getType1().equals(types[0]) || opp.getType2().equals(types[0])){
      System.out.println(attackMessages[1]);
      System.out.println();
      opp.takeDam(generateDamage(this.getDam(), opp.getLevel(), opp.getAttack(), opp.getDefense()) * 2);
    }
    else if (this.getType().equals(types[9]) && opp.getType1().equals(types[1]) || opp.getType2().equals(types[1])){
      System.out.println(attackMessages[1]);
      System.out.println();
      opp.takeDam(generateDamage(this.getDam(), opp.getLevel(), opp.getAttack(), opp.getDefense()) * 2);
    }
    else if (this.getType().equals(types[2]) && opp.getType1().equals(types[2]) || opp.getType2().equals(types[2])){
      System.out.println(attackMessages[2]);
      System.out.println();
      opp.takeDam(generateDamage(this.getDam(), opp.getLevel(), opp.getAttack(), opp.getDefense()) / 2);
    }
    else if (this.getType().equals(types[5]) && opp.getType1().equals(types[2]) || opp.getType2().equals(types[2])){
      System.out.println(attackMessages[2]);
      System.out.println();
      opp.takeDam(generateDamage(this.getDam(), opp.getLevel(), opp.getAttack(), opp.getDefense()) / 2);
    }
    else if (this.getType().equals(types[8]) && opp.getType1().equals(types[2]) || opp.getType2().equals(types[2])){
      System.out.println(attackMessages[1]);
      System.out.println();
      opp.takeDam(generateDamage(this.getDam(), opp.getLevel(), opp.getAttack(), opp.getDefense()) * 2);
    }
    else if (this.getType().equals(types[5]) && opp.getType1().equals(types[3]) || opp.getType2().equals(types[3])){
      System.out.println(attackMessages[1]);
      System.out.println();
      opp.takeDam(generateDamage(this.getDam(), opp.getLevel(), opp.getAttack(), opp.getDefense()) * 2);
    }
    else if (this.getType().equals(types[12]) && opp.getType1().equals(types[3]) || opp.getType2().equals(types[3])){
      System.out.println(attackMessages[1]);
      System.out.println();
      opp.takeDam(generateDamage(this.getDam(), opp.getLevel(), opp.getAttack(), opp.getDefense()) * 2);
    }
    else if (this.getType().equals(types[13]) && opp.getType1().equals(types[3]) || opp.getType2().equals(types[3])){
      System.out.println(attackMessages[2]);
      System.out.println();
      opp.takeDam(generateDamage(this.getDam(), opp.getLevel(), opp.getAttack(), opp.getDefense()) / 2);
    }
    else if (this.getType().equals(types[0]) && opp.getType1().equals(types[4]) || opp.getType2().equals(types[4])){
      System.out.println(attackMessages[2]);
      System.out.println();
      opp.takeDam(generateDamage(this.getDam(), opp.getLevel(), opp.getAttack(), opp.getDefense()) / 2);
    }
    else if (this.getType().equals(types[7]) && opp.getType1().equals(types[4]) || opp.getType2().equals(types[4])){
      System.out.println(attackMessages[2]);
      System.out.println();
      opp.takeDam(generateDamage(this.getDam(), opp.getLevel(), opp.getAttack(), opp.getDefense()) / 2);
    }
    else if (this.getType().equals(types[8]) && opp.getType1().equals(types[4]) || opp.getType2().equals(types[4])){
      System.out.println(attackMessages[1]);
      System.out.println();
      opp.takeDam(generateDamage(this.getDam(), opp.getLevel(), opp.getAttack(), opp.getDefense()) * 2);
    }
    else if (this.getType().equals(types[13]) && opp.getType1().equals(types[4]) || opp.getType2().equals(types[4])){
      System.out.println(attackMessages[1]);
      System.out.println();
      opp.takeDam(generateDamage(this.getDam(), opp.getLevel(), opp.getAttack(), opp.getDefense()) * 2);
    }
    else if (this.getType().equals(types[14]) && opp.getType1().equals(types[4]) || opp.getType2().equals(types[4])){
      System.out.println(attackMessages[1]);
      System.out.println();
      opp.takeDam(generateDamage(this.getDam(), opp.getLevel(), opp.getAttack(), opp.getDefense()) * 2);
    }
    else if (this.getType().equals(types[0]) && opp.getType1().equals(types[5]) || opp.getType2().equals(types[5])){
      System.out.println(attackMessages[2]);
      System.out.println();
      opp.takeDam(generateDamage(this.getDam(), opp.getLevel(), opp.getAttack(), opp.getDefense()) / 2);
    }
    else if (this.getType().equals(types[2]) && opp.getType1().equals(types[5]) || opp.getType2().equals(types[5])){
      System.out.println(attackMessages[1]);
      System.out.println();
      opp.takeDam(generateDamage(this.getDam(), opp.getLevel(), opp.getAttack(), opp.getDefense()) * 2);
    }
    else if (this.getType().equals(types[3]) && opp.getType1().equals(types[5]) || opp.getType2().equals(types[5])){
      System.out.println(attackMessages[2]);
      System.out.println();
      opp.takeDam(generateDamage(this.getDam(), opp.getLevel(), opp.getAttack(), opp.getDefense()) / 2);
    }
    else if (this.getType().equals(types[7]) && opp.getType1().equals(types[5]) || opp.getType2().equals(types[5])){
      System.out.println(attackMessages[2]);
      System.out.println();
      opp.takeDam(generateDamage(this.getDam(), opp.getLevel(), opp.getAttack(), opp.getDefense()) / 2);
    }
    /*else if (this.getType().equals(types[]) && opp.getType1().equals(types[]) || opp.getType2().equals(types[])){
      System.out.println(attackMessages[]);
      System.out.println();
      opp.takeDam(generateDamage(this.getDam(), opp.getLevel(), opp.getAttack(), opp.getDefense())  2);
    }
    else if (this.getType().equals(types[]) && opp.getType1().equals(types[]) || opp.getType2().equals(types[])){
      System.out.println(attackMessages[]);
      System.out.println();
      opp.takeDam(generateDamage(this.getDam(), opp.getLevel(), opp.getAttack(), opp.getDefense())  2);
    }
    else if (this.getType().equals(types[]) && opp.getType1().equals(types[]) || opp.getType2().equals(types[])){
      System.out.println(attackMessages[]);
      System.out.println();
      opp.takeDam(generateDamage(this.getDam(), opp.getLevel(), opp.getAttack(), opp.getDefense())  2);
    }
    else if (this.getType().equals(types[]) && opp.getType1().equals(types[]) || opp.getType2().equals(types[])){
      System.out.println(attackMessages[]);
      System.out.println();
      opp.takeDam(generateDamage(this.getDam(), opp.getLevel(), opp.getAttack(), opp.getDefense())  2);
    }
    else if (this.getType().equals(types[]) && opp.getType1().equals(types[]) || opp.getType2().equals(types[])){
      System.out.println(attackMessages[]);
      System.out.println();
      opp.takeDam(generateDamage(this.getDam(), opp.getLevel(), opp.getAttack(), opp.getDefense())  2);
    }
    else if (this.getType().equals(types[]) && opp.getType1().equals(types[]) || opp.getType2().equals(types[])){
      System.out.println(attackMessages[]);
      System.out.println();
      opp.takeDam(generateDamage(this.getDam(), opp.getLevel(), opp.getAttack(), opp.getDefense())  2);
    } */
  }
}
