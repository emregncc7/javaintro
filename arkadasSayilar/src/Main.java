public class Main {
    public static void main(String[] args)
    {
        // 220-284
        // Hakkı verildi 90 dakika :D
        int number1 = 1184;
        int number2 = 1210;
        int sayac1 = 0;
        int sayac2 = 0;

        for (int i = number1; 0 < i; i--)
        {
            if (number1 != i)
            {
                if (number1 % i == 0)
                {
                    sayac1 += i;
                }
            }



        }
        for (int j = number2; 0 < j; j--)
        {
            if (number2 != j)
            {
                if (number2 % j == 0)
                {
                    sayac2 += j;
                }
            }
        }



        if (sayac1 == number2&& sayac2 == number1)
        {
            System.out.println("Bu sayilar arkadaş sayılar");
        }


        System.out.println(sayac1);
        System.out.println(sayac2);

    }
}