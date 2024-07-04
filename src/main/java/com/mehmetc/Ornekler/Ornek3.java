package com.mehmetc.Ornekler;
/*Bir seyahat uygulaması yazıyorsunuz ve kullanıcının gideceği şehre göre bilet fiyatını hesaplamanız gerekiyor.
Ankara'ya gidecek kullanıcılara 100 TL, İstanbul'a gidecek kullanıcılara 200 TL, izmir'e gidecek kullanıcılara 150 TL, diğer şehirlere gidecek kullanıcılara ise "Geçerli bir şehir seçiniz." mesajı gösterilmelidir.
 */
public class Ornek3 {
	public static void main(String[] args) {
		String sehir = "Ankara";
		int tutar = 0;
		if (sehir=="Ankara"){
			tutar=100;
		}
		else if (sehir=="İstanbul") {
			tutar=200;
		}
		else if (sehir=="İzmir") {
			tutar=150;
		}
		else {
			System.out.println("Geçerli bir şehir seçiniz.");
		}
		System.out.println(tutar+" TL ödeme yapmalısınız");
	}
}