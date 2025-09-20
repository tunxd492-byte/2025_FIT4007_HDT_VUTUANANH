```mermaid

class Diagram

%% Bài 1: Account
class Account {
  - MaSTK: String
  - SoTien: double
  + Account(MaSTK: String, SoTien: double)
  + getMaSTK(): String
  + getSoTien(): double
  + setSoTien(SoTien: double): void
}

%% Bài 2: Book
class Book {
  - MaS: String
  - TenS: String
  - GiaS: double
  - GiamGia: double
  + Book(MaS: String, TenS: String)
  + Book(MaS: String, TenS: String, GiaS: double, GiamGia: double)
  + getMaS(): String
  + getTenS(): String
  + getGiaS(): double
  + setGiaS(price: double): void
  + getGiamGia(): double
  + setGiamGia(discount: double): void
  + getGiaBanSach(): double
}

%% Bài 3: Student
class Student {
  - Msv: String
  - HoTen: String
  - NamSinh: int
  - DiaChi: String
  + Student(Msv: String, HoTen: String)
  + Student(Msv: String, HoTen: String, NamSinh: int, DiaChi: String)
  + getMsv(): String
  + getHoTen(): String
  + getNamSinh(): int
  + getDiaChi(): String
  + getNamSinh(birthYear: int): void
  + setDiaChi(address: String): void
  + getTinhTuoi(): int
}

%% Bài 4: Circle
class Circle {
  - BanKinh: double
  + VongTron()
  + VongTron(radius: double)
  + getBanKinh(): double
  + setBanKinh(radius: double): void
  + input(): void
  + output(): void
  + getDienTich(): double
  + getChuVi(): double
}
