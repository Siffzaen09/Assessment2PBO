package com.vlaywry;

import java.util.ArrayList;
import java.util.Scanner;


public class Main<command, pilih, i, args> {
    command linearguments;
    private static final Scanner sz = new Scanner(System.in);
    public static void main(String[] args) {


        System.out.println("======== E-futsal=========");
        System.out.println("Developed By Balmond Team");
        System.out.println("---------------------------");


        ArrayList nama = new ArrayList();
        ArrayList nohp = new ArrayList();
        ArrayList jenis = new ArrayList();
        ArrayList jamsewa = new ArrayList();
        ArrayList lamasewa = new ArrayList();
        ArrayList harga = new ArrayList();
        ArrayList subtotal = new ArrayList();

        int total = 0;
        int pilih = 0;

        do {
            System.out.println("PILIH JENIS LAPANGAN");
            System.out.println("1. Reguler");
            System.out.println("2. Vip");
            System.out.println("Pilih (1-2) = ");
            pilih = sz.nextInt();
            System.out.println("============================");
            sz.nextLine();
            System.out.print("Nama Pemesan = ");
            String n = sz.nextLine();
            nama.add(n);
            System.out.print("Nomor HP Pemesan = ");
            String no = sz.nextLine();
            nohp.add(no);
            System.out.print("Jam Sewa = ");
            String jam = sz.nextLine();
            jamsewa.add(jam);
            System.out.print("Lama Sewa = ");
            int lam = sz.nextInt();
            lamasewa.add(lam);
            System.out.print("Harga Sewa = ");
            int s = sz.nextInt();
            harga.add(s);

            switch (pilih) {
                case 1:
                    Lapangan r = new Reguler(lam, s);
                    r.Jenis();
                    jenis.add(r.getJenis());
                    r.setTotal();
                    subtotal.add(r.getTotal());
                    break;
                case 2:
                    Lapangan v = new Vip(lam, s);
                    v.Jenis();
                    jenis.add(v.getJenis());
                    v.setTotal();
                    subtotal.add(v.getTotal());
                    break;
            }
            System.out.println("==========================");
            System.out.println("3. Ada Lagi?");
            System.out.println("4. Cetak");
            System.out.print("Pilih [3/4]= ");
            pilih = sz.nextInt();
        } while (pilih != 4);

        System.out.println("==============================================================================================================================================");
        System.out.println("\tNama Pemesan \t\t NoHp \t\t Jenis Lapangan \t Jam Sewa \t Lama sewa \tHarga \t\t Subtotal");

        for (int i = 0; i < harga.size(); i++) {
            System.out.println((i + 1));
            System.out.print("\t" + nama.get(i));
            System.out.print("\t\t\t" + nohp.get(i));
            System.out.print("\t\t" + jenis.get(i));
            System.out.print("\t\t" + jamsewa.get(i) + "" + "Wib");
            System.out.print("\t" + lamasewa.get(i) + "" + "jam");
            System.out.print("\t\t" + harga.get(i));
            System.out.println("\t\t" + subtotal.get(i));
           // total = total + (int) subtotal.get(i);
        }
        System.out.println("Total= Rp "+ total);

        System.out.println("-------------- T E R I M A K A S I H -------------");

    }

}