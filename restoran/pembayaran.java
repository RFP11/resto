package restoran;

public class pembayaran {
    int jumlah;
    int hargaBarang;
    boolean member;
    int kembalian;
    int akhirTotal;

    public void Struk(int[] kuantitas, int[] hargaMenu, boolean cekMember, String[] namaMenu, int[] total1, int total,
            int uang, int kembali) {
        System.out.println("-------------Struk--------------");
        System.out.println("Pesanan Kamu:");
        System.out.println("--------------------------------");
        for (int i = 0; i < namaMenu.length; i++) {
            System.out.println(namaMenu[i] + "  " + kuantitas[i] + "  " + hargaMenu[i] + "  " + total1[i]);
        }
        System.out.println("--------------------------------");
        System.out.println("Member     : " + cekMember);
        System.out.println("Total Harga: " + total);
        System.out.println("Pembayaran : " + uang);
        System.out.println("Kembalian  : " + kembali);
        System.out.println("-----------TerimaKasih----------");
    }

    public void setTotalHarga(int kuantitas, int harga) {
        this.hargaBarang = kuantitas * harga;
    }

    public int getHarga() {
        return hargaBarang;
    }

    public void setKembalian(int uang, int total) {
        this.kembalian = total - uang;
    }

    public int getKembalian() {
        return kembalian;
    }

    public void batal() {
        System.out.println("--------------------------------");
        System.out.println("Maaf pesanan anda kami batalkan");
        System.out.println("Karena uang anda tidak mencukupi");
        System.out.println("--------------------------------");
    }
}
