import java.time.Year;

public class Student {
    private String Msv;
    private String HoTen;
    private int NamSinh;
    private String DiaChi;
    
    public Student(String Msv, String HoTen) {
        this.Msv = Msv;
        this.HoTen = HoTen;
    }
    public Student(String Msv, String HoTen, int NamSinh, String DiaChi) {
        this.Msv = Msv;
        this.HoTen = HoTen;
        this.NamSinh = NamSinh;
        this.DiaChi = DiaChi;
    }
    public String getMsv() { return Msv; }
    public String getHoTen() { return HoTen; }
    public int getNamSinh() { return NamSinh; }
    public String getDiaChi() { return DiaChi; }

    public void setNamSinh(int NamSinh) { this.NamSinh = NamSinh; }
    public void setDiaChi(String DiaChi) { this.DiaChi = DiaChi; }

    public int getTinhTuoi() {
        int currentYear = Year.now().getValue();
        return currentYear - NamSinh;

    public void displayInfo() {
        System.out.println("- Ma sinh vien: " + Msv);
        System.out.println("- Ho ten: " + HoTen);
        System.out.println("- Nam sinh: " + NamSinh);
        System.out.println("- Dia chi: " + DiaChi);

    public static void main(String[] args) {
        Student sv = new Student("151234", "Nguyen Van A", 1997, "123 Nguyen Trai, Thanh Xuan, Ha Noi");

        System.out.println("Thong tin sinh vien:");
        sv.displayInfo();
        System.out.println("Tuoi cua sinh vien: " + sv.getTinhTuoi() + " tuoi");
    }
}
