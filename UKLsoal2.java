/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.uklsoal2;


public class UKLsoal2 {

    public static double hitungLuasPermukaanBola(double jariJari) {
        double luas = 4 * Math.PI * Math.pow(jariJari, 2); // Rumus luas permukaan bola
        return luas;
    }

    public static double hitungLuasLingkaranBola(double jariJari) {
        double luasLingkaran = Math.PI * Math.pow(jariJari, 2); // Rumus luas lingkaran bola
        return luasLingkaran;
    }

    public static void main(String[] args) {
       
        double jariJari =10;

        double luasPermukaan = hitungLuasPermukaanBola(jariJari);
        double luasLingkaran = hitungLuasLingkaranBola(jariJari);
        
        System.out.println("Jari-jari bola: " + jariJari);
        System.out.println("Luas permukaan bola: " + luasPermukaan);
        System.out.println("Luas lingkaran bola: " + luasLingkaran);
    }
}
