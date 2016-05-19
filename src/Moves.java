public class Moves{
  private int dam; //how much damage is dealt
  //private int uses; //how many times it can be used
  //private int num; //position in moveList for the pokemon
  private String type; //attack type
  private String name;

  public Moves(){
    dam = 0;
    //uses = 0;
    //num = 0;
    type = "";
    name = "";
  }
  public Moves(int d, String t. String n){
    dam = d;
    //uses = u;
    //num = n;
    type = t;
    name = n;
  }

  public int getDam(){
    return dam;
  }
  /*public int getUses(){
    return uses;
  }
  public int getNum(){
    return num;
  }*/
  public String getType(){
    return type;
  }
  public String getName(){
    return name;
  }
}
