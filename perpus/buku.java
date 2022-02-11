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
public class buku {
    private int id_buku, stok;
    private String judulBuku;

    public buku(int id_buku, String judulBuku, int stok) {
        this.id_buku = id_buku;
        this.stok = stok;
        this.judulBuku = judulBuku;
    }

    /** implementasi enkapsulasi dengan pembuatan method utk mengakses data private "idBuku" */
    public int getIdBuku() {
        return id_buku;
    }

    /** implementasi enkapsulasi dengan pembuatan method utk mengakses data private "stok" */
    public int getStok() {
        return stok;
    }

    /** implementasi enkapsulasi dengan pembuatan method utk mengakses data private "judulBuku" */
    public String getJudulBuku() {
        return judulBuku;
    }
    
    /** method untuk mengurangi stok sejumlah 1 */
    public void kurangiStok(){
        this.stok--;
    }
       
}
