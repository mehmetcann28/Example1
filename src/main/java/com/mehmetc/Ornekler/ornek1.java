package com.mehmetc.Ornekler;

public class ornek1 {
	public static void main(String[] args) {
		int yas=35;
		if (yas>0 && yas<18){
			System.out.println("Bu içeriğe erişim izniniz yok");
		}
		else if (yas>=18 && yas<30) {
			System.out.println("İçeriği görüntülemek için yaşınız yeterli");
		}
		else if (yas>30){
			System.out.println("Bu içerik sizin yaş grubunuza göre değildir.");
		}
		else {
			System.out.println("HATA... Negatif Sayı...");
		}
	}
}