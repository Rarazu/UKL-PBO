/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package perpus;

import java.util.Scanner;

/**
 *
 * @author MOKLET-1
 */
public class main {
    public static void main(String [] args){
        // utk input dari user
        Scanner input = new Scanner(System.in);
        
        //variable utk mengondisikan program masih berjalan atau berhenti */
        boolean stay = true;
        
        // menyiapkan variabel utk input user
        String key;
        
        // menyiapkan objek
        ListPetugas listPetugas = new ListPetugas();
        ListBuku listBuku = new ListBuku();
        ListSiswa listSiswa = new ListSiswa();
        
        List list = new List();
        List karyawan = new karyawan();
        List bukuu = new bukuu();
        List murid = new murid();
        
        while(stay){ //selama nilai "stay" = true maka program terus berjalan
            list.identitas();
            karyawan.identitas();
            bukuu.identitas();
            murid.identitas();
            System.out.println("4. Peminjaman");
            System.out.println("5. Exit");
            System.out.println("Pilih menu :");
            int menu = input.nextInt();
            
            // pengondisian pilihan menu user
            if (menu == 1) {
                // menampilkan list petugas
                listPetugas.viewListPetugas();
                System.out.println("press any key...");
            }else if (menu == 2) {
                // menampilkan list buku
                listBuku.viewListBuku();
                System.out.println("press any key...");
            }else if (menu == 3) {
                // menampilkan list siswa
                listSiswa.viewListSiswa();
                System.out.println("press any key...");
            }else if (menu == 5) {
                //variabel "stay" diset false menyebabkan program berhenti
                stay = false;
            }else if (menu == 4) {
                System.out.println("--- Peminjaman Buku ---");
                
    
                /** prepare variabel "selectedIDSiswa" utk menyimpan data id siswa yg dipilih,
                 * variabel "selectedIDBuku" utk menyimpan data id buku yg dipilih
                 */
                int selectedIDSiswa, selectedIDBuku;
                
                System.out.print("Masukkan ID Siswa: ");
                selectedIDSiswa = input.nextInt();
                
                /** "foundIndex" menyimpan posisi index dari data siswa yg dipilih */
                int foundIndex = listSiswa.cariSiswa(selectedIDSiswa);
                
                /** "selectedSiswa" menyimpan data client yg dipilih */
                siswa selectedSiswa = listSiswa.list[foundIndex];
                
                /** jika statusnya true, maka boleh lanjut */
                if (selectedSiswa.isStatus()) {
                    /** proses perubahan status siswa */
                    listSiswa.list[foundIndex].changeStatus();
                            
                    /** menampilkan data buku */
                    listBuku.viewListBuku();

                    System.out.print("Pilih ID buku yang dipinjam: ");
                    selectedIDBuku = input.nextInt();
                    foundIndex = listBuku.cariBuku(selectedIDBuku);

                    /** "selectedBuku" menyimpan data client yg dipilih */
                    buku selectedBuku = listBuku.list[foundIndex];

                    System.out.println("--- List Peminjaman ---");
                    System.out.println("Judul Buku: " + selectedBuku.getJudulBuku());
                    System.out.println("Peminjam: " + selectedSiswa.getNama());

                    /** proses pengurangan stok */
                    
                } else {
                    System.out.println("Maaf anda masih punya tanggungan buku");
                }
                
                System.out.println("Press any key and enter...");
                key = input.next();
                
            } 
        }
            }
        }
    

        
    

