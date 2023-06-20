import java.util.Scanner;
public class dikÜçgen {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // Değişkenkerimizi Oluşturalım
        int a, b;
        double c;
      //Kullanıcı Verilerimizi Alalım
        Scanner girdi  = new Scanner(System.in);
        System.out.println("1. Kenarı Giriniz : ");
        a = girdi.nextInt();
        System.out.println("2. Kenarı Giriniz : ");
        b = girdi.nextInt();

        c = Math.sqrt((a*a) + (b*b));
        System.out.println("Hipotenüs : " + c);


    }
}
