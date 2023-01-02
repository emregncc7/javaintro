public class Main {
    public static void main(String[] args) {
        int number = 1;
        int remainder = number % 2;

        // engin hoca soruları bize çözdürünce anlık kendimi mülakattaymış gibi hissedip kod kötü de olsa geçer not
        // almalık bir şeyler çıkarabiliyorum :D
        if (number % 2 == 0)
        {
           if (number == 2)
           {
               System.out.println("sayi asaldır");
           }
           else
           {
               System.out.println("sayi asal değildir");
           }
        }
        else if (number % 3 == 0)
        {
            if (number == 3)
            {
                System.out.println("sayi asaldır");
            }
            else
            {
                System.out.println("sayi asal değildir");
            }

        }
        else if (number % 5 == 0)
        {
            if (number == 5)
            {
                System.out.println("sayi asaldır");
            }
            else
            {
                System.out.println("sayi asal değildir");
            }

        }
        else if (number % 7 == 0)
        {
            if (number == 7)
            {
                System.out.println("sayi asaldır");
            }
            else
            {
                System.out.println("sayi asal değildir");
            }

        }
        else
        {
            System.out.println("sayi asaldır");
        }



    }
}