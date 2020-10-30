public class Demodt
{
  private int day,month,year;
  Demodt()
  {
   day=20;month=10;year=2020;
  }
   int getDay(){return day;}
   void setDay(int d){day=d;}
   void display()
     {
        System.out.println(day+"/"+month+"/"+year);
      }
   public static void main(String args[])
   {
    Demodt d=new Demodt();
    d.display();
   }
}