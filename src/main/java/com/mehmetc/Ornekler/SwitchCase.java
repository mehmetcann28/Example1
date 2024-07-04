package com.mehmetc.Ornekler;

import java.util.Scanner;

/*Kullanıcının girdiği not bilgisine göre(Scanner) harf notu hesaplayan bir program yazmanız gerekiyor.
		90 ve üzeri AA,
		80-89 arası BA,
 70-79 arası BB,
 60-69 arası CB,
 50-59 arası CC,
 40-49 arası DC,
 30-39 arası DD,
 0-29 arası FF olarak belirlenmiştir.

Bu durumda switch-case yapısı kullanarak bir program yazınız.*/

public class SwitchCase {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Lütfen not giriniz: ");
		int not = scanner.nextInt();
		String durum;
		
		if(not<0 || not>100){
			System.out.println("0-100 arası not girişi yapınız");
		}
		else {
			switch (not/10){
				case 9,10 -> durum = "0-100 arasında bir sayı giriniz.";
				case 8 -> durum = "BA";
				case 7 -> durum = "BB";
				case 6 -> durum= "CB";
				case 5 -> durum = "CC";
				case 4 -> durum ="DC";
				case 3 -> durum = "DD";
				default -> durum = "FF";
			};
			System.out.println(not+" için harf notu: "+ durum);
		}
		char character= 'a';
		switch (character){
			case 97:
				System.out.println("a harfi girildi...");
				break;
			default:
				System.out.println("hangi harf");
		}
		
		String deger = "Ankara";
		switch (deger){//deger.toLowerCase alınan değerin hepsini küçük harfe dönüştürür.
			case "Ankara":
				System.out.println("06");
				break;
			case "İstanbul":
				System.out.println("34");
				break;
			default:
				System.out.println("Plakanı bilemedim");
		}
		
	}
}