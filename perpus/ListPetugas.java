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
public class ListPetugas {
    petugas[] list = {
      new petugas(1, "Rena", "Jaksel", "087643"),
      new petugas(2, "Raja", "Bandung", "081234"),
      new petugas(3, "Janu", "Jaksel", "098543")
    };
    
    
    public void viewListPetugas(){
        System.out.println("ID \t Nama \t Alamat \t Telepon");
        for (int i = 0; i < list.length; i++) {
            System.out.println(list[i].getIdPetugas()+ " \t "
            + list[i].getNama() + " \t "
            + list[i].getAlamat() + " \t "
            + list[i].getTelepon());
        }
    }
    
    public int cariPetugas(int id_petugas){
        int found = 0;
        for (int i = 0; i < list.length; i++) {
            if (list[i].getIdPetugas()== id_petugas) {
                found = i;
            }
        }
        return found;
    }
}
