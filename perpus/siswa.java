/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package perpus;

/**
 *
 * @author MOKLET-1
 */
public class siswa extends info {
    private int id_siswa;
    private boolean status;
    
    public siswa (int id_siswa, String nama, String alamat, String telepon, boolean status){
        super(nama,alamat,telepon);
        this.id_siswa = id_siswa;
        this.status = status;
    }
    
    // enkapsulasi
    public int getIdSiswa(){
        return id_siswa;
    }
    
    public String getNama(){
        return nama;
    }
    
    public String getAlamat(){
        return alamat;
    }
    
    public String getTelepon(){
        return telepon;
    }
    
    /** method untuk mengubah status peminjaman siswa */
    public void changeStatus(){
        this.status = !this.status;
    }

    /** method untuk mendapatkan status peminjaman */
    public String getStatus() {
        if (status) {
            return "Diijinkan meminjam";
        }
        else{
            return "Tidak Diijinkan meminjam";
        }
    }

    /** implementasi enkapsulasi dengan pembuatan method utk mengakses data private "isStatus" */
    public boolean isStatus() {
        return status;
    }
}
