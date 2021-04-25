import java.io.*;

class ShowFile1 {
    public static void main(String[] args) {
        int i;

        if (args.length != 1) {
            return;
        }

        try (FileInputStream fin = new FileInputStream(args[0])) {
            do {
                i = fin.read();

                if (i != -1) {
                    System.out.println((char) i);
                }
            } while (i != -1);
        } catch (FileNotFoundException err) {
            System.out.println("File not found");
        } catch (IOException err) {
            System.out.println("An I/O error occurred");
        }
    }
}
