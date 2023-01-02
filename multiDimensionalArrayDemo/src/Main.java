public class Main {
    public static void main(String[] args)
    {
        String[][] sehirler = new String[3][3] ;

        sehirler[0][0] = "istanbul";
        sehirler[0][1] = "Bursa";
        sehirler[0][2] = "Bilecik";
        sehirler[1][0] = "Ankara";
        sehirler[1][1] = "Konya";
        sehirler[1][2] = "Kayseri";
        sehirler[2][0] = "Diyarbakır";
        sehirler[2][1] = "Şanlıurfa";
        sehirler[2][2] = "Gaziantep";

        for (int i = 0;i<=2;i++)
        {
            for (int j = 0;j<=2;j++)
            {
                if (i == 0)
                {
                    System.out.println("Marmara bölgesinin illeri : " + sehirler[0][j]);


                }
                else if (i == 1)
                {
                    System.out.println("İçanadolu bölgesinin illeri : " + sehirler[1][j]);
                }
                else
                {
                    System.out.println("Doğu bölgesinin illeri : " + sehirler[2][j] );
                }
            }
        }
    }
}