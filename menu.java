package tokokostum;

import java.util.ArrayList;
import java.util.Scanner;

public class menu {
    static String option, admin;
    static Scanner input = new Scanner(System.in);
    static kostum K = new kostum();// OBJEK
    static ArrayList<kostum> KList;//ARRAYLIST

    public static void menu(){
        Boolean ulang,ulang2;
        System.out.println("\tWELCOME\n");
        ulang = true;
        while (ulang) {
            menuAwal();
            switch (option) {
                case "1":
                    ulang2=true;
                    while(ulang2){
                        DaftarKostum();
                        switch (admin){
                            case "1":
                                K.tambahKostum();
                                break;
                            case "2":
                                K.tampilKostum();
                                break;
                            case "3":
                                K.ubahKostum(KList);
                                break;
                            case "4":
                                K.hapusKostum();
                                break;
                            case "5":
                                ulang2=false;
                                break;
                            case "6":
                                System.err.println("\n!! Anda Telah Keluar dari Program !!\n");
                                System.exit(0);
                            default:
                                System.err.println("\n!! Pilihan Tidak Tersedia !!\n");
                                break;
                        }
                    }
                    break;
                case "2":
                    System.err.println("\n!! Anda Telah Keluar dari Program !!\n");
                    System.exit(0);

                default:
                    System.err.println("\n!! Pilihan Tidak Tersedia !!\n");
                    break;
            }
        }
    }
    public static String DaftarKostum (){
        System.out.println();
        System.out.println("Menu Kostum");
        System.out.println("1. Tambah Kostum");
        System.out.println("2. Tampilkan Kostum");
        System.out.println("3. Edit Kostum");
        System.out.println("4. Hapus Kostum");
        System.out.println("5. Kembali ke Menu Awal");
        System.out.println("6. Exit Program");
        System.out.print("Masukan Pilihan menu : ");
        admin = input.nextLine();
        return admin;
    }
    public static String menuAwal (){
        System.out.println();
        System.out.println("Toko Penyewaan Kostum");
        System.out.println("1. Produk Kostum");
        System.out.println("2. Exit Program");
        System.out.print("Masukan Pilihan menu : ");
        option = input.nextLine();
        return option;
    }


    public static void main(String[] args) {
        menu();
    }
}
