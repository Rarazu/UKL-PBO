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
public class ListBarang {
    Barang[] listBarang = {
    new Barang(1, "Meja", 50000, true),
    new Barang(2, "Rumah", 100000, true),
    new Barang(3, "Kursi", 75000, true),
    };
    
    public void viewBarang(){
        System.out.println("ID \t Nama \t Harga Awal \t Status");
        for (int i = 0; i < listBarang.length; i++) {
            System.out.println(listBarang[i].getIdBarang() + " \t "
            + listBarang[i].getNamaBarang()+ " \t "
            + listBarang[i].getHargaAwal()+ " \t "
            + listBarang[i].getStatus()+ " \t ");
        }
    }
    
    public int cariBarang(int id_barang){
        int found = 0;
        for (int i = 0; i < listBarang.length; i++) {
            if (listBarang[i].getIdBarang() == id_barang) {
                found = i;
            }
        }
        return found;
    }
}
