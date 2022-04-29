import java.util.Scanner;

public class main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int km = 0, age, type;
        double price, discount;

        System.out.print("Lutfen mesafeyi KM cinsinden giriniz: ");
        km = scanner.nextInt();

        System.out.print("Lutfen yasinizi giriniz: ");
        age = scanner.nextInt();

        System.out.print("Lutfen yolculuk tipinizi seciniz(1-Tek yon,2-Gidis-Donus): ");
        type = scanner.nextInt();

        if (km <= 0) {
            System.out.println("Hatalı bir  deger girdiniz.");
            while(true);
        }

        if (!(type == 1 || type == 2)) {
            System.out.println("Hatalı bir deger girdiniz.");
            while(true);
        }



        price = km * 0.10;

        if (age < 12) {
            discount = price * 0.50;
            price -= discount;
        }
        if (age >= 12 && age <= 24) {
            discount = price * 0.10;
            price -= discount;
        }
        if (age > 65) {
            discount = price * 0.30;
            price -= discount;
        }
        if (type == 2) {
            discount = price * 0.20;
            price -= discount;
            price *= 2;
        }

        System.out.println("Toplam tutar: " + price);
    }
}
