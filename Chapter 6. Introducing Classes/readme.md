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


