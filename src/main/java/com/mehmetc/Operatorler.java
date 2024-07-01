package com.mehmetc;

public class Operatorler {
    public static void main(String[] args) {
        //int sonuc;
        //sonuc=5+3;

        long sonuc;
        sonuc=5_000_000_000L+3;

        //double sonuc2;
        //sonuc2=5.25+3;

        float sonuc2;
        sonuc2=5.25f+3;

        float sonuc3;
        //sonuc3=5.25f+3.25; //Double olarak otomatik değeri yükseltiyor bu yüzden float tanımlama hatalı

        //HATALAR

        int i=5;
        double d = 2.3;

        i=(int) (i+d);//ikili aritmetik operatör ile kullanılan değerlerden bir tanesi double ise sonuç doubledır. O yüzden bu sonucu int türünde bir değişkende saklayamayız.

        System.out.println(i);

        byte b1=8,b2=5,b3;

        b3=(byte)(b1+b2);//ikili aritmetik operatör ile kullanılan tam sayılarda işlem sonucu int olur.

        System.out.println(b3);

        int z=5;
        z+=2;//z=z+2 de kullanılabilirdi.
        System.out.println(z);

        int y=10;
        y+=5;//y=y+5 de kullanılabilirdi.
        System.out.println(y);

        int x=8;
        x++;//x i bir artırır aslında x=x+1 dir.
        System.out.println(x);

        int j;
        i=5;
        j=i++; //önce i nin değeri j ye aktarılır ardından i nin değeri bir artırılır.
        System.out.println("i: "+i +"j: "+j);

        int g;
        int v=5;
        g=++v; //önce v değeri 1 artır ardından v nin değerini g ye aktar.
        System.out.println("v: "+v+" g: "+g);

        //TEKLİ MANTIKSAL OPERATÖR: ! : mantıksal olarak tersini almaya yarar.
        boolean dogruMu=false;
        System.out.println(dogruMu); //false
        System.out.println(!dogruMu); //true

        if(!dogruMu){
            //System.out.println("doggoMu degeri Doğru iken çalışacak kodlar");
        }else {
            //System.out.println("doggoMu degeri Yanlış iken çalışacak kodlar");
        }
        System.out.println(dogruMu);
        dogruMu= !dogruMu;
        System.out.println(dogruMu);

        //Kıyaslama Operatörleri geriye boolean sonuçlar dönerler. True veya false
        i=5;
        j=3;
        System.out.println(i<j);

        boolean deger;
        deger= i>j;
        System.out.println(deger);

        deger= i!= j;
        System.out.println(deger);

        deger =i==j;
        System.out.println(deger);

        //Sart Operatötleri: & | && ||
        int m=5,n=10;
        int sayi=12;

        boolean arasindaMi= (sayi>m) && (sayi<n);
        System.out.println(arasindaMi);

        //Tek 3lü operatör: Ternary Operatör
        // (koşul) ? (doğruysa çalışacak kodlar) : (yanlışsa çalışacak kodlar)
        // short if

        i=30;
        j=20;
        int min=(i<j)?i:j;
        System.out.println(min);

        // &, |, ^, ~, >>,<<,>>>,<<< BIT işlermleri için kullanılır.



    }
}
