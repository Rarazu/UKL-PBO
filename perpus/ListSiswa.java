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
public class ListSiswa {
    siswa[] list = {
        new siswa (1, "Ara", "Malang", "09876", true),
        new siswa (2, "Alan", "Bandung", "08765", true),
        new siswa (3, "Aluna", "Surabaya", "08123", true),
    };
     // menampilkan data siswa
    public void viewListSiswa(){
        System.out.println("ID \t Nama \t Alamat \t Status");
        for (int i = 0; i < list.length; i++) {
            System.out.println(list[i].getIdSiswa() + " \t "
                    + list[i].getNama() + " \t "
                    + list[i].getAlamat() + " \t "
                    + list[i].getStatus()
            );
        }
    }
    
    public int cariSiswa(int id_siswa){
        int found = 0;
        for (int i = 0; i < list.length; i++) {
            // pencarian id ketemu
            if (list[i].getIdSiswa()==id_siswa) {
                found = i;
            }
        }
        return found;
    }
}
