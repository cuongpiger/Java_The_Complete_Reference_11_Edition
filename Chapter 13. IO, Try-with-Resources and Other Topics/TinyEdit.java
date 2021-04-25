import java.io.*;

class TinyEdit {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] str = new String[100];

        System.out.println("Nhap vao mot dong.");
        System.out.println("Nhap 'stop' de dung lai.");
        for (int i = 0; i < 100; ++i) {
            str[i] = br.readLine();

            if (str[i].equals("stop")) break;
        }

        System.out.println("Day la cac dong ma ban nhap vao.");
        for (int i = 0; i < 100; ++i) {
            if (str[i].equals("stop")) break;

            System.out.println("-->" + str[i]);
        }
    }
}
