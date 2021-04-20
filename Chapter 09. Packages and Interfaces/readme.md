# 1. _[Packages]_
###### mypack/AccountBalance.java _[source code](.mypack/../mypack/AccountBalance.java)_
```java
package mypack;

class Balance {
    String name;
    double bal;

    Balance(String n, double b) {
        name = n;
        bal = b;
    }

    void show() {
        if (bal < 0) {
            System.out.print("--> ");
        }

        System.out.println(name + ": $" + bal);
    }
}

class AccountBalance {
    public static void main(String args[]) {
        Balance current[] = new Balance[3];

        current[0] = new Balance("Harry Potter", 123.23);
        current[1] = new Balance("Ron Weasley", 154.56);
        current[2] = new Balance("Hermione Ranger", -89.02);

        for (var x: current) x.show();
    }
}
```
![](../images/78.png)

# 2. _[Packages and Member Access]_
<div align="center">

  ![](../images/79.png)

</div>

## 2.1. _[An Access Example]_
###### p1 _[source code](./p1)_
![](../images/80.png)

###### p2 _[source code](./p2)_
![](../images/81.png)

# 3. _[Importing Packages]_
###### TestBalance.java _[source code](./TestBalance.java)_
![](../images/82.png)
# 4. _[Interfaces]_
* Khi một class implement một interface, thì class này phải định nghĩa toàn bộ các p.thức mà interface đó có và toàn bộ các method này phải dc định nghĩa là `public`.
###### TestIface.java _[source code](./TestIface.java)_
```java
interface CallBack {
    void callback(int param);
}

class Client implements CallBack {
    public void callback(int p) { // bắt buộc method phải là public
        System.out.println("Client.callback() với giá trị p = " + p);
    }

    void nonIfaceMeth() {
        System.out.println("Một p.thức thông thường trong một class của Java");
    }
}

class TestIface {
    public static void main(String args[]) {
        CallBack c = new Client(); // dùng interface để tạo một object từ class khác
        c.callback(42);
    }
}
```
![](../images/83.png)

###### TestIface2.java _[source code](./TestIface2.java)_
```java
interface CallBack {
    void callback(int param);
}

class Client implements CallBack {
    public void callback(int p) { // bắt buộc method phải là public
        System.out.println("Client.callback() với giá trị p = " + p);
    }

    void nonIfaceMeth() {
        System.out.println("Một p.thức thông thường trong một class của Java");
    }
}

class AnotherClient implements CallBack {
    public void callback(int p) {
        System.out.println("--> AnotherClient.callback()");
        System.out.println("    p^2 = " + (p * p));
    }
}

class TestIface2 {
    public static void main(String args[]) {
        CallBack c = new Client(); // dùng interface để tạo một object từ class khác
        AnotherClient ac = new AnotherClient();

        c.callback(7);

        System.out.println();
        c = ac;
        c.callback(42);
    }
}
```
![](../images/84.png)

<hr>

* Trong trường hợp lớp implement lớp interface mà ko định nghĩa toàn bộ method mà lớp interface định nghĩa, thì lớp đó phải dc định nghĩa `abstract`.
###### TestIface3.java _[source code](./TestIface3.java)_
```java
interface CallBack {
    void callback(int param);
}

abstract class Client implements CallBack {
    static void show() {
        System.out.println("Đây là p.thức Client.show()");
    }
}

class TestIface3 {
    public static void main(String args[]) {
        // CallBack c = new Client(); // dòng này lỗi do lúc này Client là abstract
        Client.show();
    }
}
```
![](../images/85.png)

## 4.1. Interface lồng nhau _[Nested Interfaces]_
###### NestedIfDemo.java _[source code](./NestedIfDemo.java)_
```java
class A {
    public interface NestIf {
        boolean isNegative(int x);
    }
}

class B implements A.NestIf {
    public boolean isNegative(int x) {
        return x >= 0 ? true : false;
    }
}

class NestedIfDemo {
    public static void main(String args[]) {
        A.NestIf nif = new B();

        if (nif.isNegative(10)) {
            System.out.println("10 là số dương");
        }

        if (!nif.isNegative(-69)) {
            System.out.println("-69 là số âm");
        }
    }
}
```
![](../images/86.png)