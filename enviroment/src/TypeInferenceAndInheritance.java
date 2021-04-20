class MyClass {
    // do something
}

class FirstDerivedClass extends MyClass {
    int x;
}

class SecodnDerivedClass extends FirstDerivedClass {
    int y;
}

class TypeInferenceAndInheritance {
    static MyClass getObj(int which) {
        switch (which) {
            case 0: return new MyClass();
            case 1: return new FirstDerivedClass();
            default: return new SecodnDerivedClass();
        }
    }

    public static void main(String args[]) {
        var mc1 = getObj(0);
        var mc2 = getObj(1);
        var mc3 = getObj(2);
        /* Thực chất cả ba biến mc1, mc2, mc3 đều có type là MyClass, dù trong
            hàm `getObj` ta đã trả về các class khác nhau dựa vào `which`
            nhưng ta định nghĩa kiểu dữ liệu trả về của `getObj` là `MyClass`
            nên khi ta dùng 2 dòng code dưới đây sẽ lỗi. */

        // mc2.x = 10; // lỗi vì MyClass ko có thuộc tính x;
        // mc3.y = 10; // lỗi vì MyClass ko có thuộc tính y;
    }
}
