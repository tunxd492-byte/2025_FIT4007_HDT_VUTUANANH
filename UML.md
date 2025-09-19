```mermaid
%% Đây là sơ đồ lớp mô tả các bài tập
classDiagram

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
  - studentId: String
  - name: String
  - birthYear: int
  - address: String
  + Student(studentId: String, name: String)
  + Student(studentId: String, name: String, birthYear: int, address: String)
  + getStudentId(): String
  + getName(): String
  + getBirthYear(): int
  + getAddress(): String
  + setBirthYear(birthYear: int): void
  + setAddress(address: String): void
  + getAge(): int
}

%% Bài 4: Circle
class Circle {
  - radius: double
  + Circle()
  + Circle(radius: double)
  + getRadius(): double
  + setRadius(radius: double): void
  + input(): void
  + output(): void
  + getArea(): double
  + getPerimeter(): double
}
