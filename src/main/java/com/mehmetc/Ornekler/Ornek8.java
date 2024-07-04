package com.mehmetc.Ornekler;

import java.util.Scanner;

public class Ornek8 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Not giriniz: ");
		int not = sc.nextInt();
		
		String sonuc = (not<=50) ? "Kaldı" : "Geçti";
		System.out.println(sonuc);
	}
}