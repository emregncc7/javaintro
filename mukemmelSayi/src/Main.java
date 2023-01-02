public class Main
{
    public static void main(String[] args)
    {

      int sayac = 0;
      int number = 8128;

      for (int i = number;0<6;i--)
      {

          if (number % i == 0)
          {

              if (i == number)
              {

              }
              else
              {
                  sayac+=i;
              }

          }
          if (sayac == number)
          {
              System.out.println(number+ " süper sayidir");
          }

      }



    }
}