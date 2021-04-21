# 1. _[Exception-Handling Fundamentals]_
# 2. Các loại ngoại lệ _[Exception Type]_
# 3. _[Uncaught Exceptions]_
# 4. _[Using `try` and `catch`]_
###### Exc22.java _[source code](./Exc2.java)_
```java
class Exc2 {
    public static void main(String args[]) {
        int d, a;

        try {
            d = 0;
            a = 42 / d;

            System.out.println("Dòng này sẽ ko bao h dc in ra.");
        } catch (ArithmeticException err) { // bắt lỗi chia cho 0
            System.out.println("==> Lỗi chia 0.");
        }

        System.out.println("--> Dòng này dc in ra sau khi bắt lỗi.");
    }
}
```
![](../images/100.png)

###### HandleError.java _[source code](./HandleError.java)_
```java
import java.util.Random;

class HandleError {
    public static void main(String args[]) {
        int a, b, c;
        a = b = c = 0;

        Random r = new Random();

        for (int i = 0; i < 32000; ++i) {
            try {
                b = r.nextInt();
                c = r.nextInt();
                a = 12345 / (b / c);
            } catch (ArithmeticException err) {
                System.out.println("==> Lỗi chia 0.");
                System.out.println("b & c: " + b + " " + c);

                return;
            }
        }
    }
}
```
![](../images/101.png)

## 4.1. Hiển thị chi tiết lỗi _[Displaying a Description of an Exception]_
###### HandleError2.java _[source code](./HandleError2.java)_
```java
import java.util.Random;

class HandleError2 {
    public static void main(String args[]) {
        int a, b, c;
        a = b = c = 0;

        Random r = new Random();

        for (int i = 0; i < 32000; ++i) {
            try {
                b = r.nextInt();
                c = r.nextInt();
                a = 12345 / (b / c);
            } catch (ArithmeticException err) {
                System.out.println("==> Error: " + err);
                System.out.println("b & c: " + b + " " + c);

                return;
            }
        }
    }
}
```
![](../images/102.png)

# 5. _[Multiple `catch` Clauses]_
###### MultipleCatches.java _[source code](./MultipleCatches.java)_
```java
class MultipleCatches {
    public static void main(String args[]) {
        try {
            int a = args.length;
            System.out.println("args.length = " + a);

            int b = 42/a;
            int c[] = {1};
            c[42] = 99;
        } catch (ArithmeticException err) {
            System.out.println("==> Lỗi toán học: " + err);
        } catch (ArrayIndexOutOfBoundsException err) {
            System.out.println("==> Lỗi tràn vùng nhớ mảng: " + err);
        }

        System.out.println("--> Sau khi bắt xong lỗi.");
    }
}
```
![](../images/103.png)
![](../images/104.png)

<hr>

* Cần lưu ý trường hợp dưới đây.

```java
class SuperSubCatch {
    public static void main(String args[]) {
        try {
            int a = 0;
            int b = 42/a;
        } catch (Exception err) {
            System.out.println("==> Lỗi ngoại lệ: " + err);
        } /* catch (ArithmeticException err) {
            System.out.println("==> Lỗi toán học: " + err);
        } */
        /*
        * Dòng trên ko cần thiết, vì ArithmeticException là lớp con của Exception, nên
        *   nếu lỗi Exception dc bắt thì lỗi ArithmeticException sẽ ko bao h dc chạy, nên
        *   Java sẽ la làng lên ns là m code ngu, code thừa, thông báo lỗi chính tả.
        * */
    }
}
```