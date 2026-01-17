import java.io.*;

class Main65 { // CopyBytes.
    public static void main(String args[]) {
        FileInputStream infile = null;
        FileOutputStream outfile = null;
        byte byteRead;
        try {
            infile = new FileInputStream("in.dat");
            outfile = new FileOutputStream("out.dat");
            do {
                byteRead = (byte) infile.read();
                outfile.write(byteRead);
            } while (byteRead != -1);
        } catch (FileNotFoundException e) {
            System.out.println("File not Found");
        } catch (IOException e) {
            System.out.println(e.getMessage());
        } finally {
            try {
                infile.close();
                outfile.close();
            } catch (IOException e) {
            }
        }
    }
}