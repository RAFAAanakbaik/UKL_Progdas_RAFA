/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.uklsoal1revisi;

import java.util.Scanner;

public class UKLsoal1 {

    public static void main(String[] args) {
        

        Scanner scanner = new Scanner(System.in);
        System.out.println("Apakah anda memiliki kartu member? (ya/tidak)");
        String kartumember = scanner.next().toLowerCase();
        
        System.out.print("Masukkan total belanja (Rp): ");
        double totalBelanja = scanner.nextDouble();

        double totalBayar;

        if (kartumember.equals("ya")) {
            if (totalBelanja < 100000) {
                totalBayar = totalBelanja;
            } else if (totalBelanja <= 200000) {
                totalBayar = totalBelanja - (totalBelanja * 0.10);
                System.out.println("karena Anda member jadi mendapatkan diskon 10%");
            } else {
                totalBayar = totalBelanja - (totalBelanja * 0.20);
                System.out.println("karena Anda member jadi mendapatkan diskon 20%");
            }
        } else {
            totalBayar = totalBelanja;
            System.out.println("Anda tidak mendapatkan diskon.");
        }

        System.out.println("Total yang harus dibayar: Rp " + totalBayar);

        
    }
}
