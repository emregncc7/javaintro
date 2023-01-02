public class Main {
    public static void main(String[] args)
    {
        double[] myList = {1.2,1.4,25.2,53};
        double toplam = 0;
        for (int i = 0;i<myList.length;i++)
        {
            System.out.println(myList[i]);
            toplam += myList[i];
        }
        System.out.println("Toplam = "+ toplam);
    }
}