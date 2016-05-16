public class BattleMons{
  private final String[] attackMessages = {"It's Super Effective!", "It's Not Very Effective.", "It Had No Effect..."};
  private final String[] types = {"Bug", "Dragon", "Electric", "Fighting", "Fire", "Flying", "Ghost", "Grass", "Ground", "Ice", "Normal", "Poison", "Psychic", "Rock", "Water"};

  private Moves[] moveList; //List of Moves available
  private int HP; //
  private int currentHP;
  private int level;
  private int speed;
  private int evasiveness;
  private int accuracy;
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
    evasiveness = 0;
    accuracy = 0;
    attack = 0;
    defense = 0;
    name = "";
    type1 = "";
    type2 = "";
    isAlive = false;
  }
  public BattleMons(Moves[] m, int h, int l, int s, int e, int ac, int at, int d, String n, String t1, String t2, boolean i){
    moveList = m;
    HP = h;
    currentHP = HP;
    level = l;
    speed = s;
    evasiveness = e;
    accuracy = ac;
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
    return moveList[1];
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

  public void takeDam(int h){
    currentHP -= h;
    if (currentHP <= 0){
      isAlive = false;
    }
  }

  /* To be used when attacking an enemy's BattleMon */
  public void useMove(Moves m, BattleMons opp){
    if (m.getType().equals(types[4]) && opp.getType1().equals(types[0]) || opp.getType2().equals(types[0])){
      System.out.println(attackMessages[1]);
      System.out.println();
      opp.takeDam(generateDamage(m.getDam(), opp.getLevel(), opp.getAttack(), opp.getDefense(), moves.generateDamage())); //changes in progress
    }
    else if (m.getType().equals(types[5]) && opp.getType1().equals(types[0]) || opp.getType2().equals(types[0])){
      System.out.println(attackMessages[1]);
      System.out.println();
      opp.takeDam(generateDamage(m.getDam(), opp.getLevel(), opp.getAttack(), opp.getDefense()) * 2);
    }
    else if (m.getType().equals(types[7]) && opp.getType1().equals(types[0]) || opp.getType2().equals(types[0])){
      System.out.println(attackMessages[2]);
      System.out.println();
      opp.takeDam(generateDamage(m.getDam(), opp.getLevel(), opp.getAttack(), opp.getDefense()) / 2);
    }
    else if (m.getType().equals(types[11]) && opp.getType1().equals(types[0]) || opp.getType2().equals(types[0])){
      System.out.println(attackMessages[1]);
      System.out.println();
      opp.takeDam(generateDamage(m.getDam(), opp.getLevel(), opp.getAttack(), opp.getDefense()) * 2);
    }
    else if (m.getType().equals(types[13]) && opp.getType1().equals(types[0]) || opp.getType2().equals(types[0])){
      System.out.println(attackMessages[1]);
      System.out.println();
      opp.takeDam(generateDamage(m.getDam(), opp.getLevel(), opp.getAttack(), opp.getDefense()) * 2);
    }
    else if (m.getType().equals(types[9]) && opp.getType1().equals(types[1]) || opp.getType2().equals(types[1])){
      System.out.println(attackMessages[1]);
      System.out.println();
      opp.takeDam(generateDamage(m.getDam(), opp.getLevel(), opp.getAttack(), opp.getDefense()) * 2);
    }
    else if (m.getType().equals(types[2]) && opp.getType1().equals(types[2]) || opp.getType2().equals(types[2])){
      System.out.println(attackMessages[2]);
      System.out.println();
      opp.takeDam(generateDamage(m.getDam(), opp.getLevel(), opp.getAttack(), opp.getDefense()) / 2);
    }
    else if (m.getType().equals(types[5]) && opp.getType1().equals(types[2]) || opp.getType2().equals(types[2])){
      System.out.println(attackMessages[2]);
      System.out.println();
      opp.takeDam(generateDamage(m.getDam(), opp.getLevel(), opp.getAttack(), opp.getDefense()) / 2);
    }
    else if (m.getType().equals(types[8]) && opp.getType1().equals(types[2]) || opp.getType2().equals(types[2])){
      System.out.println(attackMessages[1]);
      System.out.println();
      opp.takeDam(generateDamage(m.getDam(), opp.getLevel(), opp.getAttack(), opp.getDefense()) * 2);
    }
    else if (m.getType().equals(types[5]) && opp.getType1().equals(types[3]) || opp.getType2().equals(types[3])){
      System.out.println(attackMessages[1]);
      System.out.println();
      opp.takeDam(generateDamage(m.getDam(), opp.getLevel(), opp.getAttack(), opp.getDefense()) * 2);
    }
    else if (m.getType().equals(types[12]) && opp.getType1().equals(types[3]) || opp.getType2().equals(types[3])){
      System.out.println(attackMessages[1]);
      System.out.println();
      opp.takeDam(generateDamage(m.getDam(), opp.getLevel(), opp.getAttack(), opp.getDefense()) * 2);
    }
    else if (m.getType().equals(types[13]) && opp.getType1().equals(types[3]) || opp.getType2().equals(types[3])){
      System.out.println(attackMessages[2]);
      System.out.println();
      opp.takeDam(generateDamage(m.getDam(), opp.getLevel(), opp.getAttack(), opp.getDefense()) / 2);
    }
    else if (m.getType().equals(types[0]) && opp.getType1().equals(types[4]) || opp.getType2().equals(types[4])){
      System.out.println(attackMessages[2]);
      System.out.println();
      opp.takeDam(generateDamage(m.getDam(), opp.getLevel(), opp.getAttack(), opp.getDefense()) / 2);
    }
    else if (m.getType().equals(types[7]) && opp.getType1().equals(types[4]) || opp.getType2().equals(types[4])){
      System.out.println(attackMessages[2]);
      System.out.println();
      opp.takeDam(generateDamage(m.getDam(), opp.getLevel(), opp.getAttack(), opp.getDefense()) / 2);
    }
    else if (m.getType().equals(types[8]) && opp.getType1().equals(types[4]) || opp.getType2().equals(types[4])){
      System.out.println(attackMessages[1]);
      System.out.println();
      opp.takeDam(generateDamage(m.getDam(), opp.getLevel(), opp.getAttack(), opp.getDefense()) * 2);
    }
    else if (m.getType().equals(types[13]) && opp.getType1().equals(types[4]) || opp.getType2().equals(types[4])){
      System.out.println(attackMessages[1]);
      System.out.println();
      opp.takeDam(generateDamage(m.getDam(), opp.getLevel(), opp.getAttack(), opp.getDefense()) * 2);
    }
    else if (m.getType().equals(types[14]) && opp.getType1().equals(types[4]) || opp.getType2().equals(types[4])){
      System.out.println(attackMessages[1]);
      System.out.println();
      opp.takeDam(generateDamage(m.getDam(), opp.getLevel(), opp.getAttack(), opp.getDefense()) * 2);
    }
    else if (m.getType().equals(types[0]) && opp.getType1().equals(types[5]) || opp.getType2().equals(types[5])){
      System.out.println(attackMessages[2]);
      System.out.println();
      opp.takeDam(generateDamage(m.getDam(), opp.getLevel(), opp.getAttack(), opp.getDefense()) / 2);
    }
    else if (m.getType().equals(types[2]) && opp.getType1().equals(types[5]) || opp.getType2().equals(types[5])){
      System.out.println(attackMessages[1]);
      System.out.println();
      opp.takeDam(generateDamage(m.getDam(), opp.getLevel(), opp.getAttack(), opp.getDefense()) * 2);
    }
    else if (m.getType().equals(types[3]) && opp.getType1().equals(types[5]) || opp.getType2().equals(types[5])){
      System.out.println(attackMessages[2]);
      System.out.println();
      opp.takeDam(generateDamage(m.getDam(), opp.getLevel(), opp.getAttack(), opp.getDefense()) / 2);
    }
    else if (m.getType().equals(types[7]) && opp.getType1().equals(types[5]) || opp.getType2().equals(types[5])){
      System.out.println(attackMessages[2]);
      System.out.println();
      opp.takeDam(generateDamage(m.getDam(), opp.getLevel(), opp.getAttack(), opp.getDefense()) / 2);
    }
    /*else if (m.getType().equals(types[]) && opp.getType1().equals(types[]) || opp.getType2().equals(types[])){
      System.out.println(attackMessages[]);
      System.out.println();
      opp.takeDam(generateDamage(m.getDam(), opp.getLevel(), opp.getAttack(), opp.getDefense())  2);
    }
    else if (m.getType().equals(types[]) && opp.getType1().equals(types[]) || opp.getType2().equals(types[])){
      System.out.println(attackMessages[]);
      System.out.println();
      opp.takeDam(generateDamage(m.getDam(), opp.getLevel(), opp.getAttack(), opp.getDefense())  2);
    }
    else if (m.getType().equals(types[]) && opp.getType1().equals(types[]) || opp.getType2().equals(types[])){
      System.out.println(attackMessages[]);
      System.out.println();
      opp.takeDam(generateDamage(m.getDam(), opp.getLevel(), opp.getAttack(), opp.getDefense())  2);
    }
    else if (m.getType().equals(types[]) && opp.getType1().equals(types[]) || opp.getType2().equals(types[])){
      System.out.println(attackMessages[]);
      System.out.println();
      opp.takeDam(generateDamage(m.getDam(), opp.getLevel(), opp.getAttack(), opp.getDefense())  2);
    }
    else if (m.getType().equals(types[]) && opp.getType1().equals(types[]) || opp.getType2().equals(types[])){
      System.out.println(attackMessages[]);
      System.out.println();
      opp.takeDam(generateDamage(m.getDam(), opp.getLevel(), opp.getAttack(), opp.getDefense())  2);
    }
    else if (m.getType().equals(types[]) && opp.getType1().equals(types[]) || opp.getType2().equals(types[])){
      System.out.println(attackMessages[]);
      System.out.println();
      opp.takeDam(generateDamage(m.getDam(), opp.getLevel(), opp.getAttack(), opp.getDefense())  2);
    } */
  }
}
