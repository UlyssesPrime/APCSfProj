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
  public BattleMons

  public void setName(String n){
    name = n;
  }

  public boolean allMonsAlive(){
    int temp = 0;
    for (int i = 0; i < mons.length(); i++){
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
}
