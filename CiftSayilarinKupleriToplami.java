    public class CiftSayilarinKupleriToplami {
    public static void main(String[] args) {
        int toplam = 0;

        for (int i = 1; i <= 20; i++) {
            if (i % 2 == 0) { // Çift sayı kontrolü
                toplam += (i * i * i); // Sayının küpünü alıp toplama ekleme
            }
        }

        System.out.println("1 ile 20 arasındaki çift sayıların küpleri toplamı: " + toplam);
    }
}

