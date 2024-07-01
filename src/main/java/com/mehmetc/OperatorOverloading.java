package com.mehmetc;

public class OperatorOverloading {
    public static void main(String[] args) {
        //Overload: Aşırı Yükleme: Birden fazla kullanım özelliği kazandırma.
        int sonuc=5+3;
        System.out.println(sonuc);
        System.out.println(10+20); // + operatörü sayılarla toplama işlemi yapar.
        System.out.println("Deneme"+10);// + operatörü bir tane string bile varsa birleştirme işlemi yapar.
        System.out.println("Deneme"+"İki");
        System.out.println(10+"İki");

        //System.out.println(true+10); + operatörü booleanlarla kullanılamaz.

        char a='a';
        System.out.println(a);
        System.out.println(a+1);

        for (char i=0; i<256; i++){

            System.out.println((int)i+"->"+i);

        }
        int harf=97;
        System.out.println((char)harf);

    }
}
