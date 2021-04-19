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