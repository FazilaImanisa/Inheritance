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
public class admin extends karyawan1 {
    int nomorpegawai;
    
    public void keterangan(){
        super.subdivisi();
        System.out.println("admin");
    }
    public void setnomorpegawai(int nomorPegawai){
        this.nomorpegawai = nomorPegawai;
    }
    public void getnomorpegawai(){
        return nomorpegawai;
    }
    public void gaji(int pokok,int bonus){
        int total = pokok*bonus;
        System.out.println("Gaji utama yang didapat : " +total);
    }
    public void gajitambahan(int pokok,int bonus,int tambahan);
        int total = pokok*bonus*tambahan;
        System.out.println("gaji yang didapat jika bekerja dengan baik menjadi :"+total);
}
@override
    public void cetak(){
        System.out.print("nomor pegawai");
}
