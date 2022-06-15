package Constructor;

public class constructor_s
{
  int modelYear;
  String modelName;


  public constructor_s(int year, String name)
  {
    modelYear = year;
    modelName = name;
  }

  public static void main(String[] args) 
  {
    constructor_s myCar = new constructor_s(1969, "Mustang");
    System.out.println(myCar.modelYear + " " + myCar.modelName);
  }
}