/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboif2.pkg10119053.latihan52.oo.siapakamu;

import model.Dosen;
import model.Mahasiswa;
/**
 *
 * @author Dean
 * Nama  : Dean Ghifari Faturrahman
 * Kelas : PBOIF2
 * NIM   : 10119053
 * Deskripsi Program : Program ini berisi program siapa kamu
 */
public class PBOIF210119053Latihan52OOSiapaKamu {

    public static void main(String[] args) {
        Dosen dosen;
        Mahasiswa mahasiswa;
        
        dosen = new Dosen();
        dosen.setNip("41227829930");
        dosen.setNama("Rizki Adam Kurniawan");
        dosen.setUmur(27);
        dosen.setMataKuliah("PBO");
        System.out.println("NIP DOSEN : " + dosen.getNip());
        dosen.siapaKamu();
        dosen.mengajarApa();
        
        mahasiswa = new Mahasiswa();
        mahasiswa.setNim("10119053");
        mahasiswa.setNama("Dean Ghifari Faturrahman");
        mahasiswa.setUmur(19);
        mahasiswa.setKelas("IF - 2");
        System.out.println("\nNIM MAHASISWA : " + mahasiswa.getNim());
        mahasiswa.siapaKamu();
        mahasiswa.kelasApa();
    }
    
}
