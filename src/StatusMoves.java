public class StatusMoves extends Moves{
  private int stage;
  private String stat;

  public StatusMoves(int d, int t, int s, int st){
    super(d, t);
    stage = s;
    stat = st;
  }

  public int getStage(){
    return stage;
  }
  public String getStat(){
    return stat;
  }
}
