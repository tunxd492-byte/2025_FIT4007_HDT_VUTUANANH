import java.util.Scanner;

public class Circle {
    private double BanKinh;

    public Circle() {
        this.BanKinh = 1;
    }

    public Circle(double BanKinh) {
        this.BanKinh = BanKinh;

    public double getBanKinh() { return BanKinh; }
    public void setBanKinh(double BanKinh) { this.BanKinh = BanKinh; }

    public void input() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap ban kinh r: ");
        BanKinh = sc.nextDouble();
    }

    public void output() {
        System.out.println("Ban kinh r: " + BanKinh);
    }

    public double getDienTich() {
        return Math.PI * BanKinh * BanKinh;
    }

    public double getChuVi() {
        return 2 * Math.PI * BanKinh;
    }

    public static void main(String[] args) {
        Circle c = new Circle(); // mặc định r = 1
        System.out.println("Thong tin hinh tron:");
        c.output();

        c.input();
        System.out.println("\nThong tin hinh tron:");
        c.output();
        System.out.println("Dien tich hinh tron: " + c.getDienTich());
        System.out.println("Chu vi hinh tron: " + c.getChuVi());
    }
}
