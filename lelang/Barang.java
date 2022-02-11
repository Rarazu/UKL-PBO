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
public class Barang {
    private int id_barang;
    private String nama_barang;
    private double harga_awal;
    private boolean status;
    
    public Barang(int id_barang, String nama_barang, double harga_awal, boolean status){
        this.id_barang = id_barang;
        this.nama_barang = nama_barang;
        this.harga_awal = harga_awal;
        this.status = status;
    }
    
    public int getIdBarang(){
        return id_barang;
    }
    public String getNamaBarang(){
        return nama_barang;
    }
    public double getHargaAwal(){
        return harga_awal;
    }
    
    public void changeStatus(){
        this.status = !this.status;
    }
    public String getStatus(){
        if (status) {
            return "Barang bisa ditawar";
        }
        else{
            return "Maaf, barang sudah tidak bisa ditawar";
        }
    }
    public boolean isStatus(){
        return status;
    }
    
    
}
