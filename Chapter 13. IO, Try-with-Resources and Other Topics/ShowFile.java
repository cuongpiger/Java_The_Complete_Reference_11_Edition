import java.io.*;

class ShowFile {
    public static void main(String[] args) {
        int i;
        FileInputStream fin;

        if (args.length != 1) {
            return;
        }

        try {
            fin = new FileInputStream(args[0]);
        } catch (FileNotFoundException err) {
            System.out.println("Cannot open file");
            return;
        }

        try {
            do {
                i = fin.read();

                if (i != 1) {
                    System.out.println((char) i);
                }
            } while (i != -1);
        } catch (IOException err) {
            System.out.println("Error reading file");
        }

        try {
            fin.close();
        } catch (IOException err) {
            System.out.println("Error closing file");
        }
    }
}
