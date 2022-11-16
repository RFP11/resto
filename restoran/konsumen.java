package restoran;

import java.util.Scanner;

public class konsumen {
    int uang;
    boolean member;
    Scanner s = new Scanner(System.in);

    public void cekMember() {
        System.out.print("Apakah anda member ? (y/n)");
        String pilMember = s.next();
        switch (pilMember) {
            case "y":
                this.member = true;
                break;

            case "n":
                this.member = false;
                break;
        }
    }

    public boolean getMember() {
        return member;
    }

    public void setUang(int uang) {
        this.uang = uang;
    }

    public int getUang() {
        return uang;
    }

}
