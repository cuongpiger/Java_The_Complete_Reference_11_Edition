# 1. Cơ bản về `class` _[Class Fundamentals]_
###### BoxDemo.java _[source code](./BoxDemo.java)_
```java
class Box {
    double width, height, depth;
}

class BoxDemo {
    public static void main(String args[]) {
        Box mybox = new Box();
        double vol;

        mybox.width = 10;
        mybox.height = 20;
        mybox.depth = 15;

        vol = mybox.width * mybox.height * mybox.depth;

        System.out.println("Volume is " + vol);
    }
}
```

> ##### Output:
> ![](../images/24.png)

###### BoxDemo2.java _[source code](./BoxDemo2.java)_
```java
class Box {
    double width, height, depth;
}


class BoxDemo2 {
    public static void main(String[] args) {
        Box mybox1 = new Box();
        Box mybox2 = new Box();
        double vol;

        mybox1.width = 10;
        mybox1.height = 20;
        mybox1.depth = 15;

        mybox2.width = 3;
        mybox2.height = 6;
        mybox2.depth = 9;

        vol = mybox1.width * mybox1.height * mybox1.depth;
        System.out.println("Volume mybox1 is: " + vol);

        vol = mybox2.width * mybox2.height * mybox2.depth;
        System.out.println("Volume mybox2 is: " + vol);
    }
}
```
> ##### Output:
> ![](../images/25.png)

# 2. Gán biến tham chiếu đến Object
```java
Box b1 = new Box();
Box b2 = b1;
```
* Lúc này `b1` và `b2` cùng tham chiếu đến cùng một object, mọi thay đổi trên `b1` đều sẽ ảnh hưởng đến `b2` và ngược lại.
* Để xóa bỏ việc `b2` tham chiếu đến `b1` hoặc ngược lại thì làm như sau:
```java
b2 = null;
// or
b1 = null;
```

# 3. Phương thức _[methods]_
###### BoxDemo3.java _[source code](./BoxDemo3.java)_
```java
class Box {
    double width, height, depth;

    void volume() {
        System.out.print("Volume is: ");
        System.out.println(width * height * depth);
    }
}

class BoxDemo3 {
    public static void main(String[] args) {
        Box box1 = new Box();
        Box box2 = new Box();

        box1.width = 10;
        box1.height = 20;
        box1.depth = 15;

        box2.width = 3;
        box2.height = 6;
        box2.depth = 9;

        box1.volume();

        box2.volume();
    }
}
```
> ##### Output:
> ![](../images/26.png)




