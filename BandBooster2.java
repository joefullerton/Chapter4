package Chapter_4;

import java.util.Scanner;

public class BandBooster2
{
  
  public static void main(String[]args)
  {
    String memberName;
    int addedboxes;
    final int WEEKS = 3;
    Scanner scan = new Scanner(System.in);
    
    BandBooster booster1, booster2;
    
    System.out.println("Type in Member's Name");
    booster1 = new BandBooster(memberName = scan.next());
    System.out.println("Type in Other Member's Name");
    booster2 = new BandBooster(memberName = scan.next());
    
    for(int x = 0; x < WEEKS; x++)
    {
      System.out.println("Enter the number of boxes sold by " + booster1.getName() + " this week: ");
      addedboxes = scan.nextInt();
      booster1.updateSales(addedboxes);
    }
    
    for(int x = 0; x < WEEKS; x++)
    {
      System.out.println("Enter the number of boxes sold by " + booster2.getName() + " this week: ");
      addedboxes = scan.nextInt();
      booster2.updateSales(addedboxes);
    }
    
    System.out.println(booster1 + " \n" + booster2);
  }
 
}
