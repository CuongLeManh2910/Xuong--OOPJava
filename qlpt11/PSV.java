package qlpt11;

import java.util.Scanner;

public class PSV extends PhongTro {
    private double TienMayGiat;
    private double TienDayPhoi;
    private double tienTroCoDinh;
     Scanner sc = new Scanner(System.in);

    public double getTienMayGiat() {
        return TienMayGiat;
    }

    public double getTienDayPhoi() {
        return TienDayPhoi;
    }

    public double getTienTroCoDinh() {
        return tienTroCoDinh;
    }

    public void setTienMayGiat(double tienMayGiat) {
        TienMayGiat = tienMayGiat;
    }

    public void setTienDayPhoi(double tienDayPhoi) {
        TienDayPhoi = tienDayPhoi;
    }

    public void setTienTroCoDinh(double tienTroCoDinh) {
        this.tienTroCoDinh = tienTroCoDinh;
    }

    public PSV(int soPhong, String tenChuPhong, double soDienDaDung, double soNuocDaDung, double tienWifi, double tienChiPhiPhong, double tienMayGiat, double tienDayPhoi, double tienTroCoDinh) {
        super(soPhong, tenChuPhong, soDienDaDung, soNuocDaDung, tienWifi, tienChiPhiPhong);
        TienMayGiat = tienMayGiat;
        TienDayPhoi = tienDayPhoi;
        this.tienTroCoDinh = tienTroCoDinh;
    }

    public PSV(){
    }

    @Override
    public void Nhap() {
        super.Nhap();
        System.out.print("Moi nhap tien may giat: ");
        TienMayGiat = sc.nextDouble();
        System.out.print("Moi nhap tien day phoi: ");
        TienDayPhoi = sc.nextDouble();
        System.out.print("Nhap tien tro co dinh: ");
        tienTroCoDinh = sc.nextDouble();
    }

    @Override
    public double getTienChiPhiPhong() {
        return getSoDienDaDung() + getSoNuocDaDung() + getTienWifi()+getTienDayPhoi()+getTienMayGiat();
    }

    @Override
    public double tinhTienTro(){
        return getTienChiPhiPhong()+getTienTroCoDinh();
    }


    @Override
    public void Xuat() {
        super.Xuat();
        System.out.println("Tien may giat: "+getTienMayGiat()+"| Tien day phoi: "+getTienDayPhoi()+"| Tong tien chi phi phong la: "+getTienChiPhiPhong()+"| Tien tro co dinh la: "+getTienTroCoDinh()+"| Tong tien tro phai dong la: "+tinhTienTro());
    }
}
