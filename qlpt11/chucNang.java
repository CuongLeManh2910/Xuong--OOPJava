package qlpt11;

import java.util.ArrayList;
import static java.util.Arrays.equals;
import java.util.Collections;
import static java.util.Collections.list;
import java.util.Comparator;
import java.util.Scanner;


public class chucNang {
    ArrayList<PhongTro> dspt = new ArrayList<>();
    Scanner sc = new Scanner(System.in);

    public void nhapThongTinPhongTro() {
        int chon;
        System.out.print("Bạn cần nhập bao nhiêu phòng?: ");
        chon = sc.nextInt();
        for(int i = 0; i < chon; i++ ){
            System.out.println(" ");
            System.out.printf("Mời nhập thông tin phòng %d:\n",i+1);
            System.out.println("1: Phong sinh vien!");
            System.out.println("2: Phong gia dinh!");
            System.out.println("3: Phong vip!");
            System.out.println("Ban chon loai phong nao trong cac phong duoi day:  ");
            int n = sc.nextInt();

            switch(n){
                case 1:
                    PSV psv = new PSV();
                    psv.Nhap();
                    dspt.add(psv);
                    break;
                case 2:
                    PGD pgd = new PGD();
                    pgd.Nhap();
                    dspt.add(pgd);
                    break;
                case 3:
                    PVIP vip = new PVIP();
                    vip.Nhap();
                    dspt.add(vip);
                    break;
                default:
                    System.out.println("Ban da nhap sai. Vui long thuc hien lai!");
            }
        }

    }

    public void xuatThongTin() {
        if (dspt.size()>0) {
            for (PhongTro xuat : dspt) {
                xuat.Xuat();
                System.out.println(" ");
            }
        }else {
            System.out.println("Danh sach trong!");
        }
    }

    public void timKiemTheoSoPhong() {
        int m;
        if (dspt.size()>0) {
            System.out.print("Nhap vao so phong ban muon tim trong danh sach: ");
            m = sc.nextInt();
            for (PhongTro tk : dspt) {
                if (tk.getSoPhong()== m) {
                    System.out.println("Thong tin phong tro ban muon tim la: ");
                    tk.Xuat();
                    break;
                }
            }
        }else {
            System.out.println("Danh sach trong");
        }
    }

    public void xoaTheoSoPhong() {
        int ma;
        if (dspt.size() > 0) {
            System.out.print("Nhap vao so phong ban muon xoa: ");
            ma = sc.nextInt();
            for (PhongTro xoa : dspt) {
                if (ma == xoa.getSoPhong()) {
                    dspt.remove(xoa);
                    break;
                }
                System.out.println("Xoa thanh cong!");
            }
        } else {
            System.out.println("Danh sach trong");
        }

    }

    public void capNhatThongTinPhong() {
        int n;
        if (dspt.size()>0) {
            System.out.print("Nhap vao so phong ma ban muon cap nhat: ");
            n = sc.nextInt();
            for (PhongTro cp : dspt) {
                if (n == cp.getSoPhong()) {
                    cp.Nhap();
                }
            }
            System.out.println("Cap nhat thanh cong!");
        }else {
            System.out.println("Danh sach trong!");
        }
    }

    public void sapXepTheoTienTro() {
        if (dspt.size()>0) {
            Comparator<PhongTro> cop = new Comparator<PhongTro>() {
                @Override
                public int compare(PhongTro o1, PhongTro o2) {
                    if (o1.tinhTienTro() < o2.tinhTienTro()) {
                        return 1;
                    }
                    return -1;
                }
            };
            Collections.sort(dspt, cop);
            xuatThongTin();
        }else{
            System.out.println("Danh sach trong!");
        }
    }

    public void namPhongCoTienTroCaoNhat() {
        if (dspt.size()>0) {
            Comparator<PhongTro> cop = new Comparator<PhongTro>() {
                @Override
                public int compare(PhongTro o1, PhongTro o2) {
                    if (o1.tinhTienTro() < o2.tinhTienTro()) {
                        return 1;
                    }
                    return -1;
                }
            };
            Collections.sort(dspt, cop);
            System.out.println("5 phong tro co tien tro phai dong cao nhat la : ");

            if (dspt.size() <= 5) {
                for (int i = 0; i < dspt.size(); i++) {
                    dspt.get(i).Xuat();
                }
            } else {
                for (int i = 0; i > 5; i++) {
                    dspt.get(i).Xuat();
                }
            }
        }else {
            System.out.println("Danh sach trong!");
        }
    }

    public void phongCoTienTroItNhat(){
        PhongTro highestPaidEmployee = dspt.get(0);
        for (PhongTro nv : dspt){
            if(nv.tinhTienTro() < highestPaidEmployee.tinhTienTro()){
                highestPaidEmployee = nv;
            }

        }
        System.out.printf("Phong co tien tro thap nhat la: So phong: %d | Ten chu phong: %s | Tien chi phi: %2f | Tien phai tra: %.2f",highestPaidEmployee.getSoPhong(), highestPaidEmployee.getTenChuPhong(), highestPaidEmployee.getTienChiPhiPhong(), highestPaidEmployee.tinhTienTro());
        System.out.println(" ");
    }

    public void phongCoTienTroCaoNhat(){
        PhongTro highestPaidEmployee = dspt.get(0);
        for (PhongTro nv : dspt){
            if(nv.tinhTienTro() > highestPaidEmployee.tinhTienTro()){
                highestPaidEmployee = nv;
            }

        }
        System.out.printf("Phong co tien tro cao nhat la: So phong: %d | Ten chu phong: %s | Tien chi phi: %2f | Tien phai tra: %.2f",highestPaidEmployee.getSoPhong(), highestPaidEmployee.getTenChuPhong(), highestPaidEmployee.getTienChiPhiPhong(), highestPaidEmployee.tinhTienTro());
        System.out.println(" ");
    }

    public void timPhongTrongKhoangTienDaDong(){
        if (dspt.size()>0) {
            int min;
            int max;
            System.out.print("Nhap khoang tien bat dau :  ");
            min = sc.nextInt();
            System.out.print("Nhap khoang tien ket thuc:  ");
            max = sc.nextInt();
            for (PhongTro tim : dspt) {
                if (tim.tinhTienTro() > min && tim.tinhTienTro() < max) {
                    tim.Xuat();
                }else{
                    System.out.println("Khong co phong tro nam trong khoang tien can tim");
                }
            }
        }else{
            System.out.println("Danh sach trong!");
        }
    }

}
