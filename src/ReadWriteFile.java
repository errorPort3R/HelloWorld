import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/**
 * Created by jeffryporter on 5/25/16.
 */
public class ReadWriteFile
{
    public static void main(String[] args) throws Exception
    {
        File f = new File("names.txt");

            FileWriter fw = new FileWriter(f);
            fw.write("Alice\n"); //will overwrite the file if it exists
            fw.append("Bob\n");
            fw.append("Charlie\n");
            fw.close();

            Scanner scanner = new Scanner(f);
            while (scanner.hasNext());
            {
                System.out.println(scanner.nextLine());
            }

            //read entire file
            scanner = new Scanner(f);
            scanner.useDelimiter("\\Z");
            System.out.println(scanner.next());
    }
}
