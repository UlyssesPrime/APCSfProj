import java.util.*;
public class Main{
  public static Scanner in = new Scanner(System.in);
  public static Player pc = new Player();
  public static ZachPines zach = new ZachPines();

  public static int zMon = 0;
  public static int pMon = 0;

  public static boolean winLose = true;

  public static void main(String[] args){
    System.out.println(zach.getName() + " has challenged " + pc.getName() + " to a battle!");
    try {Thread.sleep(1250);} catch (InterruptedException ex){}
    System.out.println(zachSayings[1]);
    try {Thread.sleep(1250);} catch (InterruptedException ex){}
    System.out.println(zach.getName() + " sends out " + zach.getBattleMon(zMon).getName() + ".");
    try {Thread.sleep(1250);} catch (InterruptedException ex){}
    System.out.println(pc.getName() + " send out " + pc.getBattleMon(pMon).getName() + ".");

    //while ()

  }
}
