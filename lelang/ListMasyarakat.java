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
public class ListMasyarakat {
    Masyarakat[] listMasyarakat = {
    new Masyarakat(1, "Nea", "Malang", "083234"),
    new Masyarakat(2, "Fajar", "Jakarta", "08565"),
    new Masyarakat(3, "Gabie", "Surabaya", "092341"),
    };
    
    public void viewMasyarakat(){
        System.out.println("Id \t Nama \t Alamat \t Telepon");
        for (int i = 0; i < listMasyarakat.length; i++) {
            System.out.println(listMasyarakat[i].getIdMasyarakat() + " \t "
            + listMasyarakat[i].getNama() + " \t "
            + listMasyarakat[i].getAlamat()+ " \t "
            + listMasyarakat[i].getTelepon()+ " \t ");
        }
    }
    
    public int cariMasyarakat(int id_masyarakat){
        int found = 0;
        for (int i = 0; i < listMasyarakat.length; i++) {
            if (listMasyarakat[i].getIdMasyarakat() == id_masyarakat) {
                found = i;
            }
        }
        return found;
    }
}
