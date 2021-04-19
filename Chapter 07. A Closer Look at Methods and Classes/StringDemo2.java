class StringDemo2 {
    public static void main(String args[]) {
        String s1 = "First String";
        String s2 = "Second String";
        String s3 = s1;

        System.out.println("Chiều dài của s1: " + s1.length());
        System.out.println("Kí tự tại index-3 của s1: " + s1.charAt(3));

        if (s1.equals(s2)) {
            System.out.println("s1 == s2");
        } else {
            System.out.println("s1 != s2");
        }

        if (s1.equals(s3)) {
            System.out.println("s1 == s3");
        } else {
            System.out.println("s1 != s3");
        }
    }
}
