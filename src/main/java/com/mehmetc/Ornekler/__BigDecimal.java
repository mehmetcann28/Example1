package com.mehmetc.Ornekler;

import java.math.BigDecimal;

public class __BigDecimal {
	public static void main(String[] args) {
		
		float sonuc = 0.1f+0.1f+0.1f+0.1f+0.1f+0.1f+0.1f;
		System.out.println(sonuc);
		
		double sonucDouble = 0.1+0.1+0.1+0.1+0.1+0.1+0.1;
		System.out.println(sonucDouble);
		
		double sonucDouble1 = 0.1*0.1;
		System.out.println(sonucDouble1);
		
		BigDecimal sayi = new BigDecimal("0.1");
		BigDecimal sonucBigDecimal= sayi.add(sayi).add(sayi).add(sayi).add(sayi).add(sayi).add(sayi).add(sayi);
		System.out.println(sonucBigDecimal);
		
		BigDecimal sonucBigDecimal2 = sayi.multiply(sayi);
		System.out.println(sonucBigDecimal2);
	}
}