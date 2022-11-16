package restoran;

public class makanan {
    String nama;
    int harga;
    int diskon;
    int kuantitas;

    public void namaMenu(int pesanan, boolean member) {
        if (pesanan == 1 && !member) {
            this.nama = "Rendang";
            this.harga = 20000;
        } else if (pesanan == 2 && !member) {
            this.nama = "Soto";
            this.harga = 15000;
        } else if (pesanan == 3 && !member) {
            this.nama = "Seblak";
            this.harga = 25000;
        } else if (pesanan == 1 && member) {
            this.nama = "Rendang";
            this.harga = 20000 - (20000 * 5 / 100);
        } else if (pesanan == 2 && member) {
            this.nama = "Soto";
            this.harga = 15000 - (15000 * 10 / 100);
        } else if (pesanan == 3 && member) {
            this.nama = "Seblak";
            this.harga = 25000 - (25000 * 15 / 100);
        }

        else {
            this.nama = "null";
            this.harga = 0;
        }
    }

    public String getNama() {
        return nama;
    }

    public int getHarga() {
        return harga;
    }

    public void daftarMenu() {
        System.out.println("----Selamat Datang----");
        System.out.println("---------Menu---------");
        System.out.println("1. Rendang   Rp. 20000");
        System.out.println("2. Soto      Rp. 15000");
        System.out.println("3. Seblak    Rp. 25000");
        System.out.println("----------------------");
    }

}
