# 1. Kế thừa _[Inheritance Basics]_
###### SimpleInheritance.jav _[source code](./SimpleInheritance.java)_
```java
class A {
    int i, j;

    void showij() {
        System.out.println("i & j: " + i + " " + j);
    }
}

class B extends A {
    int k;

    void showk() {
        System.out.println("k: " + k);
    }

    void sum() {
        System.out.println("i + j + k = " + (i + j + k));
    }
}

class SimpleInheritance {
    public static void main(String args[]) {
        A a = new A();
        B b = new B();

        a.i = 10; a.j = 20;
        System.out.println("--> Lớp A");
        a.showij();
        System.out.println();

        b.i = 7;
        b.j = 8;
        b.k = 9;
        System.out.println("--> Lớp B");
        b.showij();
        b.showk();
        System.out.println();

        System.out.println("Tổng của i, j và k trong b: ");
        b.sum();
    }
}
```
![](../images/63.png)

## 1.1. Member access and Inheritance
###### Access.java _[source code](./Access.java)_
```java
class A {
    int i;
    private int j;

    void setij(int x, int y) {
        i = x; j = y;
    }
}

class B extends A {
    int total; // default khi biến dc khai báo Java sẽ assign nó bằng 0

    void sum() {
        // total = i + j; // dòng này lỗi, do biến j chỉ dc định nghĩa là private, nên
                // các lớp khác dù có kế thừa cũng ko thể sử dụng biến này
        System.out.println("Đây là B.sum()");
    }
}

class Access {
    public static void main(String args[]) {
        B b = new B();
        b.setij(10, 12);
        b.sum();

        System.out.println("B.total = " + b.total);
    }
}
```
![](../images/64.png)

## 1.2. A More Practical Example
###### DemoBoxWeight.java _[source code](./DemoBoxWeight.java)_
```java
class Box {
    double width, height, depth;

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

class BoxWeight extends Box {
    double weight;

    BoxWeight(double w, double h, double d, double m) {
        width = w;
        height = h;
        depth = d;
        weight = m;
    }
}

class ColorBox extends Box {
    int color;

    ColorBox(double w, double h, double d, int c) {
        width = w;
        height = h;
        depth = h;
        color = c;
    }
}

class DemoBoxWeight {
    public static void main(String args[]) {
        BoxWeight bw1 = new BoxWeight(10, 20, 15, 34.3);
        BoxWeight bw2 = new BoxWeight(2, 3, 4, 0.076);

        System.out.println("Thể tích của bw1 là: " + bw1.volume());
        System.out.println("Cân nặng của bw1 là: " + bw1.weight);

        System.out.println("Thể tích cùa bw2 là: " + bw2.volume());
        System.out.println("Cân nặng của bw2 là: " + bw2.weight);
    }
}

```
![](../images/65.png)

## 1.3. Các biến lớp cha có thể tham chiếu đến các biến lớp con _[A Suplerclass Variable Can Reference a Subclass Object]_
###### RefDemo.java _[source code](./RefDemo.java)_
```java
class Box {
    double width, height, depth;

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

class BoxWeight extends Box {
    double weight;

    BoxWeight(double w, double h, double d, double m) {
        width = w;
        height = h;
        depth = d;
        weight = m;
    }
}

class RefBox {
    public static void main(String args[]) {
        BoxWeight bw1 = new BoxWeight(3, 5, 7, 8.37);
        Box box = new Box();

        System.out.println("Thể tích của bw1 là: " + bw1.volume());
        System.out.println("Cân nặng của bw1 là: " + bw1.weight);

        box = bw1; // tham chiếu đến bw1 để sử dụng các method của nó
        System.out.println("Biến box tham chiếu bw1.volume(): " + box.volume());
        // System.out.println("Biến box tham chiếu bw1.weight: " + box.weight); // dòng này
            // ko hợp lệ vì Box ko có thuộc tính weight
    }
}
```
![](../images/66.png)
* Khi này `box` tham chiếu đến `bw1` để lấy các thuộc tính thuộc về chính nó _(tức dc khai báo trong class `Box`)_, từ đó sử dụng các thuộc tính dc lấy này để tính toán p.thức `box.volume()`.

# 2. Sử dụng `super` _[Using `super`]_
## 2.1. Sử dụng `super` để gọi các constructor của lớp cha từ lớp con _[Using `super` to Call Superclass Constructors]_
