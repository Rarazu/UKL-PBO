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
public class List {
    public void identitas(){
        System.out.println("--- Zuu's Library ---");
    }
}

class karyawan extends List {
    public void identitas(){
        System.out.println("1. List Petugas");
    }
}

class bukuu extends List {
    public void identitas(){
        System.out.println("2. List Buku");
    }
}

class murid extends List {
    public void identitas(){
        System.out.println("3. List Siswa");
    }
}