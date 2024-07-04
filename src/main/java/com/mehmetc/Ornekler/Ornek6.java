package com.mehmetc.Ornekler;

import java.util.Scanner;

//Kullanıcının girdiği sayının
//pozitif,
//negatif veya
//sıfır olduğunu belirleyen bir program yazmanız gerekiyor.
// Bu durumda if-else-if-else yapısı kullanarak bir program yazabilirsiniz.
public class Ornek6 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Lütfen sayı giriniz.");
		int sayi = sc.nextInt();
		
		if (sayi<0){
			System.out.println("Sayı negatif bir sayıdır.");
		}
		else if (sayi>0) {
			System.out.println("Sayı pozitif bir sayıdır.");
		}
		else {
			System.out.println("Girilen sayı 0'dır");
		}
		
	}
}