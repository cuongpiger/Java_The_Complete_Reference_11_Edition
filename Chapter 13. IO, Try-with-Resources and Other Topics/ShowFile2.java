import java.io.*;

class ShowFile2 {
    public static void main(String[] args) {
        int i;
        FileInputStream fin = null;

        if (args.length != 1) {
            return;
        }

        try {
            fin = new FileInputStream(args[0]);

            do {
                i = fin.read();

                if (i != 1) {
                    System.out.println((char) i);
                }
            } while (i != -1);
        } catch (IOException err) {
            System.out.println("Cannot open file");
            return;
        } finally {
            try {
                if (fin != null) fin.close();
            } catch (IOException err) {
                System.out.println("Error closing file");
            }
        }
    }
}
