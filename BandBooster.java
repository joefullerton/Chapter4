package Chapter_4;

public class BandBooster
{
  private String Name;
  private int boxesSold;
  
  
  public BandBooster(String memberName)
  {
  Name = memberName;
  boxesSold = 0;
  }
  public String getName()
  {
  return Name;
  }
  public int updateSales(int addedboxes)
  {
  boxesSold += addedboxes;
  return boxesSold;
  }
  public String toString()
  {
  return (Name + ": " + boxesSold + " boxes");
  }
}
