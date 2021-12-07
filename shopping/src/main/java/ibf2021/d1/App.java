package ibf2021.d1;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class App 
{
    public static void main(String[] args) {
        
        if (args.length == 0)
        {
            createDir("db");
        }
        else if (args.length == 1)
        {
            createDir(args[0]);
        }
        else
        {
            System.out.println("Invalid folder specified");
            System.exit(1);
        }

        Scanner scan = new Scanner(System.in);
        Cart cart = new Cart();
        
        while (true) {
            String action = scan.next();
            if (action.equals("list"))
                cart.show();
            else if (action.equals("add")) {
                if (scan.hasNextLine())
                    cart.addItems(scan.nextLine().trim());
            }
            else if (action.equals("delete")) {
                if (scan.hasNextInt())
                    try {
                        cart.delete(scan.nextInt());
                    } catch (IndexOutOfBoundsException e) {
                        System.out.println("Incorrect item index");
                    }
                else
                    System.out.println(scan.nextLine() + " is not a valid index number");
            }
            else if (action.equals("stop"))
                break;
        }
        
        scan.close();
    }

    public static void createDir(String foldername)
    {
        String wkgDir = Paths.get("").toAbsolutePath().toString();
        String newDir = wkgDir + "/" + foldername;
        Path path = Paths.get(newDir);
        // System.out.println(Files.exists(path));
        if (!Files.exists(path))
            try {
                Files.createDirectories(path);
                System.out.println("Directory is created!");
            } catch (IOException e) {
                System.out.println("Failed to create directory! " + e.getMessage());
            }
        else
            System.out.println("The directory path " + wkgDir + " already exists!");
    }
}
