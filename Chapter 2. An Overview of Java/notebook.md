# 1. Chương trình đầu tiên - sơ bộ về Java _[A First Simple Program]_
## 1.1. Quy ước về cách đặt tên file trong Java
* Giả sử ta tạo một file có tên là `Example.java`, với nội dung như sau:

###### Example.java
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

## 1.2. Biên dịch chương trình _[Compiling the program]_
