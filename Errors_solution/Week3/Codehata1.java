import java.util.Scanner;

public class HataliKodOrnegi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Lütfen bir sayı girin: ");
        int sayi = scanner.nextInt();

        for (int i = 0; i < 10; i++) {
            if (sayi == i) {
                System.out.println("Sayı bulundu.");
                break;
            }
            else {
                System.out.println("Sayı bulunamadı.");
                break;
            }
        }

        if (sayi == i) {
            System.out.println("Sayı bulundu.");
        } else {
            System.out.println("Sayı bulunamadı.");
        }

        do {
            System.out.println(i);
            i++;
        }
        while (i < 10);

        scanner.close();
    }
}


