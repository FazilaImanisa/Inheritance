/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Praktek1;
public class class1 {
        String nama = "Zila";
        String gender = "Perempuan";
        int nip = 333333;
        int gaji;
        int harian;
        
public void identitas(){
    System.out.println("Berikut identitas pegawai");
}
public void getnama(String nama){
    this.nama = nama;
}
public void getGender (String gender){
    this.gender = gender;
}
public void getNIP(int nip){
    this.nip = nip;
}
void gaji(int gaji){
    this.gaji = gaji;
    System.out.println("Gaji utama yang didapat"+gaji);
}
void gaji(int upah, int harian){
    this.gaji = upah*harian;
    System.out.println("Gaji yang didapat jika bekerja dengan baik"+gaji);
}
}
