public class BattleMons extends Character{
  private Moves[] moveList; //List of Moves available
  private int HP; //
  private int currentHP;
  private int speed;
  private int evasiveness;
  private int accuracy;
  private int attack;
  private int defense;
  private String type1;
  private String type2;
  private boolean isAlive;

  public BattleMons(){
    moveList = new Moves[0];
    HP = 0;
    currentHP = 0;
    speed = 0;
    evasiveness = 0;
    accuracy = 0;
    attack = 0;
    defense = 0;
    type1 = "";
    type2 = "";
    isAlive = false;
  }
  public BattleMons(Moves[] m, int h, int s, int e, int ac, int at, int d, String t1, String t2, boolean i){
    moveList = m;
    HP = h;
    currentHP = HP;
    speed = s;
    evasiveness = e;
    accuracy = ac;
    attack = at;
    defense = d;
    type1 = t1;
    type2 = t2;
    isAlive = i;
  }

  public Moves[] getMoveList(){
    return moveList;
  }
  public Moves getMove(int i){
    return moveList[1];
  }
  public int getHP(){
    return HP;
  }
  public int getCurrentHP(){
    return currentHP;
  }
  public int getSpeed(){
    return speed;
  }
  public int getEvasiveness(){
    return evasiveness;
  }
  public int getAccuracy(){
    return accuracy;
  }
  public int getAttack(){
    return attack;
  }
  public int getDefense(){
    return defense;
  }
  public String getType1(){
    return type1;
  }
  public String getType2(){
    return type2;
  }
  public boolean getIsAlive(){
    return isAlive;
  }

  public void takeDam(int h){
    currentHP -= h;
    if (currentHP <= 0){
      isAlive = false;
    }
  }
}
