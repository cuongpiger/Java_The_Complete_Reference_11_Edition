# 1. Chương trình đầu tiên - sơ bộ về Java _[A First Simple Program]_
## 1.1. Quy ước về cách đặt tên file trong Java
* Giả sử ta muốn tạo một chương trình có tên là **Example**, trước tiên ta cần tạo một file có tên là `Example.java`, với nội dung như sau:

###### Example.java _[source code](./Example.java)_
```java
/*
    Đây là một chương trình đơn giản của Java
    File này có tên là `Example.java`
*/
class Example {
    // Chương trình bắt đầu bằng việc gọi đến hàm main()
    public static void main(String args[]) {
        System.out.println("This is a simple Java program.");
    }
}
```
* Trong Java, **tất cả code phải nằm trong một `class`**.
* Ta có tên file là **Example** và tên `class` chứa hàm `main()` của file này cũng là **Example**, Java quy định tên của **main class** _[lớp chính]_ phải khớp với tên file chứa code của chương trình, kể cả tên file và tên `class` có viết hoa hay viết thường đi nữa phải bảo đảm khớp hoàn toàn vì Java có phân biệt chữ hoa và thường.

## 1.2. Biên dịch và chạy chương trình _[Compiling the program]_
* Để **compile** _[biên dịch]_ chương trình Example, thì tại thư mục chứa file `Example.java` ta mở terminal và gõ lệnh sau:
```
javac Example.java
```

* **Compiler** _[trình biên dịch]_ **`javac`** sẽ tạo ra một file mới có tên là **`Example.class`** chứa phiên bản bytecode của chương trình Example nằm ở cùng cấp thư mục với file `Example.java`.
  ![](../images/0.png)
* Để chạy chương trình, ngay tại thư mục chứa file `Example.class`, mở terminal và gõ lệnh dưới đây và nhấn enter:
```
java Example
```
  dưới đây là kết quả xuất ra terminal:
    ![](../images/1.png)