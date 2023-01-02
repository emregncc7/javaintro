public class Main {
    public static void main(String[] args)
    {
        int sayi1 = 35;
        int sayi2 = 25;
        int sayi3 = 25;

        if (sayi1 > sayi2 && sayi1 > sayi3)
        {
            System.out.println("büyük sayi" + sayi1);
        }
        else if (sayi2 > sayi1 && sayi2 > sayi1)
        {
            System.out.println("büyük sayi" + sayi2);
        } else if (sayi3 > sayi1 && sayi3 > sayi2)
        {
            System.out.println("büyük sayi" + sayi3);
        }
        else
        {
            System.out.println("sayılar arasında eşitlikl durumu var");
        }
    }
}