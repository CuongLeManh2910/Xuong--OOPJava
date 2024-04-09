
package qlpt11;

import java.util.Scanner;

/**
 *
 * @author vuxua
 */
public class MENU {
    public static void main(String[] args) {
        chucNang cn = new chucNang();
        Scanner sc = new Scanner(System.in);
        int n =0 ;
        do {
            System.out.println("|================================================|");
            System.out.println("|           ----------MENU----------             |");
            System.out.println("|   CN1: Nhap thong tin phong tro!               |");
            System.out.println("|   CN2: Xuat thong tin phong tro!               |");
            System.out.println("|   CN3: Tim kiem theo so phong                  |");
            System.out.println("|   CN4: Cap nhat thong tin phong                |");
            System.out.println("|   CN5: Xoa phong theo so phong duoc nhap       |");
            System.out.println("|   CN6: Sap xep theo tien tro                   |");
            System.out.println("|   CN7: Xuat 5 phong dong tien tro cao nhat     |");
            System.out.println("|   CN8: In phong co tien tro it nhat            |");
            System.out.println("|   CN9: In phong co tien tro cao nhat           |");
            System.out.println("|   CN10:Tim phong tro theo khoang tien phai dong|");
            System.out.println("|   CN0: Thoat khoi truong trinh                 |");
            System.out.println("|================================================|");
            System.out.println("Chọn chuc nang ban muon thuc hien!");
            n = sc.nextInt();
            switch (n){
                case 1:
                    cn.nhapThongTinPhongTro();
                    break;
                case 2:
                    cn.xuatThongTin();
                    break;
                case 3:
                    cn.timKiemTheoSoPhong();
                    break;
                case 4:
                    cn.capNhatThongTinPhong();
                    break;
                case 5:
                    cn.xoaTheoSoPhong();
                    break;
                case 6:
                    cn.sapXepTheoTienTro();
                    break;
                case 7:
                    cn.namPhongCoTienTroCaoNhat();
                    break;
                case 8:
                    cn.phongCoTienTroItNhat();
                    break;
                case 9:
                    cn.phongCoTienTroCaoNhat();
                    break;
                case 10:
                    cn.timPhongTrongKhoangTienDaDong();
                    break;
                case 0:
                    System.out.println("Da thoat khoi truong trinh!");
                    return ;
                default:
                    System.out.println("Khong co chuc nang ban muon thuc hien trong MENU!");
                    break;
            }
        }while (n!=0);
    }
    
}
