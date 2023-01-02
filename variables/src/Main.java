public class Main {
    public static void main(String[] args)
    {
        //case sensitivy : Büyük küçük harf duyarlılığı
        //reusability = kod tekrarında kaçınıp bir kere yazıp bütün değişikleri sağlayabimek

        int sayi =123;
        String mesaj = "Öğrencilerin sayisi : ";
        System.out.println("Öğrencilerin sayisi : 123");
        System.out.println("Öğrencilerin sayisi :" + sayi);
        System.out.println(mesaj + "123");
        System.out.println(mesaj + sayi); // reusability
    }
}