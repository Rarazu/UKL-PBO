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
public class ListPetugas {
    Petugas[] listPetugas = {
      new Petugas(1, "Rena", "Jaksel", "087643"),
      new Petugas(2, "Raja", "Bandung", "081234"),
      new Petugas(3, "Janu", "Jaksel", "098543")
    };
    
    public void viewListPetugas(){
        System.out.println("ID \t Nama \t Alamat \t Telepon");
        for (int i = 0; i < listPetugas.length; i++) {
            System.out.println(listPetugas[i].getIdPetugas()+ " \t "
            + listPetugas[i].getNama() + " \t "
            + listPetugas[i].getAlamat() + " \t "
            + listPetugas[i].getTelepon());
        }
    }
    
    public int cariPetugas(int id_petugas){
        int found = 0;
        for (int i = 0; i < listPetugas.length; i++) {
            if (listPetugas[i].getIdPetugas()== id_petugas) {
                found = i;
            }
        }
        return found;
    }
}
