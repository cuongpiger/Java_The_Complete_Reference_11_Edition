# 1. Nạp chồng phương thức _[Overloading Methods]_
* Java tự động tìm phương thức phù hợp dựa vào kiểu dữ liệu của tham số và kết quả trả về.
###### Overload.java _[source code](./Overload.java)_
```java
class OverloadDemo {
    void test() {
        System.out.println("Hàm test: ko tham số");
    }

    void test(int a) {
        System.out.println("a: " + a);
    }

    void test(int a, int b) {
        System.out.println("a và b: " + a + " - " + b);
    }

    double test(double a) {
        System.out.println("double a: " + a);
        return a*a;
    }
}

class Overload {
    public static void main(String args[]) {
        OverloadDemo od = new OverloadDemo();
        double res;

        od.test();
        od.test(10);
        od.test(10, 20);
        res = od.test(123.45);
        System.out.println("Kết quả của od.test(123.45) là: " + res);
    }
}
```
![](../images/32.png)

<hr>

* Tuy nhiên ko phải lúc nào Java cũng đủ khôn để chọn ra phương thức chính xác, bỏi vì Java có cơ chế là tự động **thăng kiểu dữ liệu** hãy xem ví dụ dưới đây.

###### Overload1.java _[source code](./Overload1.java)_
```java
class OverloadDemo {
    void test() {
        System.out.println("Hàm test: ko tham số");
    }

    void test(int a, int b) {
        System.out.println("a và b: " + a + " - " + b);
    }

    void test(double a) {
        System.out.println("double a: " + a);
    }
}

class Overload1 {
    public static void main(String args[]) {
        OverloadDemo od = new OverloadDemo();
        int integer = 69;

        od.test();
        od.test(10, 20);

        od.test(integer); // gọi đến `test(double a)` do cơ chế thăng kiểu dữ liệu
        od.test(123.45);
    }
}
```
![](../images/33.png)

* Vì trong class `OverloadDemo` ko có phương thức `void test(int a)` nên khi Java ko tìm thấy nó thăng hạng tham số đầu vào và sau đó gọi đến phương thức `void test(double a)`.

## 1.1. Overloading Constructors
###### OverloadCons.java _[source code](./OverloadCons.java)_
```java
class Box {
    double width, height, depth;

    Box(double w, double h, double d) {
        width = w;
        height = h;
        depth = d;
    }

    Box() {
        width = height = depth = -1;
    }

    Box(double len) {
        width = height = depth = len;
    }

    double volume() {
        return width * height * depth;
    }
}

class OverloadCons {
    public static void main(String args[]) {
        Box box1 = new Box(10, 20, 15);
        Box box2 = new Box();
        Box box3 = new Box(7);

        System.out.println("Thể tích của box1 là: " + box1.volume());
        System.out.println("Thể tích của box2 là: " + box2.volume());
        System.out.println("Thể tích của box3 là: " + box3.volume());
    }
}
```
![](../images/34.png)

# 2. Sử dụng Object như là một tham số _[Using Objects as Parameters]_
###### PassOb.java _[source code](./PassOb.java)_
```java
class Test {
    int a, b;

    Test(int i, int j) {
        a = i;
        b = j;
    }

    boolean equalTo(Test other) {
        if (other.a == a && other.b == b) {
            return true;
        }

        return false;
    }
}

class PassOb {
    public static void main(String args[]) {
        Test ob1 = new Test(100, 22);
        Test ob2 = new Test(100, 22);
        Test ob3 = new Test(-1, -1);

        System.out.println("ob1 == ob2: " + ob1.equalTo(ob2));
        System.out.println("ob1 == ob3: " + ob1.equalTo(ob3));
    }
}
```
![](../images/35.png)

<hr>

* Đôi khi ta cần phải copy một object sang một object khác, ta có thể sử dụng phương thức constructor để làm điều này.
```java
class Box {
    double width, height, depth;

    // copy constructor
    Box(Box other) {
        width = other.width;
        height = other.height;
        depth = other.depth;
    }

    Box(double w, double h, double d) {
        width = w;
        height = h;
        depth = d;
    }

    Box() {
        width = height = depth = -1;
    }

    Box(double len) {
        width = height = depth = len;
    }

    double volume() {
        return width * height * depth;
    }
}

class OverloadCons2 {
    public static void main(String args[]) {
        Box box1 = new Box(10, 20, 15);
        Box box2 = new Box();
        Box box3 = new Box(7);
        Box box_clone = new Box(box1);

        System.out.println("Thể tích của box1 là: " + box1.volume());
        System.out.println("Thể tích của box2 là: " + box2.volume());
        System.out.println("Thể tích của box3 là: " + box3.volume());
        System.out.println("Thể tích của box_clone là: " + box_clone.volume());
    }
}
```
![](../images/36.png)

# 3. Tìm hiểu về cách truyền đối số _[A Closer Look at Argument Passing]_
* Khi ta truyền đối số vào một phương thức mà kiểu giá trị của đối số này là các kiểu giá trị nguyên thủy của Java, thì dù trong phương thức đó ta có xào nấu biến này thành giống gì đi nữa thì sau khi kết thúc phương thức, giá trị của các đối số vẫn sẽ **ko thay đổi**.
###### CallByValue.java _[source code](./CallByValue.java)_
```java
class Test {
    void meth(int i, int j) {
        i *= 2;
        j /= 2;
        // Biến tấu cỡ nào cũng ko thay đổi giá trị của i và j sau khi kết thúc phương thức
    }
}

class CallByValue {
    public static void main(String args[]) {
        Test ob = new Test();

        int a = 15, b = 20;

        System.out.println("Giá trị của a và b trc khi gọi hàm meth: " + a + " " + b);

        ob.meth(a, b);

        System.out.println("Giá trị của a và b sau khi gọi hàm meth: " + a + " " + b);
    }
}
```
![](../images/37.png)

<hr>

* Tuy nhiên khi đối số truyền vào ko phải là kiểu dữ liệu nguyên thủy của Java, thì khi các thuộc tính của object này bị xào nấu trong phương thức mà nó dc truyền vào - sau khi phương thức kết thúc, các thuộc tính này sẽ bị thay đổi.
###### PassObjRef.java _[source code](./PassObjRef.java)_
```java
class Test {
    int a, b;

    Test(int i, int j) {
        a = i;
        b = j;
    }

    void meth(Test other) {
        other.a *= 2;
        other.b /= 2;
        // Các thuộc tính của một object sẽ bị thay đổi khi kết thúc phương thức
    }
}

class PassObjRef {
    public static void main(String args[]) {
        Test ob = new Test(15, 20);

        System.out.println("Giá trị của ob.a và ob.b trc khi gọi hàm meth: " + ob.a + " " + ob.b);

        ob.meth(ob);

        System.out.println("Giá trị của ob.a và ob.b sau khi gọi hàm meth: " + ob.a + " " + ob.b);
    }
}
```
![](../images/38.png)

# 4. Phương thức trả về object _[Returning Objects]_
###### RetOb.java _[source code](./RetOb.java)_
```java
class Test {
    int a;

    Test(int i) {
        a = i;
    }

    Test incrByTen() {
        return new Test(a + 10);
    }
}


class RetOb {
    public static void main(String args[]) {
        Test ob1 = new Test(2);
        Test ob2;

        ob2 = ob1.incrByTen();

        System.out.println("ob1.a: " + ob1.a);
        System.out.println("ob2.a: " + ob2.a);

        ob2 = ob2.incrByTen();
        System.out.println("ob2.a sau khi gọi p.thức incrByTen() hai lần: " + ob2.a);
    }
}
```
![](../images/39.png)

# 5. Đệ quy _[Recursion]_
###### Recursion.java _[source code](./Recursion.java)_
```java
class Factorial {
    int fact(int n) {
        int res;

        if (n == 1) {
            return 1;
        }

        res = fact(n - 1) * n;
        return res;
    }
}

class Recursion {
    public static void main(String args[]) {
        Factorial f = new Factorial();

        System.out.println("3 giai thừa bằng " + f.fact(3));
        System.out.println("4 giai thừa bằng " + f.fact(4));
        System.out.println("5 giai thừa bằng " + f.fact(5));
    }
}
```
![](../images/40.png)

###### Recursion2.java _[source code](./Recursion2.java)_
```java
class RecTest {
    int values[];

    RecTest(int i) {
        values = new int[i];
    }

    void printArray(int i) {
        if (i == 0) return;

        printArray(i - 1);
        System.out.println("[" + (i - 1) + "] " + values[i - 1]);
    }
}

class Recursion2 {
    public static void main(String args[]) {
        RecTest ob = new RecTest(10);

        for (int i = 0; i < 10; ++i) {
            ob.values[i] = i;
        }

        ob.printArray(10);
    }
}
```
![](../images/41.png)

# 6. Quyền truy cập _[Introducing Access Control]_
* Hãy bắt đầu với hai quyền là **public** và **private**:
###### AccessTest.java _[source code](./AccessTest.java)_
```java
class Test {
    int a;
    public int b;
    private int c;

    void setc(int i) {
        c = i;
    }

    int getc() {
        return c;
    }
}

class AccessTest {
    public static void main(String args[]) {
        Test ob = new Test();
        ob.a = 10;
        ob.b = 20;

        // ob.c = 100; // dòg này sai vì `c` dc định nghĩa là private
        ob.setc(100);
        System.out.println("Giá trị của a, b, c lần lượt là: " + ob.a + " " + ob.b + " " + ob.getc());
    }
}
```
![](../images/42.png)

###### TestStack.java _[source code](./TestStack.java)_
```java
class Stack {
    private int stack[] = new int[10];
    private int tos;

    Stack() {
        tos = -1;
    }

    void push(int item) {
        if (tos == 9) {
            System.out.println("Stack is fulll");
        } else {
            stack[++tos] = item;
        }
    }

    int pop() {
        if (tos < 0) {
            System.out.println("Stack underflow");
            return 0;
        }

        return stack[tos--];
    }
}

class TestStack {
    public static void main(String args[]) {
        Stack stack1 = new Stack();
        Stack stack2 = new Stack();

        for (int i = 0; i < 10; ++i) stack1.push(i);
        for (int i = 10; i < 20; ++i) stack2.push(i);

        System.out.println("--> stack1:");
        for (int i = 0; i < 10; ++i) {
            System.out.println(stack1.pop());
        }

        System.out.println("--> stack2:");
        for (int i = 0; i < 10; ++i) {
            System.out.println(stack2.pop());
        }

        // stack1.tos = -2; // ko dc vì `tos` dc định nghĩa là private
        // stack2.stack[3] = 100; // ko dc vì `stack` dc định nghiã là private
    }
}
```
![](../images/43.png)