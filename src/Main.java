import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {

        //Enter data using BufferReader
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println(menu());

        // Reading data using readLine
        String name = reader.readLine();

        // Printing the read line
        System.out.println(name);
    }

    private static String menu() {
        return "Menu (Choose number):" + "\n" +
                "1. Create an order" + "\n" +
                "2. Company/User CRUD" + "\n" +
                "3. Price CRUD" + "\n" +
                "4. Product CRUD";
    }
}