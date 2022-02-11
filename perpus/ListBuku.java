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
public class ListBuku {
    // pemberian nilai array
    buku[] list = {
        new buku(1, "Sains", 30),
        new buku(2, "Agama", 50),
        new buku(3, "novel", 45),
    };
    
    // method utk menampilkakan data list buku
    public void viewListBuku(){
        System.out.println("ID \t Judul Buku \t Stok");
        for (int i = 0; i < list.length; i++) {
            System.out.println(list[i].getIdBuku()+" \t "
            + list[i].getJudulBuku()+ " \t\t "
            + list[i].getStok()+ " \t "
            );
        }
    }
    
    public int cariBuku(int id_buku){
        int found = 0;
        // pencarian berdasarkan id
        for (int i = 0; i < list.length; i++) {
            // jika id yg dicari ketemu
            if (list[i].getIdBuku()==id_buku) {
                found = i; //menyimpan nilai index dari data yg ditemukan
            }
        }
        return found;
    }
}
