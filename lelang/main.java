/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lelang;

import java.util.Scanner;

/**
 *
 * @author MOKLET-1
 */
public class main {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        boolean stay = true;
        String key;
        
        ListPetugas listPetugas = new ListPetugas();
        ListMasyarakat listMasyarakat = new ListMasyarakat();
        ListBarang listBarang = new ListBarang();
        
        while(stay){
            System.out.println("--- LELANG ---");
            System.out.println("1. List Petugas");
            System.out.println("2. List Masyarakat");
            System.out.println("3. List Barang");
            System.out.println("4. Pelelangan");
            System.out.println("5. Exit");
            System.out.println("Pilih Menu :");
            int menu = input.nextInt();
            
            if (menu == 1) {
                listPetugas.viewListPetugas();
                System.out.println("press any key");
                key = input.next();
            }else if (menu == 2) {
                listMasyarakat.viewMasyarakat();
                System.out.println("press any key");
                key = input.next();
            }else if (menu == 3) {
                listBarang.viewBarang();
                System.out.println("press any key");
                key = input.next();
            }else if (menu == 5) {
                stay = false;
            }else if (menu == 4) {
                System.out.println("--- Pelelangan Barang ---");
                
                int selectedIDBarang, selectedIDMasyarakat;
                System.out.print("Masukkan id  Barang :");
                selectedIDBarang = input.nextInt();
                
                int found = listBarang.cariBarang(selectedIDBarang);
                Barang selectedBarang = listBarang.listBarang[found];
                
                if (selectedBarang.isStatus()) {
                    /** proses perubahan status siswa */
                    listBarang.listBarang[found].changeStatus();
                            
                    /** menampilkan data buku */
                    listMasyarakat.viewMasyarakat();

                    System.out.print("\nPilih ID Penawar 1: ");
                    selectedIDMasyarakat = input.nextInt();
                    found = listMasyarakat.cariMasyarakat(selectedIDMasyarakat);
                    

                    /** "selectedBuku" menyimpan data client yg dipilih */
                    Masyarakat selectedMasyarakat = listMasyarakat.listMasyarakat[found];
                    
                    double harga_tawar1;
                    System.out.print("Masukkan harga tawar:");
                    harga_tawar1 = input.nextDouble();
                    
                    System.out.print("\nPilih ID Penawar 2: ");
                    selectedIDMasyarakat = input.nextInt();
                    found = listMasyarakat.cariMasyarakat(selectedIDMasyarakat);

                    /** "selectedBuku" menyimpan data client yg dipilih */
                    Masyarakat selectedMasyarakat2 = listMasyarakat.listMasyarakat[found];
                    
                    double harga_tawar2;
                    System.out.print("Masukkan harga tawar:");
                    harga_tawar2 = input.nextDouble();
                    
                    if (harga_tawar1 >= selectedBarang.getHargaAwal()) { 
                        if (harga_tawar1 >= harga_tawar2) {
                        System.out.println("\n--- Pemenang Lelang ---");
                        System.out.println("Pelelang: " + selectedMasyarakat.getNama());
                        System.out.println("Barang: " + selectedBarang.getNamaBarang());
                        }else if (harga_tawar2 >= harga_tawar1) {
                        System.out.println("\n--- Pemenang Lelang ---");
                        System.out.println("Pemenang lelang: " + selectedMasyarakat2.getNama());
                        System.out.println("Barang: " + selectedBarang.getNamaBarang());
                        }
                    }
                    
                } else{
                    System.out.println("Maaf, barang sudah dilelang");
                }     
                
            }
        }
    }
}
