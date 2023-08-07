package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        double urunFiyat, kdvTutari, kdvliUrunFiyati, kdvYuzdesi;

        Scanner input = new Scanner(System.in);  // Create a Scanner object 1 kere tanımlamak yeterli
        System.out.print("Ürüm Fiyatını Giriniz:");
        urunFiyat = input.nextInt();  // Read user input

        kdvYuzdesi = 0.18;

        kdvliUrunFiyati = urunFiyat+(urunFiyat*kdvYuzdesi);
        kdvTutari = kdvliUrunFiyati-urunFiyat;

        System.out.println("KDV'li ürün fiyatı: "+ kdvliUrunFiyati);
        System.out.println("KDV Tutarı: "+ kdvTutari);

    }
}
