public class Moves{
  private int dam; //how much damage is dealt
  private String type; //attack type
  private String name;

  public Moves(){
    dam = 0;
    type = "";
    name = "";
  }
  public Moves(int d, String t, String n){
    dam = d;
    type = t;
    name = n;
  }

  public int getDam(){
    return dam;
  }
  public String getType(){
    return type;
  }
  public String getName(){
    return name;
  }
}
