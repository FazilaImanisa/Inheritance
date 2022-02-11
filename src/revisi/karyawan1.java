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
public class karyawan1 extends karyawan {
//    String nama,gender;
//    int NomorPegawai;
//    double tinggibadan;
    
    public void setNamaKaryawan (String nama) {
        super.nama = nama;
    }
    public void setGender (String gender) {
        super.gender = gender;
    }
    public void cetak(){
        super.identitas();
    }
    public void subdivisi(){
        System.out.println("Bekerja di bagian : ");
    }
}
