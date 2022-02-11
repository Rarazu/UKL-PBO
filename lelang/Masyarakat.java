/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lelang;

/**
 *
 * @author MOKLET-1
 */
public class Masyarakat extends Info {
    private int id_masyarakat;
    
    public Masyarakat(int id_masyarakat, String nama, String alamat, String telepon){
        super (nama, alamat, telepon);
        this.id_masyarakat = id_masyarakat;
    }
    
    public int getIdMasyarakat(){
        return id_masyarakat;
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
