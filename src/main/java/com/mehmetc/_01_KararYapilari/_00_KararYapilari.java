package com.mehmetc._01_KararYapilari;

public class _00_KararYapilari {
    public static void main(String[] args) {
        /*
        if(mantıksal ifade)
           //koşul doğruysa çalışacak kod yazılır.

           if(mantıksal ifade){
           //koşul doğruysa çalışacak kod1
           //koşul doğruysa çalışacak kod2
           //koşul doğruysa çalışacak kod3
           }

         */

        if (5 < 10) {
            System.out.println("Koşul doğru olduğu içim bu kod çalıştı");
        }

        if (50 < 10) {
            System.out.println("2.Koşul");
        } else {
            System.out.println("Koşulsuz");
        }

        /**
         * if(mantıksal ifade){
         * koşul doğru ise çalışacak kodlar
         * }
         * else{
         * koşul doğru değil ise çalışacak kodlar}
         */


        int sicaklik = 10;
        if (sicaklik > 20) {
            System.out.println("Klimayı çalıştır");
        } else {
            System.out.println("Klimayı durdur");
        }
        sicaklik = 15;
        if (sicaklik < 0) {
            System.out.println("Klimayı çok aç");
        } else if (sicaklik < 10) {
            System.out.println("Klimayı az aç");
        } else if (sicaklik < 20) {
            System.out.println("Klimayı daha kısık aç");
        } else {
            System.out.println("Klimayı kapat");
        }


        System.out.println("if else if bloğundaki kodlardan sonraki kodlar...");
    }
}
