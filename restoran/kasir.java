package restoran;

import java.util.Scanner;

public class kasir {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        boolean pesan = true;
        makanan menu = new makanan();
        pembayaran bayar = new pembayaran();
        konsumen pelanggan = new konsumen();
        String[] menus = {};
        int[] forStruk = {};
        int[] hargaBarang = {};
        int[] total1 = {};
        menu.daftarMenu();
        pelanggan.cekMember();

        while (pesan) {
            int jumlahBarang = 0;
            System.out.print("Masukan pesanan anda: ");
            int pesanan = s.nextInt();
            System.out.print("Mau pesan berapa? ");
            jumlahBarang = s.nextInt();
            menu.namaMenu(pesanan, pelanggan.getMember());
            bayar.setTotalHarga(jumlahBarang, menu.getHarga());
            menus = pesanan(menus, menu.getNama());
            forStruk = jumlah(forStruk, jumlahBarang);
            hargaBarang = harga(hargaBarang, menu.getHarga());
            total1 = totalHarga1(total1, bayar.getHarga());
            System.out.print("Pesan lagi ? (y/n) ");
            String pemesanan = s.next();
            switch (pemesanan) {
                case "n":
                    pesan = false;
                    System.out.println();
                    break;
                case "y":
                    pesan = true;
            }

        }

        System.out.print("Masukan Pembayaran: ");
        int uang = s.nextInt();
        pelanggan.setUang(uang);
        bayar.setKembalian(uang, Total(total1));
        if (pelanggan.uang > Total(total1)) {
            bayar.Struk(forStruk, hargaBarang, pelanggan.member, menus, total1, Total(total1), uang,
                    bayar.getKembalian());
        } else {
            bayar.batal();
        }

        s.close();
    }

    public static String[] pesanan(String[] pemesanan, String makanan) {
        String[] menu = new String[pemesanan.length + 1];
        for (int i = 0; i < pemesanan.length; i++) {
            menu[i] = pemesanan[i];
        }
        menu[menu.length - 1] = makanan;
        return menu;
    }

    public static int[] jumlah(int[] old, int quantity) {
        int[] newJumlah = new int[old.length + 1];
        for (int i = 0; i < old.length; i++) {
            newJumlah[i] = old[i];
        }
        newJumlah[newJumlah.length - 1] = quantity;
        return newJumlah;
    }

    public static int[] harga(int[] old, int harga) {
        int[] newHarga = new int[old.length + 1];
        for (int i = 0; i < old.length; i++) {
            newHarga[i] = old[i];
        }
        newHarga[newHarga.length - 1] = harga;
        return newHarga;
    }

    public static int[] totalHarga1(int[] old, int totHarga) {
        int[] newHarga = new int[old.length + 1];
        for (int i = 0; i < old.length; i++) {
            newHarga[i] = old[i];
        }
        newHarga[newHarga.length - 1] = totHarga;
        return newHarga;
    }

    public static int Total(int[] totalHarga) {
        int sum = 0;
        for (int i = 0; i < totalHarga.length; i++) {
            sum += totalHarga[i];
        }
        return sum;

    }

}