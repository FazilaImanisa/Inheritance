/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package revisi;

/**
 *
 * @author User
 */
public class tampildata {
    public static void main(String[] args) {
        karyawan1 tampil = new karyawan1();
// karyawan2 tampil2 = new karywan
        admin tampil3=new admin();
        
        tampil.setNamaKaryawan("Zila");
        tampil.setGender("Perempuan");
        tampil.cetak();
        tampil3.setnomorpegawai(333333);
        tampil3.cetak();
        System.out.println(tampil3.getnomorpegawai());
        tampil3.keterangan();
        tampil3.gaji(200000, 6,);
        tampil3.gajitambahan(200000, 6, 2);   
    }  
}
