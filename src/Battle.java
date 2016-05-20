public class Battle{
  private final String[] attackMessages = {"It's Super Effective!", "It's Not Very Effective.", "It Had No Effect..."};
  private final String[] types = {"Bug", "Dragon", "Electric", "Fighting", "Fire", "Flying", "Ghost", "Grass", "Ground", "Ice", "Normal", "Poison", "Psychic", "Rock", "Water"};
  private final String[] battleMessages = {};
  //http://bulbapedia.bulbagarden.net/wiki/Damage#Damage_formula
  public double generateModifier(Moves move, BattleMons user, BattleMons defender, double effect){
    double rand = 0;
    boolean stab = false;
    double modifier = 1;

    if (user.getType1().equals(move.getType()) || user.getType2().equals(move.getType())){
      stab = true;
    }

    while (!(rand >= 0.85 && rand <= 1.00)){
      rand = Math.random() + 0.01;
    }
    if (user.getType1().equals(move.getType()) || user.getType2().equals(move.getType())){
      modifier = 1.5 * effect * rand;
    }
    else if (stab = false){
      modifier = effect * rand;
    }
    return modifier;
  }

  public int generateDamage(int base, int attack, int defense, double modifier){
    int damage = (int) ((((2 * 15 + 10) / 250) * (attack / defense) * base + 2) * modifier);
    System.out.println(damage + " this");
    return damage;
  }

  /*public void dropStatStage(StatusMoves move, BattleMons defender){
    if (move.getStat().equals("Accuracy")){
      if (move.getDam() < 0){

      }
    }
  }*/

  /* To be used when attacking an enemy's BattleMon */
  public void useMove(Moves move, BattleMons user, BattleMons defender){
    if (move.getType().equals(types[4]) && defender.getType1().equals(types[0]) || defender.getType2().equals(types[0])){
      System.out.println(attackMessages[0]);
      System.out.println();
      defender.takeDam(generateDamage(move.getDam(), user.getAttack(), defender.getDefense(), this.generateModifier(move, user, defender, 2)));
    }
    else if (move.getType().equals(types[5]) && defender.getType1().equals(types[0]) || defender.getType2().equals(types[0])){
      System.out.println(attackMessages[0]);
      System.out.println();
      defender.takeDam(generateDamage(move.getDam(),  user.getAttack(), defender.getDefense(), this.generateModifier(move, user, defender, 2)));
    }
    else if (move.getType().equals(types[7]) && defender.getType1().equals(types[0]) || defender.getType2().equals(types[0])){
      System.out.println(attackMessages[1]);
      System.out.println();
      defender.takeDam(generateDamage(move.getDam(),  user.getAttack(), defender.getDefense(), this.generateModifier(move, user, defender, 0.5)));
    }
    else if (move.getType().equals(types[11]) && defender.getType1().equals(types[0]) || defender.getType2().equals(types[0])){
      System.out.println(attackMessages[0]);
      System.out.println();
      defender.takeDam(generateDamage(move.getDam(),  user.getAttack(), defender.getDefense(), this.generateModifier(move, user, defender, 2)));
    }
    else if (move.getType().equals(types[13]) && defender.getType1().equals(types[0]) || defender.getType2().equals(types[0])){
      System.out.println(attackMessages[0]);
      System.out.println();
      defender.takeDam(generateDamage(move.getDam(),  user.getAttack(), defender.getDefense(), this.generateModifier(move, user, defender, 2)));
    }
    else if (move.getType().equals(types[9]) && defender.getType1().equals(types[1]) || defender.getType2().equals(types[1])){
      System.out.println(attackMessages[0]);
      System.out.println();
      defender.takeDam(generateDamage(move.getDam(),  user.getAttack(), defender.getDefense(), this.generateModifier(move, user, defender, 2)));
    }
    else if (move.getType().equals(types[2]) && defender.getType1().equals(types[2]) || defender.getType2().equals(types[2])){
      System.out.println(attackMessages[1]);
      System.out.println();
      defender.takeDam(generateDamage(move.getDam(),  user.getAttack(), defender.getDefense(), this.generateModifier(move, user, defender, 0.5)));
    }
    else if (move.getType().equals(types[5]) && defender.getType1().equals(types[2]) || defender.getType2().equals(types[2])){
      System.out.println(attackMessages[1]);
      System.out.println();
      defender.takeDam(generateDamage(move.getDam(),  user.getAttack(), defender.getDefense(), this.generateModifier(move, user, defender, 0.5)));
    }
    else if (move.getType().equals(types[8]) && defender.getType1().equals(types[2]) || defender.getType2().equals(types[2])){
      System.out.println(attackMessages[0]);
      System.out.println();
      defender.takeDam(generateDamage(move.getDam(),  user.getAttack(), defender.getDefense(), this.generateModifier(move, user, defender, 2)));
    }
    else if (move.getType().equals(types[5]) && defender.getType1().equals(types[3]) || defender.getType2().equals(types[3])){
      System.out.println(attackMessages[0]);
      System.out.println();
      defender.takeDam(generateDamage(move.getDam(),  user.getAttack(), defender.getDefense(), this.generateModifier(move, user, defender, 2)));
    }
    else if (move.getType().equals(types[12]) && defender.getType1().equals(types[3]) || defender.getType2().equals(types[3])){
      System.out.println(attackMessages[0]);
      System.out.println();
      defender.takeDam(generateDamage(move.getDam(),  user.getAttack(), defender.getDefense(), this.generateModifier(move, user, defender, 2)));
    }
    else if (move.getType().equals(types[13]) && defender.getType1().equals(types[3]) || defender.getType2().equals(types[3])){
      System.out.println(attackMessages[1]);
      System.out.println();
      defender.takeDam(generateDamage(move.getDam(),  user.getAttack(), defender.getDefense(), this.generateModifier(move, user, defender, 0.5)));
    }
    else if (move.getType().equals(types[0]) && defender.getType1().equals(types[4]) || defender.getType2().equals(types[4])){
      System.out.println(attackMessages[1]);
      System.out.println();
      defender.takeDam(generateDamage(move.getDam(),  user.getAttack(), defender.getDefense(), this.generateModifier(move, user, defender, 0.5)));
    }
    else if (move.getType().equals(types[7]) && defender.getType1().equals(types[4]) || defender.getType2().equals(types[4])){
      System.out.println(attackMessages[1]);
      System.out.println();
      defender.takeDam(generateDamage(move.getDam(),  user.getAttack(), defender.getDefense(), this.generateModifier(move, user, defender, 0.5)));
    }
    else if (move.getType().equals(types[8]) && defender.getType1().equals(types[4]) || defender.getType2().equals(types[4])){
      System.out.println(attackMessages[0]);
      System.out.println();
      defender.takeDam(generateDamage(move.getDam(),  user.getAttack(), defender.getDefense(), this.generateModifier(move, user, defender, 2)));
    }
    else if (move.getType().equals(types[13]) && defender.getType1().equals(types[4]) || defender.getType2().equals(types[4])){
      System.out.println(attackMessages[0]);
      System.out.println();
      defender.takeDam(generateDamage(move.getDam(),  user.getAttack(), defender.getDefense(), this.generateModifier(move, user, defender, 2)));
    }
    else if (move.getType().equals(types[14]) && defender.getType1().equals(types[4]) || defender.getType2().equals(types[4])){
      System.out.println(attackMessages[0]);
      System.out.println();
      defender.takeDam(generateDamage(move.getDam(),  user.getAttack(), defender.getDefense(), this.generateModifier(move, user, defender, 2)));
    }
    else if (move.getType().equals(types[0]) && defender.getType1().equals(types[5]) || defender.getType2().equals(types[5])){
      System.out.println(attackMessages[1]);
      System.out.println();
      defender.takeDam(generateDamage(move.getDam(),  user.getAttack(), defender.getDefense(), this.generateModifier(move, user, defender, 0.5)));
    }
    else if (move.getType().equals(types[2]) && defender.getType1().equals(types[5]) || defender.getType2().equals(types[5])){
      System.out.println(attackMessages[0]);
      System.out.println();
      defender.takeDam(generateDamage(move.getDam(),  user.getAttack(), defender.getDefense(), this.generateModifier(move, user, defender, 2)));
    }
    else if (move.getType().equals(types[3]) && defender.getType1().equals(types[5]) || defender.getType2().equals(types[5])){
      System.out.println(attackMessages[1]);
      System.out.println();
      defender.takeDam(generateDamage(move.getDam(),  user.getAttack(), defender.getDefense(), this.generateModifier(move, user, defender, 0.5)));
    }
    else if (move.getType().equals(types[7]) && defender.getType1().equals(types[5]) || defender.getType2().equals(types[5])){
      System.out.println(attackMessages[1]);
      System.out.println();
      defender.takeDam(generateDamage(move.getDam(),  user.getAttack(), defender.getDefense(), this.generateModifier(move, user, defender, 0.5)));
    }
    else if (move.getType().equals(types[7]) && defender.getType1().equals(types[7]) || defender.getType2().equals(types[7])){
      System.out.println(attackMessages[1]);
      System.out.println();
      defender.takeDam(generateDamage(move.getDam(),  user.getAttack(), defender.getDefense(), this.generateModifier(move, user, defender, 0.5)));
    }
    else if (move.getType().equals(types[7]) && defender.getType1().equals(types[8]) || defender.getType2().equals(types[8])){
      System.out.println(attackMessages[0]);
      System.out.println();
      defender.takeDam(generateDamage(move.getDam(),  user.getAttack(), defender.getDefense(), this.generateModifier(move, user, defender, 2)));
    }
    else if (move.getType().equals(types[7]) && defender.getType1().equals(types[11]) || defender.getType2().equals(types[11])){
      System.out.println(attackMessages[1]);
      System.out.println();
      defender.takeDam(generateDamage(move.getDam(),  user.getAttack(), defender.getDefense(), this.generateModifier(move, user, defender, 0.5)));
    }
    else if (move.getType().equals(types[7]) && defender.getType1().equals(types[13]) || defender.getType2().equals(types[13])){
      System.out.println(attackMessages[0]);
      System.out.println();
      defender.takeDam(generateDamage(move.getDam(),  user.getAttack(), defender.getDefense(), this.generateModifier(move, user, defender, 2)));
    }
    else if (move.getType().equals(types[7]) && defender.getType1().equals(types[14]) || defender.getType2().equals(types[14])){
      System.out.println(attackMessages[0]);
      System.out.println();
      defender.takeDam(generateDamage(move.getDam(),  user.getAttack(), defender.getDefense(), this.generateModifier(move, user, defender, 2)));
    }
    else if (move.getType().equals(types[8]) && defender.getType1().equals(types[2]) || defender.getType2().equals(types[2])){
      System.out.println(attackMessages[0]);
      System.out.println();
      defender.takeDam(generateDamage(move.getDam(),  user.getAttack(), defender.getDefense(), this.generateModifier(move, user, defender, 2)));
    }
    else if (move.getType().equals(types[8]) && defender.getType1().equals(types[4]) || defender.getType2().equals(types[4])){
      System.out.println(attackMessages[0]);
      System.out.println();
      defender.takeDam(generateDamage(move.getDam(),  user.getAttack(), defender.getDefense(), this.generateModifier(move, user, defender, 2)));
    }
    else if (move.getType().equals(types[8]) && defender.getType1().equals(types[5]) || defender.getType2().equals(types[5])){
      System.out.println(attackMessages[2]);
      System.out.println();
    }
    else if (move.getType().equals(types[8]) && defender.getType1().equals(types[7]) || defender.getType2().equals(types[7])){
      System.out.println(attackMessages[1]);
      System.out.println();
      defender.takeDam(generateDamage(move.getDam(),  user.getAttack(), defender.getDefense(), this.generateModifier(move, user, defender, 0.5)));
    }
    else if (move.getType().equals(types[8]) && defender.getType1().equals(types[11]) || defender.getType2().equals(types[11])){
      System.out.println(attackMessages[0]);
      System.out.println();
      defender.takeDam(generateDamage(move.getDam(),  user.getAttack(), defender.getDefense(), this.generateModifier(move, user, defender, 2)));
    }
    else if (move.getType().equals(types[8]) && defender.getType1().equals(types[13]) || defender.getType2().equals(types[13])){
      System.out.println(attackMessages[0]);
      System.out.println();
      defender.takeDam(generateDamage(move.getDam(),  user.getAttack(), defender.getDefense(), this.generateModifier(move, user, defender, 2)));
    }
    else if (move.getType().equals(types[9]) && defender.getType1().equals(types[1]) || defender.getType2().equals(types[1])){
      System.out.println(attackMessages[0]);
      System.out.println();
      defender.takeDam(generateDamage(move.getDam(),  user.getAttack(), defender.getDefense(), this.generateModifier(move, user, defender, 2)));
    }
    else if (move.getType().equals(types[9]) && defender.getType1().equals(types[5]) || defender.getType2().equals(types[5])){
      System.out.println(attackMessages[0]);
      System.out.println();
      defender.takeDam(generateDamage(move.getDam(),  user.getAttack(), defender.getDefense(), this.generateModifier(move, user, defender, 2)));
    }
    else if (move.getType().equals(types[9]) && defender.getType1().equals(types[8]) || defender.getType2().equals(types[8])){
      System.out.println(attackMessages[0]);
      System.out.println();
      defender.takeDam(generateDamage(move.getDam(),  user.getAttack(), defender.getDefense(), this.generateModifier(move, user, defender, 2)));
    }
    else if (move.getType().equals(types[9]) && defender.getType1().equals(types[9]) || defender.getType2().equals(types[9])){
      System.out.println(attackMessages[1]);
      System.out.println();
      defender.takeDam(generateDamage(move.getDam(),  user.getAttack(), defender.getDefense(), this.generateModifier(move, user, defender, 0.5)));
    }
    else if (move.getType().equals(types[9]) && defender.getType1().equals(types[14]) || defender.getType2().equals(types[14])){
      System.out.println(attackMessages[1]);
      System.out.println();
      defender.takeDam(generateDamage(move.getDam(),  user.getAttack(), defender.getDefense(), this.generateModifier(move, user, defender, 0.5)));
    }
    else if (move.getType().equals(types[10]) && defender.getType1().equals(types[6]) || defender.getType2().equals(types[6])){
      System.out.println(attackMessages[2]);
      System.out.println();
    }
    else if (move.getType().equals(types[11]) && defender.getType1().equals(types[0]) || defender.getType2().equals(types[0])){
      System.out.println(attackMessages[0]);
      System.out.println();
      defender.takeDam(generateDamage(move.getDam(),  user.getAttack(), defender.getDefense(), this.generateModifier(move, user, defender, 2)));
    }
    else if (move.getType().equals(types[11]) && defender.getType1().equals(types[7]) || defender.getType2().equals(types[7])){
      System.out.println(attackMessages[0]);
      System.out.println();
      defender.takeDam(generateDamage(move.getDam(),  user.getAttack(), defender.getDefense(), this.generateModifier(move, user, defender, 2)));
    }
    else if (move.getType().equals(types[11]) && defender.getType1().equals(types[8]) || defender.getType2().equals(types[8])){
      System.out.println(attackMessages[1]);
      System.out.println();
      defender.takeDam(generateDamage(move.getDam(),  user.getAttack(), defender.getDefense(), this.generateModifier(move, user, defender, 0.5)));
    }
    else if (move.getType().equals(types[11]) && defender.getType1().equals(types[11]) || defender.getType2().equals(types[11])){
      System.out.println(attackMessages[1]);
      System.out.println();
      defender.takeDam(generateDamage(move.getDam(),  user.getAttack(), defender.getDefense(), this.generateModifier(move, user, defender, 0.5)));
    }
    else if (move.getType().equals(types[11]) && defender.getType1().equals(types[13]) || defender.getType2().equals(types[13])){
      System.out.println(attackMessages[1]);
      System.out.println();
      defender.takeDam(generateDamage(move.getDam(),  user.getAttack(), defender.getDefense(), this.generateModifier(move, user, defender, 0.5)));
    }
    else if (move.getType().equals(types[12]) && defender.getType1().equals(types[3]) || defender.getType2().equals(types[3])){
      System.out.println(attackMessages[0]);
      System.out.println();
      defender.takeDam(generateDamage(move.getDam(),  user.getAttack(), defender.getDefense(), this.generateModifier(move, user, defender, 2)));
    }
    else if (move.getType().equals(types[12]) && defender.getType1().equals(types[11]) || defender.getType2().equals(types[11])){
      System.out.println(attackMessages[0]);
      System.out.println();
      defender.takeDam(generateDamage(move.getDam(),  user.getAttack(), defender.getDefense(), this.generateModifier(move, user, defender, 2)));
    }
    else if (move.getType().equals(types[12]) && defender.getType1().equals(types[12]) || defender.getType2().equals(types[12])){
      System.out.println(attackMessages[1]);
      System.out.println();
      defender.takeDam(generateDamage(move.getDam(),  user.getAttack(), defender.getDefense(), this.generateModifier(move, user, defender, 0.5)));
    }
    else if (move.getType().equals(types[13]) && defender.getType1().equals(types[0]) || defender.getType2().equals(types[0])){
      System.out.println(attackMessages[0]);
      System.out.println();
      defender.takeDam(generateDamage(move.getDam(),  user.getAttack(), defender.getDefense(), this.generateModifier(move, user, defender, 2)));
    }
    else if (move.getType().equals(types[13]) && defender.getType1().equals(types[3]) || defender.getType2().equals(types[3])){
      System.out.println(attackMessages[1]);
      System.out.println();
      defender.takeDam(generateDamage(move.getDam(),  user.getAttack(), defender.getDefense(), this.generateModifier(move, user, defender, 0.5)));
    }
    else if (move.getType().equals(types[13]) && defender.getType1().equals(types[4]) || defender.getType2().equals(types[4])){
      System.out.println(attackMessages[0]);
      System.out.println();
      defender.takeDam(generateDamage(move.getDam(),  user.getAttack(), defender.getDefense(), this.generateModifier(move, user, defender, 2)));
    }
    else if (move.getType().equals(types[13]) && defender.getType1().equals(types[5]) || defender.getType2().equals(types[5])){
      System.out.println(attackMessages[0]);
      System.out.println();
      defender.takeDam(generateDamage(move.getDam(),  user.getAttack(), defender.getDefense(), this.generateModifier(move, user, defender, 2)));
    }
    else if (move.getType().equals(types[13]) && defender.getType1().equals(types[9]) || defender.getType2().equals(types[9])){
      System.out.println(attackMessages[0]);
      System.out.println();
      defender.takeDam(generateDamage(move.getDam(),  user.getAttack(), defender.getDefense(), this.generateModifier(move, user, defender, 2)));
    }
    else if (move.getType().equals(types[13]) && defender.getType1().equals(types[13]) || defender.getType2().equals(types[13])){
      System.out.println(attackMessages[1]);
      System.out.println();
      defender.takeDam(generateDamage(move.getDam(),  user.getAttack(), defender.getDefense(), this.generateModifier(move, user, defender, 0.5)));
    }
    else if (move.getType().equals(types[14]) && defender.getType1().equals(types[4]) || defender.getType2().equals(types[4])){
      System.out.println(attackMessages[0]);
      System.out.println();
      defender.takeDam(generateDamage(move.getDam(),  user.getAttack(), defender.getDefense(), this.generateModifier(move, user, defender, 2)));
    }
    else if (move.getType().equals(types[14]) && defender.getType1().equals(types[7]) || defender.getType2().equals(types[7])){
      System.out.println(attackMessages[1]);
      System.out.println();
      defender.takeDam(generateDamage(move.getDam(),  user.getAttack(), defender.getDefense(), this.generateModifier(move, user, defender, 0.5)));
    }
    else if (move.getType().equals(types[14]) && defender.getType1().equals(types[8]) || defender.getType2().equals(types[8])){
      System.out.println(attackMessages[0]);
      System.out.println();
      defender.takeDam(generateDamage(move.getDam(),  user.getAttack(), defender.getDefense(), this.generateModifier(move, user, defender, 2)));
    }
    else if (move.getType().equals(types[14]) && defender.getType1().equals(types[9]) || defender.getType2().equals(types[9])){
      System.out.println(attackMessages[1]);
      System.out.println();
      defender.takeDam(generateDamage(move.getDam(),  user.getAttack(), defender.getDefense(), this.generateModifier(move, user, defender, 0.5)));
    }
    else if (move.getType().equals(types[14]) && defender.getType1().equals(types[13]) || defender.getType2().equals(types[13])){
      System.out.println(attackMessages[0]);
      System.out.println();
      defender.takeDam(generateDamage(move.getDam(),  user.getAttack(), defender.getDefense(), this.generateModifier(move, user, defender, 2)));
    }
  }
  private int n;
  public Battle(){
    n = 3;
  }
}
