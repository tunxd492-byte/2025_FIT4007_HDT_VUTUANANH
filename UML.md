// Đây là sơ đồ lớp mô tả các bài tập
classDiagram

// Bài 1: Account
class Account {
  - accountNumber: String
  - balance: double
  + Account(accountNumber: String, balance: double)
  + getAccountNumber(): String
  + getBalance(): double
  + setBalance(balance: double): void
}

// Bài 2: Book
class Book {
  - bookId: String
  - title: String
  - price: double
  - discount: double
  + Book(bookId: String, title: String)
  + Book(bookId: String, title: String, price: double, discount: double)
  + getBookId(): String
  + getTitle(): String
  + getPrice(): double
  + getDiscount(): double
  + setPrice(price: double): void
  + setDiscount(discount: double): void
  + getFinalPrice(): double
}

// Bài 3: Student
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

// Bài 4: Circle
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
