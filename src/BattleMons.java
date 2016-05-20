public class BattleMons{
  private Moves[] moveList; //List of Moves available
  private int HP; //
  private int currentHP;
  private int level;
  private int speed;
  private int attack;
  private int defense;
  private String name;
  private String type1;
  private String type2;
  private boolean isAlive;

  public BattleMons(){
    moveList = new Moves[0];
    HP = 0;
    currentHP = 0;
    level = 0;
    speed = 0;
    attack = 0;
    defense = 0;
    name = "";
    type1 = "";
    type2 = "";
    isAlive = false;
  }
  public BattleMons(Moves[] m, int h, int l, int s, int at, int d, String n, String t1, String t2, boolean i){
    moveList = m;
    HP = h;
    currentHP = HP;
    level = l;
    speed = s;
    attack = at;
    defense = d;
    name = n;
    type1 = t1;
    type2 = t2;
    isAlive = i;
  }

  public Moves[] getMoveList(){
    return moveList;
  }
  public Moves getMove(int i){
    return moveList[i];
  }
  public int getHP(){
    return HP;
  }
  public int getCurrentHP(){
    return currentHP;
  }
  public int getLevel(){
    return level;
  }
  public int getSpeed(){
    return speed;
  }
  public int getAttack(){
    return attack;
  }
  public int getDefense(){
    return defense;
  }
  public String getName(){
    return name;
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

  public void setCurrentHP(int h){
    currentHP = h;
  }
  public void setSpeed(int s){
    speed = s;
  }
  public void setAttack(int a){
    attack = a;
  }
  public void setDefense(int d){
    defense = d;
  }
  public void setIsAlive(boolean i){
    isAlive = i;
  }

  public void takeDam(int h){
    currentHP -= h;
    if (currentHP <= 0){
      isAlive = false;
    }
  }
}
