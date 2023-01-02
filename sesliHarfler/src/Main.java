public class Main {
    public static void main(String[] args)
    {
        char harf = 's';

        char[] sesliHarfler = {'a','e','ı','i','o','ö','u','ü'};

        for (int i = 0;0< sesliHarfler.length;i++){
            if (harf == sesliHarfler[i])
            {
                System.out.println(harf + " harfi sesli bir harftir");
                break;
            }
            else
            {
                System.out.println(harf +" sessiz bir harftir");
                break;
            }
        }
    }
}