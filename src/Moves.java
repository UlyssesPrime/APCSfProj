public class Moves{
  private int dam; //how much damage is dealt
  private int uses; //how many times it can be used
  private int num; //position in moveList for the pokemon
  private String type; //attack type

  public Move(){
    dam = 0;
    uses = 0;
    num = 0;
    type = "";
  }
  public Move(int d, int u, int n, String t){
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

  /* To be used when attacking an enemy's BattleMon */
  public void useMove(Enemy opp){
    if (this.getType().equals("Fire") && opp.getType1().equals("Bug") || opp.getType2().equals("Bug")){
      System.out.println("It's Super Effective!");
      System.out.println();
      opp.takeDam(this.getDam() * 2);
    }
    else if()
  }

}
