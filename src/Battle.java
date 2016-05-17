public class Battle{
  private final String[] attackMessages = {"It's Super Effective!", "It's Not Very Effective.", "It Had No Effect..."};
  private final String[] types = {"Bug", "Dragon", "Electric", "Fighting", "Fire", "Flying", "Ghost", "Grass", "Ground", "Ice", "Normal", "Poison", "Psychic", "Rock", "Water"};
  private final String[] battleMessages = {};
  //http://bulbapedia.bulbagarden.net/wiki/Damage#Damage_formula
  public double generateModifier(boolean stab, Moves move, BattleMons user, BattleMons defender, int matchup){
    double rand = 0;
    while (!(rand >= 0.85 && rand <= 1.00)){
      rand = Math.random() + 0.01;
    }
    if (stab = true){
      double modifier = 1.5 *  * rand;
    }
    else if(stab = false){

    }
  }

  public int generateDamage(int base, int attack, int defense, double modifier){
    int damage = Math.round((((2 * 15) / 250) * (attack / defense) * base + 2) * modifier);
    return damage;
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
