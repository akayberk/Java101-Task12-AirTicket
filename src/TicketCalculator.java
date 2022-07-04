import java.util.Scanner;
public class TicketCalculator {
    public static void main(String[] args) {
       /*
         *This code aims to solve a specific problem given in the link below:
         * Java ile mesafeye ve şartlara göre uçak bileti fiyatı hesaplayan programı yapın.
         * Kullanıcıdan Mesafe (KM), yaşı ve yolculuk tipi (Tek Yön, Gidiş-Dönüş) bilgilerini alın.
         * Mesafe başına ücret 0,10 TL / km olarak alın. İlk olarak uçuşun toplam fiyatını
         * hesaplayın ve sonrasında ki koşullara göre müşteriye aşağıdaki indirimleri uygulayın ;
         * https://app.patika.dev/courses/java101/odev-ucak-bileti
         * The problem is:
         * Kullanıcıdan alınan değerler geçerli (mesafe ve yaş değerleri pozitif sayı, yolculuk
         * tipi ise 1 veya 2) olmalıdır. Aksi takdirde kullanıcıya "Hatalı Veri Girdiniz !"
         * şeklinde
         * bir uyarı verilmelidir.
         * 12 yaşından küçükse bilet fiyatı üzerinden %50 indirim uygulanır.
         *12-24 yaşları arasında ise bilet fiyatı üzerinden %10 indirim uygulanır.
         *65 yaşından büyük ise bilet fiyatı üzerinden %30 indirim uygulanır.
         *"Yolculuk Tipini" gidiş dönüş seçmiş ise bilet fiyatı üzerinden %20 indirim uygulanır.
        */
        Scanner sc = new Scanner(System.in);
        System.out.print("Write the travel distance in KM:  ");
        float km = sc.nextFloat();
        System.out.print("Age:  ");
        byte yas = sc.nextByte();
        System.out.println("Choose the flight type One-Way/Round-trip   (O/R)");
        String flightType = sc.next().toLowerCase();
        if(km>0&&yas<12&&flightType.equals("o")){
            float total = km*0.1f*0.5f;
            System.out.println("Toplam tutar=   " + total);
        }
        else if (km>0&&yas<12&&flightType.equals("r")) {
            float total = km*0.2f*0.5f*0.8f;
            System.out.println("Toplam tutar=   " + total);
        }
        else if (km>0&&yas>12&&yas<24&&flightType.equals("o")) {
            float total = km*0.1f*0.9f;
            System.out.println("Toplam tutar=   " + total);
        }
        else if (km>0&&yas>12&&yas<24&&flightType.equals("r")) {
            float total = km*0.2f*0.9f;
            System.out.println("Toplam tutar=   " + total);
        }
        else if (km>0&&yas>24&&yas<65&&flightType.equals("o")) {
            float total = km*0.1f;
            System.out.println("Toplam tutar=   " + total);
        }
        else if (km>0&&yas>24&&yas<65&&flightType.equals("r")) {
            float total = km*0.2f;
            System.out.println("Toplam tutar=   " + total);
        }
        else if (km>0&&yas<65&&flightType.equals("o")) {
            float total = km*0.1f*0.7f;
            System.out.println("Toplam tutar=   " + total);
        }
        else if (km>0&&yas<65&&flightType.equals("r")) {
            float total = km*0.2f*0.7f;
            System.out.println("Toplam tutar=   " + total);
        }
    }
}
