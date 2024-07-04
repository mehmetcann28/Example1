package com.mehmetc.Ornekler;
//Bir sayının tek çift olduğunu ternary operatörü ile belirleyen program
public class TernarySorusu {
	public static void main(String[] args) {
		int sayi =7;
		String sonuc = (sayi%2==0)?"Çift":"Tek";
		System.out.println(sonuc);
	}
}