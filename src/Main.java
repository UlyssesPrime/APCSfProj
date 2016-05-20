import java.util.*;
public class Main{
  public static Scanner in = new Scanner(System.in);

  private static Moves ts = new Moves(40, "Electric", "Thunder Shock");
  private static Moves tw = new Moves(20, "Electric", "Thunder Wave");
  private static Moves[] pikaMoves = {ts, tw};

  private static Moves t = new Moves(50, "Normal", "Tackle");
  private static Moves v = new Moves(35, "Grass", "Vine Whip");
  private static Moves[] bulbaMoves = {t, v};

  private static Moves sc = new Moves(40, "Normal", "Scratch");
  private static Moves e = new Moves(40, "Fire", "Ember");
  private static Moves[] charMoves = {sc, e};

  private static Moves b = new Moves(20, "Water", "Bubble");
  private static Moves w = new Moves(40, "Water", "Water Gun");
  private static Moves[] squirtMoves = {t, b, w};

  private static BattleMons Pikachu = new BattleMons(pikaMoves, 35, 15, 90, 55, 40, "Pikachu", "Electric", "None", true);
  private static BattleMons Bulbasaur = new BattleMons(bulbaMoves, 45, 15, 45, 49, 49, "Bulbasaur", "Grass", "None", true);
  private static BattleMons Charmander = new BattleMons(charMoves, 39, 15, 65, 49, 49, "Charmander", "Fire", "None", true);
  private static BattleMons Squirtle = new BattleMons(squirtMoves, 44, 15, 43, 48, 65, "Squirtle", "Water", "None", true);

  private static BattleMons[] playerMons = {Pikachu, Bulbasaur, Charmander, Squirtle};

  private static Moves p = new Moves(35, "Flying", "Peck");
  private static Moves fa = new Moves(15, "Normal", "Fury Attack");
  private static Moves[] spearMoves = {p, fa};

  private static Moves ta = new Moves(50, "Normal", "Tackle");
  private static Moves hf = new Moves(80, "Normal", "Hyper Fang");
  private static Moves[] ratMoves = {ta, hf};

  private static Moves s = new Moves(40, "Normal", "Scratch");
  private static Moves[] sandMoves = {s};

  private static Moves[] eeMoves = {t};

  private static BattleMons Spearow = new BattleMons(spearMoves, 40, 15, 70, 60, 30, "Spearow", "Normal", "Flying", true);
  private static BattleMons Rattata = new BattleMons(ratMoves, 30, 15, 72, 56, 35, "Rattata", "Normal", "None", true);
  private static BattleMons Sandshrew = new BattleMons(sandMoves, 50, 15, 40, 75, 85, "Sandshrew", "Ground", "None", true);
  private static BattleMons Eevee = new BattleMons(eeMoves, 55, 15, 55, 55, 50, "Eevee", "Normal", "None", true);

  private static BattleMons[] zachMons = {Spearow, Rattata, Sandshrew, Eevee};

  public static Player pc = new Player(playerMons);
  public static ZachPines zach = new ZachPines(zachMons);

  public static int zMon = 0;
  public static int pMon = 0;

  public static boolean winLose = true;

  public static Battle bat = new Battle();

  public static boolean allMonsAlive(BattleMons[] mons){
    int temp = 0;
    for (int i = 0; i < mons.length; i++){
      if (mons[i].getIsAlive() == true){
        temp += 1;
      }
    }
    if (temp > 0){
      return true;
    }
    else{
      return false;
    }
  }

  public static int enemyUseMove(){
    int temp = (int) (Math.random() * 4);
    return temp;
  }

  public static void showAvailableMoves(){
    int temp = 0;
    for (int i = 0; i < playerMons[pMon].getMoveList().length; i++){
      temp = i;
      System.out.print(temp + ") " + playerMons[pMon].getMove(i).getName() + " ");
    }
    System.out.println();
  }

  public static void main(String[] args){
    System.out.println(zach.getName() + " has challenged " + pc.getName() + " to a battle!");
    try {Thread.sleep(1250);} catch (InterruptedException ex){}
    System.out.println("Zach says: " + zach.zachSayings[0]);
    try {Thread.sleep(1250);} catch (InterruptedException ex){}
    System.out.println(zach.getName() + " sends out " + zach.getBattleMon(zMon).getName() + ".");
    try {Thread.sleep(1250);} catch (InterruptedException ex){}
    System.out.println(pc.getName() + " send out " + pc.getBattleMon(pMon).getName() + ".");
    try {Thread.sleep(1250);} catch (InterruptedException ex){}

    while (allMonsAlive(playerMons) == true && allMonsAlive(zachMons) == true){
      if (zachMons[zMon].getIsAlive() == false){
        zMon++;
        System.out.println(zach.getName() + "'s BattleMon has died!'");
        try {Thread.sleep(1250);} catch (InterruptedException ex){}
        System.out.println(zach.getName() + " sends out " + zachMons[zMon].getName() + "!");
        try {Thread.sleep(1250);} catch (InterruptedException ex){}
      }
      else if (playerMons[pMon].getIsAlive() == false){
        pMon++;
        System.out.println("Your BattleMon has died!");
        try {Thread.sleep(1250);} catch (InterruptedException ex){}
        System.out.println("You send out " + playerMons[pMon].getName() + "!");
        try {Thread.sleep(1250);} catch (InterruptedException ex){}
      }
      System.out.println("What move will you use? (HINT: Only say \"moves\" to get moves or say a number to use a move)");
      String useWhat = in.nextLine();
      if (useWhat.toLowerCase().contains("moves")){
        showAvailableMoves();
        continue;
      }
      int temp = Integer.parseInt(useWhat);
      if (temp >= 0 && temp < playerMons[pMon].getMoveList().length){
        if (zachMons[zMon].getSpeed() > playerMons[pMon].getSpeed()){
          bat.useMove(zachMons[zMon].getMove(enemyUseMove()), zachMons[zMon], playerMons[pMon]);
          bat.useMove(playerMons[pMon].getMove(temp), playerMons[pMon], zachMons[zMon]);
        }
        else {
          bat.useMove(playerMons[pMon].getMove(temp), playerMons[pMon], zachMons[zMon]);
          bat.useMove(zachMons[zMon].getMove(enemyUseMove()), zachMons[zMon], playerMons[pMon]);
        }
      }
      else if (useWhat.toLowerCase().equals("kill all")){
        for (int i = 0; i < 4; i++){
          zachMons[i].setIsAlive(false);
        }
      }
      else {
        System.out.println("Not a valid response.");
      }
    }
  }
}
