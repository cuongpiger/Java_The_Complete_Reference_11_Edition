import java.io.*;

class CopyFile {
    public static void main(String[] args) throws IOException {
        int i;
        FileInputStream fin = null;
        FileOutputStream fout = null;

        if (args.length != 2) {
            return;
        }

        try {
            fin = new FileInputStream(args[0]);
            fout = new FileOutputStream(args[1]);

            do {
                i = fin.read();
                if (i != -1) fout.write(i);
            } while (i != -1);
        } catch (IOException err) {
            System.out.println("I/O Error");
        } finally {
            try {
                if (fin != null) fin.close();
            } catch (IOException err) {
                System.out.println("Error closing input file");
            }

            try {
                if (fout != null) fout.close();
            } catch (IOException err) {
                System.out.println("Error closing output file");
            }
        }
    }
}
