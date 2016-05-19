public class Player extends Character{
  private Moves ts = new Moves(40, "Electric", "Thunder Shock");
  private Moves g = new Moves(20, "Electric", "Thunder Wave");
  private Moves[] pikaMoves = {ts, g};

  private Moves t = new Moves(50, "Normal", "Tackle");
  private Moves v = new Moves(35, "Grass", "Vine Whip");
  private Moves[] bulbaMoves = {t, v};

  private Moves s = new Moves(40, "Normal", "Scratch");
  private Moves e = new Moves(40, "Fire", "Ember");
  private Moves[] charMoves = {s, e};

  private Moves b = new Moves(20, "Water". "Bubble");
  private Moves w = new Moves(40, "Water", "Water Gun");
  private Moves[] squirtMoves = {t, b, w};

  private BattleMons Pikachu = new BattleMons(pikaMoves, 35, 15, 90, 55, 40, "Pikachu", "Electric", null, true);
  private BattleMons Bulbasaur = new BattleMons(bulbaMoves, 45, 15, 45, 49, 49, "Bulbasaur", "Grass", null, true);
  private BattleMons Charmander = new BattleMons(charMoves, 39, 15, 65, 49, 49, "Charmander", "Fire", null, true);
  private BattleMons Squirtle = new BattleMons(squirtMoves, 44, 15, 43, 48, 65, "Squirtle", "Water", null, true);

  private BattleMons[] playerMons = new BattleMons(Pikachu, Bulbasaur, Charmander, Squirtle);

  public Player(){
    super("You", playerMons);
  }
}
