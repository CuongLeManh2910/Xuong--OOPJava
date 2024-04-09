package qlpt11;

import java.util.Scanner;

public abstract class PhongTro {

    private int soPhong;
    private String tenChuPhong;
    private double soDienDaDung;
    private double soNuocDaDung;
    private double tienWifi;
    private double tienChiPhiPhong;
    Scanner sc = new Scanner(System.in);

    public PhongTro() {
    }

    public PhongTro(int soPhong, String tenChuPhong, double soDienDaDung, double soNuocDaDung, double tienWifi, double tienChiPhiPhong) {
        this.soPhong = soPhong;
        this.tenChuPhong = tenChuPhong;
        this.soDienDaDung = soDienDaDung;
        this.soNuocDaDung = soNuocDaDung;
        this.tienWifi = tienWifi;
        this.tienChiPhiPhong = tienChiPhiPhong;
    }

    public int getSoPhong() {
        return soPhong;
    }

    public String getTenChuPhong() {
        return tenChuPhong;
    }

    public double getSoDienDaDung() {
        if (soDienDaDung > 0 && soDienDaDung <= 50) {
            return (soDienDaDung * 1.549);
        } else if (soDienDaDung > 50 && soDienDaDung <= 100) {
            return soDienDaDung * 1.600;
        } else if (soDienDaDung > 100 && soDienDaDung <= 200) {
            return soDienDaDung * 1.858;
        } else if (soDienDaDung > 200 && soDienDaDung <= 300) {
            return soDienDaDung * 2.340;
        } else if (soDienDaDung > 300 && soDienDaDung <= 400) {
            return soDienDaDung * 2.615;
        } else {
            return soDienDaDung * 2.701;
        }
    }

    public double getTienWifi() {
        return tienWifi;
    }


    public double getSoNuocDaDung() {
        if (soNuocDaDung > 0 && soNuocDaDung <= 50) {
            return (soNuocDaDung * 1.549);
        } else if (soNuocDaDung > 50 && soNuocDaDung <= 100) {
            return soNuocDaDung * 1.600;
        } else if (soNuocDaDung > 100 && soNuocDaDung <= 200) {
            return soNuocDaDung * 1.858;
        } else if (soNuocDaDung > 200 && soNuocDaDung <= 300) {
            return soNuocDaDung * 2.340;
        } else if (soNuocDaDung > 300 && soNuocDaDung <= 400) {
            return soNuocDaDung * 2.615;
        } else {
            return soNuocDaDung * 2.701;
        }
    }

    public double getTienChiPhiPhong() {
        return getSoDienDaDung() + getSoNuocDaDung() + getTienWifi();
    }


    public void setSoPhong(int soPhong) {
        this.soPhong = soPhong;
    }

    public void setSoDienDaDung(double soDienDaDung) {
        this.soDienDaDung = soDienDaDung;
    }

    public void setSoNuocDaDung(double soNuocDaDung) {
        this.soNuocDaDung = soNuocDaDung;
    }

    public void setTenChuPhong(String tenChuPhong) {
        this.tenChuPhong = tenChuPhong;
    }

    public void setTienWifi(double tienWifi) {
        this.tienWifi = tienWifi;
    }

    public void setTienChiPhiPhong(double tienChiPhiPhong) {
        this.tienChiPhiPhong = tienChiPhiPhong;
    }



    public void Nhap() {
        System.out.print("Moi nhap so phong: ");
        soPhong = sc.nextInt();
        System.out.print("Moi nhap ten chu phong: ");
        tenChuPhong = new Scanner(System.in).nextLine();
        System.out.print("Moi nhap so dien da dung: ");
        soDienDaDung = sc.nextInt();
        System.out.print("Moi nhap so nuoc da dung: ");
        soNuocDaDung = sc.nextInt();
        System.out.print("Moi tien wifi: ");
        tienWifi = sc.nextInt();
    }


    abstract double tinhTienTro();

    public void Xuat() {
        System.out.println("Chu phong: "+getTenChuPhong() + "| So phong: "+getSoPhong()+"| Tien dien: "+getSoDienDaDung()+"| Tien nuoc: "+getSoNuocDaDung()+"| Tien wifi: "+getTienWifi());
    }
}

