
package qlpt11;

public class PVIP extends PhongTro{
    private double tienGuiXeOto;
    private double tienTroCoDinh;

    public PVIP(int soPhong, String tenChuPhong, double soDienDaDung, double soNuocDaDung, double tienWifi, double tienChiPhiPhong,  double tienGuiXeOto, double tienTroCoDinh) {
        super(soPhong, tenChuPhong, soDienDaDung, soNuocDaDung, tienWifi, tienChiPhiPhong);
        this.tienGuiXeOto = tienGuiXeOto;
        this.tienTroCoDinh = tienTroCoDinh;
    }

    public PVIP(double tienGuiXeOto, double tienTroCoDinh) {
        this.tienGuiXeOto = tienGuiXeOto;
        this.tienTroCoDinh = tienTroCoDinh;
    }
    public PVIP(){

    }

    public double getTienGuiXeOto() {
        return tienGuiXeOto;
    }

    public double getTienTroCoDinh() {
        return tienTroCoDinh;
    }

    public void setTienGuiXeOto(double tienGuiXeOto) {
        this.tienGuiXeOto = tienGuiXeOto;
    }

    public void setTienTroCoDinh(double tienTroCoDinh) {
        this.tienTroCoDinh = tienTroCoDinh;
    }

    @Override
    public void Nhap(){
        super.Nhap();
        System.out.print("Nhap tien gui xe: ");
        tienGuiXeOto = sc.nextDouble();
        System.out.print("Nhap tien tro co dinh: ");
        tienTroCoDinh = sc.nextDouble();
    }

    @Override
    public double getTienChiPhiPhong() {
        return getSoDienDaDung() + getSoNuocDaDung() + getTienWifi()+getTienGuiXeOto();
    }

    @Override
    public double tinhTienTro(){
        return getTienChiPhiPhong()+getTienTroCoDinh();
    }

    @Override
    public void Xuat() {
        super.Xuat();
        System.out.println("Tien gui xe oto la: "+getTienGuiXeOto()+ "| Tong tien chi phi phong la: "+getTienChiPhiPhong()+"| Tien tro co dinh la: "+getTienTroCoDinh()+"| Tong tien tro phai dong la: "+tinhTienTro());
    }
}

