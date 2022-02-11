/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Praktek1;
public class class2 extends class1 {
    public void identitas(){
        System.out.println("Bekerja di bagian admin");
    }
    public void cetak1(){
        System.out.println("nama = "+super.nama);
        System.out.println("jenis kelamin = "+super.gender);
        System.out.println("nomor pegawai = "+super.nip);
    }
}
