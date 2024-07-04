package com.mehmetc.Ornekler;

import java.util.Scanner;

public class Ornek4 {
	public static void main(String[] args) {
		int not;
		Scanner sc=new Scanner(System.in);
		System.out.println("Notunuzu giriniz: ");
		not= sc.nextInt();
		
		if (not>100){
			System.out.println("Not 100 den büyük olamaz.");
		}
		else if (not>=90){
			System.out.println("AA");
		}
		else if (not>=80) {
			System.out.println("BA");
		}
		else if (not>=70) {
			System.out.println("BB");
		}
		else if (not>=60) {
			System.out.println("CB");
		}
		else if (not>=50) {
			System.out.println("CC");
		}
		else if (not>=40) {
			System.out.println("DC");
		}
		else if (not>=30) {
			System.out.println("DD");
		}
		else if(not>=0){
			System.out.println("FF");
		}
		else {
			System.out.println("Gireceğiniz not 0-100 arasında olmalı.");
		}
		System.out.println("Program sonlandı...");
	}
}