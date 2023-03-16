package tokokostum;

import java.util.ArrayList;
import java.util.Scanner;

public class kostum {
    private final String kodeK = "K";
    private long noKodeK;
    protected String nama, ukuran, stok;
    public int hargaBeli;


    kostum(String nama, String ukuran, String stok, int hargaBeli, long noKode){
        this.nama = nama;
        this.ukuran = ukuran;
        this.stok = stok;
        this.hargaBeli = hargaBeli;
        this.noKodeK = noKode;
    }

    kostum() {
        //UNTUK MENGATASI EROR DI MAIN
    }


    public String getKodeK() {
        return kodeK;
    }

    public long getNoKodeK() {
        return noKodeK;
    }

    public String getNama() {
        return nama;
    }

    public String getUkuran() {
        return ukuran;
    }

    public String getStok() {
        return stok;
    }

    public int getHargaBeli() {
        return hargaBeli;
    }

    public kostum getK() {
        return K;
    }

    public ArrayList<kostum> getKList() {
        return KList;
    }

    public Scanner getInp() {
        return inp;
    }

    public Scanner getInputInt() {
        return inputInt;
    }

    kostum K;
    ArrayList<kostum> KList = new ArrayList<>();
    Scanner inp = new Scanner(System.in);
    Scanner inputInt = new Scanner(System.in);
    protected void tambahKostum (){
        boolean ulang=true;
        System.out.println("\nMenambahkan Kostum\n");
        System.out.print("Nama Kostum : ");
        nama = inp.nextLine();
        System.out.print("Ukuran Baju Kostum : ");
        ukuran = inp.nextLine();
        System.out.print("Stok Kostum : ");
        stok = inp.nextLine();
        while(ulang){
            System.out.print("Harga Beli Kostum : ");
            String strHarga=inp.nextLine();
            if (strHarga.equals("0")){
                System.err.println("Data Ini Tidak Boleh Bernilai 0");
            }
            else{
                try{
                    hargaBeli = (Integer.parseInt(strHarga));
                    noKodeK++;
                    System.out.println("No Kode Produk : " + kodeK + noKodeK);
                    K = new kostum(nama, ukuran, stok, hargaBeli, noKodeK); // OBJEK ke - 1
                    KList.add(K);
                    System.out.println("\n>> Tambah Data Kostum Berhasil <<");
                    ulang=false;
                }catch(Exception e){
                    System.err.println("Data Yang anda masukkan tidak sesuai");
                }
            }
        }
    }
    protected void tampilKostum(){
        System.out.println("\nMenampilkan Kostum\n");
        for (int i=0; i<KList.size(); i++){
            System.out.println("No Kode Produk : " + kodeK + KList.get(i).getNoKodeK());
            System.out.println("Nama Kostum : " + KList.get(i).getNama());
            System.out.println("Ukuran Kostum : " + KList.get(i).getUkuran());
            System.out.println("Harga Beli Kostum: Rp" + KList.get(i).hargaBeli);
            System.out.println("Harga Jual Kostum : Rp" +
                    (KList.get(i).hargaBeli+(KList.get(i).hargaBeli*0.2)));
            System.out.println("Stok Kostum : " + KList.get(i).getStok());
            System.out.println(" ");
        }
    }
    public void hapusKostum() {
        System.out.println("\nMenghapus Kostum\n");
        for (int i=0; i<KList.size(); i++){
            System.out.println("No Kode Produk : " + kodeK +
                    KList.get(i).getNoKodeK());
            System.out.println("Nama Kostum : " + KList.get(i).getNama());
            System.out.println(" ");
            // System.out.println("Index ["+i+"] Nama Produk : " + arrMakan.get(i).nama);
        }
        int hapus;
        System.out.print("\nInput No Kode untuk Hapus [Input Angka Belakang] : ");
        hapus = inputInt.nextInt();
        hapus--;
        KList.remove(hapus);
        System.out.println("\n>> Hapus Produk Furniture Berhasil <<\n");
    }
    public ArrayList<kostum> ubahKostum(ArrayList<kostum> Klist) {
        int ubah;
        System.out.println("\nMengubah Data Kostum\n");
        for (int i=0; i<KList.size(); i++){
            System.out.println("No Kode Produk : " + kodeK +
                    KList.get(i).getNoKodeK());
            System.out.println("Nama Peralatan : " + KList.get(i).getNama());
            System.out.println(" ");
            // System.out.println("Index ["+i+"] Nama Produk : " + arrMakan.get(i).nama);
        }
        if (KList.size() == 1){
            ubah = 0;
        } else {
            System.out.print("\nInput No Kode untuk Edit [Input Angka Belakang] : ");
            ubah = inputInt.nextInt();
            ubah--;
        }
        System.out.print("\nNama Baru : ");
        KList.get(ubah).nama = (inp.nextLine());
        System.out.print("Ukuran Baru : ");
        KList.get(ubah).ukuran = inp.nextLine();
        System.out.print("Stok Baru : ");
        KList.get(ubah).stok = inp.nextLine();
        System.out.print("Harga Baru : ");
        KList.get(ubah).hargaBeli = inputInt.nextInt();
        System.out.println("\n>> Edit Data Kostum Berhasil <<\n");

        return KList;
    }
}
