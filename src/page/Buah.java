/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package page;

/**
 *
 * @author Lab Informatika
 */
public class Buah {
    String nama;
    int harga;
    public Buah(String nama, int harga) {
        this.nama = nama;
        this.harga = harga;
    }
    
    
    int beli(int jumlah) {
        return jumlah * harga;
    }
    
}
