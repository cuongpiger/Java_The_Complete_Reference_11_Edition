# 1. Các kiểu dữ liệu nguyên thủy của Java _[The Primitive Types]_
* Java định nghĩa 8 kiểu dữ liệu nguyên thủy: **byte**, **short**, **int**, **long**, **char**, **float**, **double** và **boolean** và 8 kiểu này dc chia vào 4 nhóm chính:
  * **Integers**: bao gồm **byte**, **short**, **int** và **long** dành cho số có dấu và mang giá trị nguyên.
  * **Floating-point numbers**: bao gồm **float** và **double**, đại diện cho các số thực.
  * **Characters**: chỉ gồm **char**, đại diện cho **kí tự chữ** và **kí tự số**.
  * **Boolean**: chỉ gồm **boolean**, đại diện cho giá trị đúng sai `true/false`.

# 2. Nhóm Integers _[Integers]_
|Name|Bytes|Range|
|-|-|-|
|`long`|64|[-9,223,372,036,854,775,808; 9,223,372,036,854,775,807]|
|`int`|32|[-2,147,483,648; 2,147,483,647]|
|`short`|16|[-32,768; 32,767]|
|`byte`|8|[-128; 127]|

###### Light.java _[source code](./Light.java)_
```java
/*
    Chương trình tính khoảng cách ánh sáng sử dụng kiểu dữ liệu `long`
    File `Light.java`
*/
class Light {
    public static void main(String args[]) {
        int light_speed;
        long days, seconds, distance;

        days = 1000;
        light_speed = 186000; // xấp xỉ tốc độ ánh sáng thành met/second
        seconds = days*24*60*60;
        distance = light_speed*seconds;

        System.out.print("In " + days);
        System.out.print(" days light will travel about ");
        System.out.println(distance + " miles.");
    }
}
```

> ##### Output:
> ![](../images/6.png)

# 3. Nhóm Floating-point numbers
|Name|Bytes|Range|
|-|-|-|
|`double`|64|[4.9e-324; 1.8e+308]|
|`float`|32|[1.4e-045; 3.4e+038]|

###### Area.java _[source code](./Area.java)_
```java
/*
    File `Area.java`
*/
class Area {
    public static void main(String args[]) {
        double pi, r, a;

        r = 10.8;
        pi = 3.1416;
        a = pi*r*r;

        System.out.println("Area of circle is " + a);
    }
}
```

> ##### Output:
> ![](../images/7.png)

# 4. Nhóm Characters
* Sử dụng Unicode để biểu diễn các kí tự, tức một kí tự là 16 bits = 2 bytes, phạm vi của một kí tự là từ [0, 65,536] và ko có kí tự âm.
###### CharDemo.java _[source code](./CharDemo.java)_
```java
/*
    File `CharDemo.java`
*/
class CharDemo {
    public static void main(String args[]) {
        char ch1, ch2;

        ch1 = 88; // mã unicode cho kí tự X
        ch2 = 'Y';

        System.out.print("ch1 and ch2: ");
        System.out.println(ch1 + " " + ch2);
    }
}
```

> ##### Output:
> ![](../images/8.png)

###### CharDemo2.java _[source code](CharDemo2.java)_
```java
/*
    File `CharDemo2.java`
*/
class CharDemo2 {
    public static void main(String args[]) {
        char ch1;

        ch1 = 'X';
        System.out.println("ch1 contains " + ch1);

        ch1++;
        System.out.println("ch1 is now " + ch1);
    }
}
```

> ##### Output:
> ![](../images/9.png)

# 5. Nhóm Booleans
###### BoolTest.java _[source code](./BoolTest.java)_
```java
/*
    File `BoolTest.java`
*/
class BoolTest {
    public static void main(String args[]) {
        boolean b;

        b = false;
        System.out.println("b is " + b);

        b = true;
        System.out.println("b is " + b);

        // nếu b == true
        if (b) System.out.println("This is executed.");

        System.out.println("10 > 9 is " + (10 > 9));
    }
}
```

> ##### Output:
> ![](../images/10.png)

# 6. Biến _[Variables]_
###### DynInit.java _[source code](./DynInit.java)_
```java
/*
    File `DynInit.java`
*/
class DynInit {
    public static void main(String args[]) {
        double a = 3., b = 4.;
        double c = Math.sqrt(a*a + b*b);

        System.out.println("Hypotenuse is " + c);
    }
}
```
> ##### Output:
> ![](../images/11.png)

## 6.1. Phạm vị và quảng đời của biến _[Scope & Lifetime of Variables]_
###### Scope.java _[source code](./Scope.java)_
```java
/*
    File `Scope.java`
*/
class Scope {
    public static void main(String args[]) {
        int x = 10; // lúc này biến x dc định nghĩa trên toàn hàm main()

        if (x == 10) { // bắt đầu một scope mới, tạm gọi là s
            int y = 20; // y chỉ dc định nghĩa bên trong scope s
            
            System.out.println("x and y: " + x + " " + y);
            
            // cả x và y đều dc hiểu bên trong scope s này
            x = y * 2;
        }

        // y = 100; // Error!, lúc này y đã rời khỏi scope s và chưa dc khai báo

        // x lúc này vẫn dc hiểu do nó dc định nghĩa trên toàn hàm main()
        System.out.println("x is " + x); 
    } 
}
```

> ##### Output:
> ![](../images/12.png)

###### LifeTime.java _[source code](LifeTime.java)_
```java
/*
    File `LifeTime.java`
*/
class LifeTime {
    public static void main(String args[]) {
        for (int x = 0; x < 3; x++) {
            int y = -1;

            System.out.println("y is: " + y); // y dc khởi tạo mỗi khi truy cập vào scope này

            y = 100;
            System.out.println("y is now: " + y);
        }
    }
}
```

> ##### Output:
> ![](../images/13.png)

# 7. Chuyển đổi kiểu dữ liệu _[Type conversion and Casting]_
* Đối với các biến có cùng một nhóm dữ liệu, thì Java sẽ auto chuyển kiểu dữ liệu giúp, giả sử ép kiểu từ `int` sang `long` (tuy nhiên ko thể ép ngược lại từ `long` sang `int` do phạm vi của `int` nhỏ hơn `long`). Tất cả điều trên dc gọi là conversion.
* Đối vs các biến khác nhóm dữ liệu nhau, như việc ta muốn ép kiểu một biến có type là `double` sang `byte` thì Java sẽ ko tự động ép cho chúng ta, mà ta phải thực hiện thủ công bằng một kĩ thuật là **casting**.

## 7.1. Casting
###### Conversion.java _[source code](./Conversion.java)_
```java
/*
    File `Conversion.java`
*/
class Conversion {
    public static void main(String args[]) {
        byte b;
        int i = 257;
        double d = 232.142;

        System.out.println("Conversion of int to byte.");
        b = (byte) i;
        System.out.println("i and b " + i + " " + b);

        System.out.println("\nConversion of double to int.");
        i = (int) d;
        System.out.println("d and i " + d + " " + i);

        System.out.println("\nConversion of double to byte.");
        b = (byte) d;
        System.out.println("d and b " + d + " " + b);
    }
}
```

> ##### Output:
> ![](../images/14.png)

# 8. Tự động thăng hạng kiểu trong biểu thức _[Automatic type promotion in Expressions]_
* Giả sử ta có đoạn mã sau:
```java
byte a = 40;
byte b = 50;
byte c = 100;
int d = a * b / c;
```
* Kết quả của phép tính `a * b` lúc này sẽ vượt quá giới hạn của kiểu `byte`. Để giải quyết điều này, Java sẽ tự động ép kiểu từng biến sang kiểu `int` rồi sau đó thực hiện tính toán để bảo đảm ko bị tràn phạm vị của biến.
* Tuy nhiên, đoạn code dưới đây sẽ phát sinh lỗi:
```java
byte b = 50;
b = b * 2; // Error! ko thể gán kiểu int cho byte dc
```
* Lỗi này xảy ra vì như thường lệ, Java sẽ tự động ép kiểu từng biến trong biểu thức sang kiểu `int` trc khi nó thực hiện tính toán, nên phép toán `b * 2` lúc này sẽ trả về kiểu `int` chứ ko phải `byte`, nhưng kiểu `int` lại có phạm vị lớn hơn `byte` nên ko thể gán dc, lúc này ta phải thực hiện casting như dưới đây để tránh lỗi:
```java
byte b = 50;
b = (byte) (b * 2);
```
* Lúc này biến `b` sẽ có giá trị là 100.

## 8.1. Quy tắc thăng hạng _[The type promotion rules]_
* Các kiểu như `byte`, `short` và `char` đều thăng hạng lên `int`.
* Nếu biểu thức có một **operand** _[toán hạng, biến trong biểu thức]_ là `long`, thì toàn bộ biểu thức sẽ dc thăng hạng lên `long`.
* Tương tự, nếu có một operand là `float` thì toàn bộ biểu thức sẽ dc thăng hạng lên `float`, điều tương tự cũng dc áp dụng khi có một operand là `double`.

###### Promote.java _[source code](./Promote.java)_
```java
/*
    File `Promote.java`
*/
class Promote {
    public static void main(String args[]) {
        byte b = 42;
        char c = 'a';
        short s = 1024;
        int i = 50_000;
        float f = 5.67f;
        double d = .1234;
        double result = (f * b) + (i / c) - (d * s);

        System.out.println((f * b) + " + " + (i / c) + " - " + (d * s));
        System.out.println("result = " + result);
    }
}
```

> ##### Output:
> ![](../images/15.png)
* Biểu thức con `(f * b)` dc thăng cấp thành `float`, sau đó `(i / c)` dc thăng cấp thành `int`, tiếp theo `(d * s)` dc thăng cấp thành `double`, cuối cùng ta có `float` + `int` - `double` nên toàn bộ dc thăng cấp lên `double` nên kiểu của toàn bộ biểu thức là `double`.

# 9. Mảng _[Arrays]_
