import java.io.*;

public class Fileipop {

    public static void main(String[] args) {
        File fs;
        File fo;

        try {
            fs = new File("source.txt");
            FileInputStream fin = new FileInputStream(fs);
            fo = new File("destination.txt");

            FileOutputStream fout = new FileOutputStream(fo);
            while (fin.available() != 0) {

                fout.write(fin.read());
            }
            fin.close();
            fout.close();

        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());

        } catch (IOException e) {
            System.out.println("Input output exception");

        }  
    }
}
