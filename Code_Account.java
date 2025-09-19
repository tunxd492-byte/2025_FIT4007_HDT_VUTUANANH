class Account {
  private String MaSTK;
  private double SoTien;

  public Account(String MaSTK,double SoTien){
    this.MaSTK=MaSTK;
    this.SoTien=SoTien;
  }
  public String getMaSTK(){
    return MaSTK;
  }
  public double getSoTien(){
    return SoTien;
  }
  public void setSoTien(double SoTien){
    this.SoTien=SoTien;
  }
  public void HienThi(){
    System.out.println("Thông tin tài khoản: ");
    System.out.println("Mã số tài khoản: " + MaSTK);
    System.out.println("Số tiền: " + SoTien);
  }
}
