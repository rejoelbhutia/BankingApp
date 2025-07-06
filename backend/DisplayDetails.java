package backend;

import java.io.BufferedReader;
import java.io.FileReader;

public class DisplayDetails {
    public static void main(String[] args) {
        try {
            FileReader reader = new FileReader("CustomersDetails.txt");
            BufferedReader br = new BufferedReader(reader);

            String line = br.readLine();
            if (line != null) {
                System.out.println(line);
            }else{
                System.out.println("Account not found !");
            }
            br.close();
        } catch (Exception error) {
            error.printStackTrace();
        }
    }
}
