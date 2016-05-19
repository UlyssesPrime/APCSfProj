public class ZachPines extends Character{
  public final String[] zachSayings = {"Ha! You think you can beat me? You'll lose for sure!", "WHAT?! HOW COULD THIS HAPPEN?! I LOST?!"};

  private Moves p = new Moves(35, "Flying", "Peck");
  private Moves fa = new Moves(15, "Normal", "Fury Attack");
  private Moves[] spearMoves = {p, fa};

  private Moves t = new Moves(50, "Normal", "Tackle");
  private Moves hf = new Moves(80, "Normal", "Hyper Fang");
  private Moves[] ratMoves = {t, hf};

  private Moves s = new Moves(40, "Normal", "Scratch");
  private Moves[] sandMoves = {s};

  private Moves[] eeMoves = {t};

  private BattleMons Spearow = new BattleMons(spearMoves, 40, 15, 70, 60, 30, "Spearow", "Normal", "Flying", true);
  private BattleMons Rattata = new BattleMons(ratMoves, 30, 15, 72, 56, 35, "Rattata", "Normal", null, true);
  private BattleMons Sandshrew = new BattleMons(sandMoves, 50, 15, 40, 75, 85, "Sandshrew", "Ground", null, true);
  private BattleMons Eevee = new BattleMons(eeMoves, 55, 15, 55, 55, 50, "Eevee", "Normal", null, true);

  private BattleMons[] zachMons = {Spearow, Rattata, Sandshrew, Eevee};

  public ZachPines(){
    super("Zach Pines", zachMons);
  }

}
