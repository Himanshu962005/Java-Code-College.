import java.io.*;

class Main64 { // WriteBytes.
    public static void main(String args[]) {
        byte cities[] = { 'R', 'A', 'I', 'P', 'U', 'R', '\n', 'J', 'A', 'I', 'P', 'U', 'R', '\n', 'I', 'N', 'D', 'I',
                'A', '\n' };
        FileOutputStream outfile = null;
        try {
            outfile = new FileOutputStream("City.txt");
            outfile.write(cities);
            outfile.close();
        } catch (IOException ioe) {
            System.out.println("ioe");
            System.exit(-1);
        }
    }
}