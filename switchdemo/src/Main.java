public class Main {
    public static void main(String[] args)
    {
        char grade = 'E';
        switch (grade)
        {
            case 'A' :
                System.out.println("Geçtiniz");
                break;
            case 'B':
                System.out.println("Geçtiniz");
                break;
            case 'F':
                System.out.println("Kaldınız");
                break;
            default:
                System.out.println("geçersiz not girdiniz");
        }
    }
}