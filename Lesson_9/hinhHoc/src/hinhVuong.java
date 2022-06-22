public class hinhVuong extends hinhHoc{
    double doDaiCanh;


    @Override
    public void tinhChuVi() {
        System.out.println("Chu vi hình vuông là: "+ (doDaiCanh * 4));
    }

    @Override
    public void tinhDienTich() {
        System.out.println("Diện tích hình vuông là: "+ (doDaiCanh * doDaiCanh));
    }
}
