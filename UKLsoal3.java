/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.uklsoal3;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class UKLsoal3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] nilai = new int[10];
        System.out.println("Masukkan nilai sebanyak 10 kali:");
        for (int a = 0; a < 10; a++) {
            System.out.print("nilai " + (a + 1) + ": ");
            nilai[a] = sc.nextInt();
        }

        Map<Integer, Integer> hitunganElemen = new HashMap<>();
        for (int num : nilai) {
            hitunganElemen.put(num, hitunganElemen.getOrDefault(num, 0) + 1);
        }

        int jumlahMaks = 0;
        for (int count : hitunganElemen.values()) {
            if (count > jumlahMaks) {
                jumlahMaks = count;
            }
        }

        System.out.println("Elemen yang paling banyak keluar:");
        for (Map.Entry<Integer, Integer> entry : hitunganElemen.entrySet()) {
            if (entry.getValue() == jumlahMaks) {
                System.out.println("Elemen \"" + entry.getKey() + "\" muncul sebanyak " + entry.getValue() + " kali.");
            }
        }

        sc.close();
    }
}
