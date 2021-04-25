import java.io.*;

class CopyFile1 {
    public static void main(String[] args) throws IOException {
        int i;

        if (args.length != 2) {
            return;
        }

        try (FileInputStream fin = new FileInputStream(args[0]);
            FileOutputStream fout = new FileOutputStream(args[1])) {
            do {
                i = fin.read();

                if (i != -1) fout.write(i);
            } while (i != -1);
        } catch (IOException err) {
            System.out.println("I/O error");
        }
    }
}
