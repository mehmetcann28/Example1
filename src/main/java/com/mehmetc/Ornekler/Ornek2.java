package com.mehmetc.Ornekler;

/**
 * Soru: Bir matematik oyunu yazıyorsunuz ve kullanıcının verilen soruya doğru cevap verip vermediğini kontrol etmeniz gerekiyor.
 * * Eğer kullanıcı doğru cevap verirse "Tebrikler! Doğru cevap.", yanlış cevap verirse "Maalesef yanlış cevap, tekrar dene." mesajı gösterilmelidir.
 * *
 */
public class Ornek2 {
	public static void main(String[] args) {
		int soru=10;
		int cevap=20;
		
		if (cevap==10){
			System.out.println("Tebrikler doğru cevap verdiniz.");
		}
		else {
			System.out.println("Maalesef yanlış cevap, tekrar dene.");
		}
	}
}