public class Book {
  private String Mas;
  private String TenS;
  private double GiaS;
  private double GiamGia;

  public Book(String MaS, String TenS){
    this.MaS = MaS;
    this.TenS = TenS;
    this.giaS = 0;
    this.giamGia = 0;
  }
  public Book(String MaS, String TenS, double GiaS, double GiamGia) {
      this.MaS = MaS;
      this.TenS = TenS;
      this. GiaS = GiaS;
      this.GiamGia = GiamGia;
  }
  public String getMaS(){
    return MaS;
  }
  public String getTen(){
    return TenS;
  }
  public double getGiaS(){
    return GiaS;
  }
  public void setGiaS(double GiaS){
    this.GiaS= GiaS;
  }
  public double getGiamGia(){
    return GiamGia;
  }
  public void setGiamGia(double GiamGia){
    this.GiamGia = GiamGia;
  }
  public double getGiaBanSach(){
    return giaS - giaS * (giamGia / 100);
  }
   public void inThongTin() {
        System.out.println("Mã sách: " + maSach);
        System.out.println("Tên sách: " + tenSach);
        System.out.println("Giá sách: " + giaSach);
        System.out.println("Giảm giá: " + giamGia + "%");
        System.out.println("Giá bán: " + tinhGiaBan());
        System.out.println("-------------------------");
  }
 public class Main {
    public static void main(String[] args) {
        Book sach1 = new Book("B001", "Lập Trình Java", 100000, 10);
        System.out.println("Thông tin sách ban đầu:");
        sach1.inThongTin();
        sach1.setGiamGia(20);
        System.out.println("Thông tin sách sau khi thay đổi giảm giá:");
        sach1.inThongTin();
  }
}
