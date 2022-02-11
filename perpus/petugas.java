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
public class petugas extends info{
    
    
    private int id_petugas;
    
    public petugas(int id_petugas, String nama, String alamat, String telepon){
        super(nama, alamat, telepon);
        this.id_petugas = id_petugas;
    }
    
    public int getIdPetugas(){
        return id_petugas;
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
}
