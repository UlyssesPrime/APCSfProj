public class Character{
  private String name;
  private BattleMons[] mons;

  public Character(){
    name = "";
    mons = new BattleMons[0];
  }
  public Character(String n, BattleMons[] b){
    name = n;
    mons = b;
  }
  public String getName(){
    return name;
  }
  public BattleMons getBattleMon(int i){
    return mons[i];
  }
  public BattleMons[] getAllMons(){
    return mons;
  }

  public void setName(String n){
    name = n;
  }
}
